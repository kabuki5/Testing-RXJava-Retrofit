package com.kabuki5.testingrxjava.models;

/**
 * Created by Kabuki on 08/04/2017.
 * Optimus Mobile Engineering
 */

public class Character {

    private String name;
    private int strength;
    private int speed;
    private int life;
    private boolean hasShield;

    public Character(String name, int strength, int speed, int life, boolean hasShield) {
        this.name = name;
        this.strength = strength;
        this.speed = speed;
        this.life = life;
        this.hasShield = hasShield;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public boolean isHasShield() {
        return hasShield;
    }

    public void setHasShield(boolean hasShield) {
        this.hasShield = hasShield;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", strength=" + strength +
                ", speed=" + speed +
                ", life=" + life +
                ", hasShield=" + hasShield +
                '}';
    }
}
