package com.western;

public class Dame extends Humain {

    private String nom;
    private String couleurRobe;
    private String etat;

    // Constructeur
    public Dame(String unNom, String uneBoisson, String uneCouleurRobe, String unEtat) {
        super(unNom, uneBoisson);
        couleurRobe = uneCouleurRobe;
        etat = unEtat ;
    }

    // Méthodes
    public void parleDame(String texte) {
        System.out.println(nom+" - "+texte);
    }

    public String kidnapper() {
        return "On me kidnappe, au secours !!!";
    }

    public String couleurDeLaRobe() {
        return "Regardez ma nouvelle robe" + couleurRobe + "!";
    }


}
