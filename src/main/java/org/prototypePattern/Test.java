package org.prototypePattern;

public class Test {
    public static void main(String[] args) throws Exception {

        Employee e1 = new Employee("Jaggu");

        Employee e2 = (Employee) e1.clone();

        System.out.println(e1.name);
        System.out.println(e2.name);
    }
}