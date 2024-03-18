package com.bogdan.demo;

import lombok.Data;

import java.util.*;

@Data
public class Box <T extends Fruit> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }
    public double getWeight() {
        double weight = 0;
        for (T fruit : this.fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }
    public boolean compare(Box<?> anotherBox) {
        return this.getWeight() == anotherBox.getWeight();
    }
    public void transferFruits(Box<T> anotherBox) {
        if (this.fruits.isEmpty()) {
            System.out.println("нет фруктов");
            return;
        }
        if (this.fruits.getClass() != anotherBox.fruits.getClass()) {
            System.out.println("разные фрукты");
            return;
        }
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
