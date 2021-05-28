package com.western;

public class Corrupted extends Sheriff implements Outlaw{


    public Corrupted(String name) {
        super(name);
    }

    @Override
    public String sayName() {
        return null;
    }

    @Override
    public void kidnap(Lady lady) {

    }

    @Override
    public void jailled(Cowboy cowboy) {

    }

    @Override
    public int getRewardValue() {
        return 0;
    }
}
