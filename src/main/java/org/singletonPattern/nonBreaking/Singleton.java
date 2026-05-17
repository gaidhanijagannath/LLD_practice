package org.singletonPattern.nonBreaking;

public enum Singleton {
    INSTANCE;
     /*Meaning:
            JVM creates exactly one INSTANCE object
            nobody can create another
            Singleton.INSTANCE=One Global Object.
      */

    public void someMethod() {
        // Implementation of the method
        System.out.println("Executing some method in Singleton instance.");

        // random commit from personal laptop
    }
}
