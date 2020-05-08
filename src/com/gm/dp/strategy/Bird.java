package com.gm.dp.strategy;

public class Bird extends Animal{

    public Bird(){
        super();
        flyingType = new ItFlys();
    }
}
