package com.western;

public class Brigand extends Humain {

    private String look = "méchant";
    private int damesEnleves;
    private int recompence = 100;
    private boolean prison;

    // Constructeur
    public Brigand(String unNom, String uneBoissonFavorite, String unLook, int nbDamesEnleves, int uneRecompense, boolean laPrison)
    {
        super(unNom, uneBoissonFavorite);
        this.look = unLook;
        this.damesEnleves = nbDamesEnleves;
        this.recompence = uneRecompense;
        this.prison = laPrison;
    }

    // Méthodes
    public String kidnapperDame(Dame uneDame)
    {
        this.damesEnleves ++;
        return "Ah ah ! " + uneDame.quelEstTonNom() + ", tu est mienne désormais !";
    }

    public String emprisonner(Cowboy unCowboy)
    {
        this.prison = true;
        return "Damned, je suis fait ! " + unCowboy.quelEstTonNom() + ", tu m'as eu !";
    }
}

