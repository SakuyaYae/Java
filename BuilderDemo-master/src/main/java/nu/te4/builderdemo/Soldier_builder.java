/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

import java.util.List;

/**
 *
 * @author SakuyaYae
 */
public class Soldier_builder {
     private String name; 
    private int health; 
    private int age;
    private List<Armor> armors; 
    private Weapon weapon;

    public String getName() {
        return name;
    }

    public Soldier_builder Name(String name) {
        this.name = name;
        return this;
    }

    public int getHealth() {
        return health;
    }

    public Soldier_builder Health(int health) {
        this.health = health;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Soldier_builder Age(int age) {
        this.age = age;
        return this;
    }

    public List<Armor> getArmors() {
        return armors;
    }

    public Soldier_builder Armors(List<Armor> armors) {
        this.armors = armors;
        return this;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public Soldier_builder Weapon(Weapon weapon) {
        this.weapon = weapon;
        return this;
    }
    
        public Soldier build(){
            if(name == null){throw new IllegalStateException("Soldier needs a name");}
            if(health <= 0){throw new IllegalStateException("Soldier cant have 0 or less health");}
            if(age < 10){age = 10;}
        return new Soldier(this);
    }
}
