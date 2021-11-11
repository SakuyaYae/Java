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
public class Armor_builder {
   private String name;
   private int durability;
   private int defence; 
   
   
    public String getName() {
        return name;
    }

    public Armor_builder name(String name) {
        this.name = name;
        return this;
    }
    
    public int getDurability() {
        return durability;
    }
   
    public Armor_builder durability(int durability) {
        this.durability = durability;
        return this;
    }
    
    public int getDefence() {
        return defence;
    }
   
    public Armor_builder defence(int defence) {
        this.defence = defence;
        return this;
    }
   
    public Armor build(){
        if(name == null){throw new IllegalStateException("Armor needs a name");}
        if(durability <= 0){throw new IllegalStateException("Armor cant have 0 or less durabilety");}
        if(defence < 0){defence = 0;}
        return new Armor(this);
    }
}
