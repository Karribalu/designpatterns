package org.bala.CreationalDesignPatterns.SingletonPattern.WithSingletonPattern;

public class Main {
    public static void main(String[] args) {
        AppSettingsII appSettingsII = AppSettingsII.getInstance();
        AppSettingsII appSettingsII1 = AppSettingsII.getInstance();

        System.out.println(appSettingsII == appSettingsII1);
    }
}
