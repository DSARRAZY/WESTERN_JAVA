package com.western;

public class Barman extends Human {

    private String barName;

    public Barman(String name) {
        super(name);
        this.favoriteDrink = "Vin";
        this.barName= "Chez " + this.getName();
    }

    public Barman(String name, String barName) {
        super(name);
        this.barName = "Chez " + barName;
    }

    public void serve(Human human) {
        this.talk("je vous sers un verre de " + human.favoriteDrink);
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("Bienvenue " + this.barName);
    }

    @Override
    public void talk(String text) {
        super.talk(text + " Coco.");
    }


}
