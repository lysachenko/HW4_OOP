package com.lysachenko.shop;

public class Customer {

    private String name;
    private int age;
    private double balance;

    public Customer(String name, int age, double balance) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be over then 0");
        }
        if (balance < 0) {
            throw new IllegalArgumentException("Balance can not be less then 0");
        }
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be over then 0");
        } else {
            this.age = age;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance can not be less then 0");
        } else {
            this.balance = balance;
        }
    }
}
