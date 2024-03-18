package com.bogdan.demo;

import lombok.Data;

@Data
public class Apple extends Fruit {
    public int getWeight() {
        return 5;
    }
}
