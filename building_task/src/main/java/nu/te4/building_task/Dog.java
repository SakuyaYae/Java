/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.building_task;

/**
 *
 * @author Elev
 */
public abstract class Dog {
    
    protected String Breed;
    
    public Dog(){
    this.Breed = Breed;
    }
    
    public void eat(){
        System.out.println(String.format(Breed, " Eats"));
    }
    
     public void sleeps(){
        System.out.println(String.format(Breed, " Sleeps"));
    }
}
