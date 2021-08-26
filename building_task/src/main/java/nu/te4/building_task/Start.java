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
public class Start {
      public static void main(String[] args){
      
            House home = new House();
            School darkness = new School();
          
            Rottweiler dogo = new Rottweiler();
            Dobberman dogy = new Dobberman();
            
            System.out.println("");
            System.out.println("");
            
            dogo.bark();
            dogo.eat();
            dogo.guard();
            dogo.sleep();
            
            System.out.println("");
            System.out.println("");
            
            dogy.bark();
            dogy.eat();
            dogy.guard();
            dogy.sleep();
            
            System.out.println("");
            System.out.println("");
      
      }
}
