package org.singletonPattern;

public final class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

        //to tackle the obj creation from reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void doSomething() {
        // example instance method
        System.out.println("Singleton instance in use.");
    }
}
