package org.prototypePattern;

class Employee implements Cloneable {

    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}