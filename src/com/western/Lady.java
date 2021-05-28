package com.western;

public class Lady extends Human {

    private String dressColor;
    private boolean isCaptive;

    public Lady(String name) {
        super(name);
        this.favoriteDrink="lait";
        this.dressColor="orange";
    }

    public void beKidnapped(Thief thief) {
        this.talk("'Hurle'");
        this.isCaptive = true;
    }

    public void beFree(Cowboy cowboy) {
        this.talk("Merci " + cowboy.getName());
        this.isCaptive = false;
    }

    public void changeDress(String color) {
        this.dressColor = color;
        this.talk("Regardez ma nouvelle robe " + color + " !");
    }

    public boolean isCaptive() {
        return isCaptive;
    }

    @Override
    protected String sayName() {
        return "Miss " +  super.sayName();
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("Regardez ma jolie robe "+this.dressColor);
    }

}
