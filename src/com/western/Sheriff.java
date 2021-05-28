package com.western;

public class Sheriff extends Cowboy{

    private int nbArrest;
    private String adjective;

    public Sheriff(String name){
        super(name);
        this.nbArrest=0;
        this.adjective= "honnete";
    }


    public void search (Thief thief){
        System.out.println(this.getName()+" placarde une affiche dans toute la ville");
        this.talk("OYEZ OYEZ BRAVE GENS!! "+"200 "+"$ à qui arretera "+ thief.sayName()+" le brigand mort ou vif!");
    }

    @Override
    public void introduceHimself() {
        super.introduceHimself();
        this.talk("j'ai deja coffré "+ this.nbArrest);
    }

    @Override
    protected String sayName() {
        return "Sheriff "+super.sayName();
    }

}
