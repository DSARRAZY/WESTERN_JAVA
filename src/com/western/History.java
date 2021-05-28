package com.western;

public class History {

    public static void main(String[] args) {

        Human human = new Human("Lucky Luke");
        human.introduceHimself();
        human.drink();

        Lady lady = new Lady("Lady Marianne");
        lady.introduceHimself();
        lady.changeDress("rouge");
        System.out.println("Quelle est votre nom ? "+ lady.sayName());

        Thief thief = new Thief ("Pat Hibulaire");
        thief.introduceHimself();
        System.out.println("Quelle est votre nom ? "+ thief.sayName());
        //thief.kidnap(lady);

        Barman barman = new Barman("Jack");
        barman.introduceHimself();;
        barman.serve(human);

        Sheriff Clint = new Sheriff("Clint");
        Clint.introduceHimself();;
        Clint.search(thief);







    }
}
