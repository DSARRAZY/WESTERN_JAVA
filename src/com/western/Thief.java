package com.western;

public class Thief extends Human  {

    private String look;
    private int nbKidnappedLadies;
    private int rewardValue;
    private boolean isInJail;

    public Thief(String name) {
        super(name);
        this.favoriteDrink="tord boyaux";
        this.look = "méchant";
        this.nbKidnappedLadies = 0;
        this.rewardValue = 100;
        this.isInJail = false;
    }

    @Override
    public String sayName() {
        return super.sayName() + " " + "le "+ this.look ;
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("j'ai l'air "+this.look+ " et j'ai déjà kidnappé "+ this.nbKidnappedLadies+ " dames");
        this.talk("ma tête est mise à prix à "+this.rewardValue+ "$");
    }

}

