package com.company;

public class createHeroes {
    int health;
    String damage;
    double superpowers;

    public createHeroes(int theHealth, String theDamage, double theSuperpowers) {
        health = theHealth;
        damage = theDamage;
        superpowers = theSuperpowers;
    }

    public int getHealth() {
        return health;
    }

    public String getDamage() {
        return damage;
    }

    public double getSuperpowers() {
        return superpowers;
    }
}
