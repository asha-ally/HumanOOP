package com.example.humanoop;

public class Anna extends Human {
    private int height;

    public Anna(String name, int weight, int age) {
        super(name, weight, age);
    }

    public Anna(String name, int weight, int age, int height) {
        super(name, weight, age);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
        super.eat();
        int weight=getWeight();
        weight=weight+2;
        setWeight(weight);

    }

    @Override
    public void birthday() {
        int age=getAge();
        age=age+4;
        setAge(age);
    }
}
