/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.builderdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author SakuyaYae
 */
public class Run {
    public static void main(String[] args) {
        
        Armor steel = new Armor_builder().name("Steel Armor").durability(100).defence(25).build();
        Armor darkness = new Armor_builder().name("Armor of darkness").durability(5000).defence(500).build();
        Armor sakura_armor = new Armor_builder().name("Armor of Sakura").durability(44000000).defence(4444).build();
        
        List<Armor> steel_gear = new ArrayList<>();
        steel_gear.add(steel);
        
        List<Armor> dark_gear = new ArrayList<>();
        dark_gear.add(steel);
        dark_gear.add(darkness);
        
        List<Armor> sakura_gear = new ArrayList<>();
        sakura_gear.add(darkness);        
        sakura_gear.add(sakura_armor); 
        
        Weapon dark_steel_sword = new Weapon_builder().Name("Dark steel Sword").Durability(256).Strength(40).Weight(30.0).build();
        Weapon katana_darkness = new Weapon_builder().Name("Bringer of Darkness").Durability(4000).Strength(800).Weight(40.0).build();
        Weapon sakura_blossom = new Weapon_builder().Name("Sakura blossom").Durability(440000000).Strength(4444).Weight(44.0).build();
        
        Soldier dark = new Soldier_builder().Name("Garo").Health(400).Age(29).Weapon(dark_steel_sword).Armors(steel_gear).build();
        Soldier empress = new Soldier_builder().Name("Sanaki").Health(2847).Age(20).Weapon(katana_darkness).Armors(dark_gear).build();
        Soldier sakura = new Soldier_builder().Name("Sakuya").Health(44000000).Age(4444).Weapon(sakura_blossom).Armors(sakura_gear).build();
        
       
        
        
        
        
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(String.format("%s %d, %d", steel.getName(), steel.getDurability(), steel.getDefence()));
        System.out.println("");
        System.out.println(String.format("%s %d, %d", darkness.getName(), darkness.getDurability(),darkness.getDefence()));
        System.out.println("");
        System.out.println(String.format("%s %d, %d", sakura_armor.getName(), sakura_armor.getDurability(), sakura_armor.getDefence()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(String.format("%s %d, %d, %f", dark_steel_sword.getName(), dark_steel_sword.getDurability(), dark_steel_sword.getStrength(), dark_steel_sword.getWeight()));
        System.out.println("");
        System.out.println(String.format("%s %d, %d, %f", katana_darkness.getName(), katana_darkness.getDurability(), katana_darkness.getStrength(), katana_darkness.getWeight()));
        System.out.println("");
        System.out.println(String.format("%s %d, %d, %f", sakura_blossom.getName(), sakura_blossom.getDurability(), sakura_blossom.getStrength(), sakura_blossom.getWeight()));
        
        System.out.println("");
        System.out.println("");
        
        System.out.println(String.format("%s %d, %d %s %s", dark.getName(), dark.getHealth(), dark.getAge(), dark.getWeapon().toString(),dark.getArmors().get(0).toString() ));
        System.out.println("");
        System.out.println(String.format("%s %d, %d %s %s", empress.getName(), empress.getHealth(), empress.getAge(), empress.getWeapon().toString(), empress.getArmors().get(1).toString() ));
        System.out.println("");
        System.out.println(String.format("%s %d, %d %s %s", sakura.getName(), sakura.getHealth(), sakura.getAge(), sakura.getWeapon().toString(), sakura.getArmors().get(1).toString() ));        
    }
}
