package com.company;

public class Boss {
    private int health;
    private int damage;
    private String superpowers;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperpowers() {
        return superpowers;
    }

    public void setSuperpower(String superpowers) {
        this.superpowers = superpowers;
    }

    public Boss() {
        this.health = health;
        this.damage = damage;
        this.superpowers = superpowers;
    }

    private Hero healthHero;

}