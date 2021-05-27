package com.western;

public class Histoire {

    public static void main(String[] args) {
	// write your code here

        Humain personnage = new Humain("Lucky Luke","coca cola");
        System.out.println(personnage.presentation());
        System.out.println(personnage.boire());

        Brigand personnage2 = new Brigand("Joe Dalton","whisky", "cool",1,50,false);
        System.out.println(personnage2.presentation());

        Cowboy personnage3 = new Cowboy("Alfred","vin",0,"vaillant");
        System.out.println(personnage3.presentation());

        Dame personnage4 = new Dame ("Lady Marianne", "eau gazeuse","rose","libre");
        System.out.println(personnage4.presentation());

    }
}
