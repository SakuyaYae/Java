/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

/**
 *
 * @author TE4-Lärardator
 */
public class Armor {
   private String name;
   private int durability;
   private int defence; 
   
    public Armor(Armor_builder gen) {
        this.name = gen.getName();
        this.durability = gen.getDurability();
        this.defence = gen.getDefence();
    }
    @Override
    public String toString(){
        String dur = Integer.toString(durability);
        String def = Integer.toString(defence);
        String res = name + " " + dur + " " + def;
        return res;
       }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
     public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }
     public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
}
