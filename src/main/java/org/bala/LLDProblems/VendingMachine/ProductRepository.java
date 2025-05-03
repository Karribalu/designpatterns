package org.bala.LLDProblems.VendingMachine;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class ProductRepository {
    private final Map<Integer, Slot> slots;

    public ProductRepository() {
        this.slots = new ConcurrentHashMap<>();
    }

    public void addSlot(Slot slot) {
        slots.put(slot.getProduct().getId(), slot);
    }

    public Optional<Slot> getSlotByProductId(int productId) {
        return Optional.ofNullable(this.slots.get(productId));
    }

    public Map<Integer, Slot> getAllSlot() {
        return slots;
    }

    public void restockProduct(int id, int qty) {
        if (!slots.containsKey(id)) {
            throw new IllegalStateException("There is no slot for product");
        }
        this.slots.get(id).addStock(qty);
    }
}
