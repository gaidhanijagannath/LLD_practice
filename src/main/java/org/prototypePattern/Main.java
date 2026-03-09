package org.prototypePattern;

public class Main {

    public static void main(String[] args) {

        Employee1 emp1 = new Employee1("John", "IT");

        Employee1 emp2 = (Employee1) emp1.clone();

        emp1.showDetails();
        emp2.showDetails();
    }
}