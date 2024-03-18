package com.bogdan.demo;

import lombok.Data;

@Data
public class Orange extends Fruit {
    public int getWeight() {
        return 8;
    }
}
