package org.bala.LLDProblems.VendingMachine;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.locks.ReentrantLock;

// Single tone pattern
public class VendingMachine {
    private static final VendingMachine INSTANCE = new VendingMachine();
    private CashRepository cashRepository;
    private ProductRepository productRepository;
    private VendingMachineState vendingMachineState;
    private final PaymentProcessor paymentProcessor;
    private static VendingMachine instance = new VendingMachine();
    private ReentrantLock lock;
    private Product selectedProduct = null;

    private VendingMachine() {
        this.cashRepository = new CashRepository();
        this.paymentProcessor = new PaymentProcessor();
        this.productRepository = new ProductRepository();
        this.vendingMachineState = new IdleState(this);
        this.lock = new ReentrantLock();
    }

    public static VendingMachine getInstance() {
        return INSTANCE;
    }

    public void selectProduct(int product) {
        lock.lock();
        try {
            this.vendingMachineState.selectProduct(product);
        } finally {
            lock.unlock();
        }
    }

    public void insertMoney(Money m) {
        lock.lock();
        try {
            this.vendingMachineState.insertMoney(m);
        } finally {
            lock.unlock();
        }
    }

    public void cancel() {
        lock.lock();
        try {
            this.vendingMachineState.cancel();
        } finally {
            lock.unlock();
        }
    }

    public void dispense() {
        lock.lock();
        try {
            this.vendingMachineState.dispense();
            System.out.println("Item being dispenced");
        } finally {
            lock.unlock();
        }
    }

    void internalSelect(int id) {
        Slot slot = productRepository.getSlotByProductId(id).orElseThrow(() -> new NoSuchElementException("Product Not found"));
        if (slot.getQuantity().getAcquire() <= 0) {
            throw new IllegalStateException("Out of stock");
        }
        this.selectedProduct = slot.getProduct();
    }

    void internalInsertMoney(Money m) {
        this.paymentProcessor.insert(m.getValue());
        this.cashRepository.deposit(m);
    }

    void internalDispense() {
        Slot slot = productRepository.getSlotByProductId(selectedProduct.getId()).get();
        slot.decrement();

        double price = slot.getProduct().getPrice();
        paymentProcessor.withdraw(price);
        double change = paymentProcessor.getBalance() - price;
        List<Money> changeDenom = getChange(change);
        changeDenom.forEach(cashRepository::withdraw);
        paymentProcessor.reset();
        selectedProduct = null;
    }

    List<Money> getChange(double balance) {
        return List.of(Coin.NICKEL);
    }

    void resetSelection() {
        this.selectedProduct = null;
    }

    public void setState(VendingMachineState s) {
        this.vendingMachineState = s;
    }

    void internalCancel() {
        this.selectedProduct = null;
        this.setState(new IdleState(this));
    }

    void returnMoney() {
        if (this.paymentProcessor.getBalance() > 0) {
            System.out.println("Dispencing the amount ");
        }
        this.paymentProcessor.reset();
    }

    double getBalance() {
        return this.paymentProcessor.getBalance();
    }

    Product getSelectedProduct() {
        return selectedProduct;
    }

    public void restockProduct(int id, int qty) {
        this.productRepository.restockProduct(id, qty);
    }

    public Map<String, Integer> collectAllCash() {
        var cash = this.cashRepository.getCashInventory();
        this.cashRepository.getCashInventory().clear();
        return cash;
    }

    public CashRepository getCashRepository() {
        return cashRepository;
    }

    public ProductRepository getProductRepository() {
        return productRepository;
    }
}
