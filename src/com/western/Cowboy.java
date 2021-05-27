package com.western;

public class Cowboy extends Humain{

    private String nom;
    private int popularite;
    private String adjectif = "vaillant";

    // Constructeur
    public Cowboy(String unNom, String uneBoisson, int unePopularite, String unAdjectif) {
        super(unNom, uneBoisson);
        nom = unNom;
        popularite = unePopularite;
        adjectif = unAdjectif;
    }

    // Méthodes
    public String libererDame(Dame UneDame) {
        return "Je me suis débarrasser de lui, vous êtes libre maintenant.";
    }

    public String tirerBrigand(Brigand unBrigand) {
        return "Le " + adjectif + " " + nom + "tire sur " + unBrigand.quelEstTonNom() +". PAN !";
        //return "Prend ça, rascal !";
    }

}
