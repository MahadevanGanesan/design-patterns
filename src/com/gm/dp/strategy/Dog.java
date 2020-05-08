package com.gm.dp.strategy;

public class Dog extends Animal{
    public Dog(){
        super();
        flyingType = new CantFly();
    }
}
