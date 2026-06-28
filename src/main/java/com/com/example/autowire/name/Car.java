package com.com.example.autowire.name;

public class Car {
    private Specification specification;

    private Specification specification1;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }
    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }

    public void displayDetails(){
        System.out.println("Car Details: " + specification.toString());
        System.out.println("Car Details: " + specification1.toString());
    }


}
