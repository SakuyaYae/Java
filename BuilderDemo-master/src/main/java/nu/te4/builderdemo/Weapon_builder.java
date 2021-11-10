/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author SakuyaYae
 */
public class Weapon_builder {
    private String name; 
    private int durability;
    private int strength; 
    private double weight;

    public String getName() {
        return name;
    }

    public Weapon_builder Name(String name) {
        this.name = name;
        return this;
    }

    public int getDurability() {
        return durability;
    }

    public Weapon_builder Durability(int durability) {
        this.durability = durability;
        return this;
    }

    public int getStrength() {
        return strength;
    }

    public Weapon_builder Strength(int strength) {
        this.strength = strength;
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public Weapon_builder Weight(double weight) {
        this.weight = weight;
        return this;
    }
    public Weapon build(){
        if(name == null){throw new IllegalStateException("Weapon needs a name");}
        if(durability <= 0){throw new IllegalStateException("weapon cant have 0 or less durabilety");}
        if(strength < 0){strength = 0;}
        if(weight < 0){weight = 0;}
        return new Weapon(this);
    }
     
}
