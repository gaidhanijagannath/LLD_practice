package org.prototypePattern;

public class Employee1 implements Prototype {

    private String name;
    private String department;

    public Employee1(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public Prototype clone() {
        return new Employee1(this.name, this.department);
    }

    public void showDetails() {
        System.out.println("Name: " + name + ", Department: " + department);
    }
}