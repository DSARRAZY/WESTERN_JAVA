package com.western;

public class History {

    public static void main(String[] args) {

        Human human = new Human("Lucky Luke");
        Lady lady = new Lady("Lady Marianne");
        Lady lady2 = new Lady("Lady Annabelle");
        Cowboy cowboy = new Cowboy("Louis");
        Barman barman = new Barman("Jack");
        Sheriff sheriff = new Sheriff("Bob");
        Thief thief = new Thief ("Pat Hibulaire");
        Cowboy Clint = new Sheriff ("Clint");

        thief.kidnap(lady);
        thief.kidnap(lady2);
        thief.introduceHimself();
        cowboy.shootThief(thief);
        thief.jailled(cowboy);
        cowboy.freeLady(lady);
        lady.beFree(cowboy);
        cowboy.introduceHimself();



////        human.introduceHimself();
////        human.drink();
////        lady.introduceHimself();
////        lady.changeDress("rouge");
////        System.out.println("Quelle est votre nom ? "+ lady.sayName());
////        cowboy.introduceHimself();
////        thief.introduceHimself();
////        System.out.println("Quelle est votre nom ? "+ thief.sayName());
////        thief.jailled(cowboy);
////        cowboy.shootThief(thief);
////        barman.introduceHimself();;
////        barman.serve(human);
//          sheriff.introduceHimself();;
//          sheriff.search(thief);







    }
}
