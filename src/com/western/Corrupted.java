package com.western;

public class Corrupted extends Sheriff implements Outlaw{

    private String look;
    private int nbKidnappedLadies;
    private int rewardValue;
    private boolean isInJail;

    public Corrupted(String name) {
        super(name);
    }

    public boolean getisInJail() {
        return isInJail;
    }
    @Override
    public String sayName() {
        return super.sayName() + " " + this.look ;
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("j'ai l'air "+this.look+ " et j'ai déjà kidnappé "+ this.nbKidnappedLadies+ " dames");
        this.talk("ma tête est mise à prix à "+this.rewardValue+ "$");
    }

}
