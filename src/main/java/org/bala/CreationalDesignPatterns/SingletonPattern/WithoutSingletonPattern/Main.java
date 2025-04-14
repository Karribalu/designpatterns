package org.bala.CreationalDesignPatterns.SingletonPattern.WithoutSingletonPattern;

public class Main {
    public static void main(String[] args) {
        AppSettings settings1 = new AppSettings();
        AppSettings settings2 = new AppSettings();

        System.out.println(settings2 == settings1);
    }
}
