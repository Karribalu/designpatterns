package org.bala.CreationalDesignPatterns.SingletonPattern.WithSingletonPattern;

public class AppSettingsII {
    private static AppSettingsII instance;
    public String dbKey;

    private AppSettingsII() {
        this.dbKey = "some";
    }

    public static AppSettingsII getInstance() {
        if (instance == null) {
            instance = new AppSettingsII();
        }
        return instance;
    }
}
