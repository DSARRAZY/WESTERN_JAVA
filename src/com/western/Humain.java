package com.western;

/**
 * classe Humain
 */
public class Humain {

    private String nom;
    private String boissonFavorite = "eau";

    // Constructeur
    public Humain(String unNom, String uneBoissonFavorite)
    {
        this.nom = unNom;
        this.boissonFavorite = uneBoissonFavorite;
    }

    // Méthodes
    public String parler(String texte)
    {
        return this.nom + " - " + texte;
    }

    public String quelEstTonNom()
    {
        return this.nom;
    }

    public String quelleEstTaBoisson()
    {
        return this.boissonFavorite;
    }
    public String presentation()
    {
        return "Bonjour, mon nom est "+quelEstTonNom()+" et ma boisson préferée est : "+quelleEstTaBoisson();
    }
    public String boire ()
    {
        return "Ah un bon verre de "+quelleEstTaBoisson()+" GLOUPS !";
    }

}
