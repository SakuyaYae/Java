/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.first_project;
import java.util.Random;
/**
 *
 * @author Elev
 */
public class Player {
      Random rand = new Random(); 
    
    private String name;
     private int dmg = rand.nextInt(1000);
     private int hp;

    
   
public Player(String name,int hp){
     this.name = name;
     this.dmg = dmg;
     this.hp = hp;
}

public String getName(){
    return name;
 }

public void setName(String name){
    this.name = name;
 }

public int getDmg(){
    return dmg;
 }

public void setDmg(int dmg){
    this.dmg = dmg;
 }
    public int getHp(){
    return hp;
 }

public void setHp(int hp){
    this.hp = hp;
 }
}
