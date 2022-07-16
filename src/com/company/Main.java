package com.company;


public class Main {

        public static Hero[] createHeroes() {


        Hero Harry = new Hero(90, 30,"Teleportation");
        Hero Tommy = new Hero(90, 30,"Black flame");
        Hero Alex = new Hero(90, 30);
        Hero John = new Hero(90,30);
        Hero[] createHeroes = new Hero[]{Harry, Tommy, Alex, John};
        return createHeroes;
    }


    public static void main(String[] args) {
        Boss evil = new Boss();
        evil.setHealth(300);
        evil.setDamage(50);
        evil.setSuperpower(" : The storm , Fire");
        System.out.println("Boss");
        System.out.println("Health: " + evil.getHealth());
        System.out.println("Damage: " + evil.getDamage());
        System.out.println("Superpowers" + evil.getSuperpowers());
        System.out.println("Heroes");


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHealth() + createHeroes()[i].getDamage() + createHeroes()[i].getSuperpowers());

        }
    }
}














