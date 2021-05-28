package com.western;

public class Cowboy extends Human {
    private int popularity;
    private String adjective;

    public Cowboy(String name) {
        super(name);
        this.favoriteDrink="whisky";
        this.popularity=0;
        this.adjective="Vaillant";
    }

    public void shootThief(Thief thief) {
        System.out.println("Le "+ this.adjective+" "+this.sayName() +" tire sur "+thief.sayName()+ " PAN!");
        this.talk("Prends ça rascal!");
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("je suis un cowboy "+this.adjective+"!");
        this.talk("Pour l'instant, j'ai une popularité de "+this.popularity+".");
    }

}
