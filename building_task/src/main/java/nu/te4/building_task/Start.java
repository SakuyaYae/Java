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
            
            Rektangel Tim = new Rektangel(60,30);
            Rektangel Sakura = new Rektangel(4,44);
            
            
            
            System.out.println("");
            System.out.println("");
            
            System.out.println(String.format("the area of tim is: %d", Tim.area()));
            
            System.out.println("");
            System.out.println("");
            
            System.out.println(String.format("the area of Sakura is: %d", Sakura.area()));
            
            System.out.println("");
            System.out.println("");
      
      }
}
