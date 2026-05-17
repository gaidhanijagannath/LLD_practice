package org.singletonPattern;

import java.lang.reflect.Constructor;

public class SingletonMain {
    public static void main(String[] args) throws Exception {

        /*Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Hashcode of obj1: " + obj1.hashCode());
        System.out.println("Hashcode of obj2: " + obj2.hashCode());

        // to break the singleton pattern using reflection
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton obj3 = constructor.newInstance();

        System.out.println("Hashcode of obj3: " + obj3.hashCode());*/


        org.singletonPattern.nonBreaking.Singleton singleton = org.singletonPattern.nonBreaking.Singleton.INSTANCE;
        singleton.someMethod();

        SingletonBillPugh singletonBillPugh1 = SingletonBillPugh.getInstance();
        System.out.println("Hashcode of singletonBillPugh: " + singletonBillPugh1.toString());

        SingletonBillPugh singletonBillPugh2 = SingletonBillPugh.getInstance();
        System.out.println("Hashcode of singletonBillPugh2: " + singletonBillPugh2.toString());

        System.out.println("Are both instances the same? " + (singletonBillPugh1 == singletonBillPugh2));


    }
}
