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
public class School extends House {
    private int class_rome;
    
    public School(){
        super.nr_of_floors = 4;
        super.adress = adress;
        super.lenth = 140.9432;
        super.with = 100.44;
        this.class_rome = 40;
    }
    
   
    public double avrage_area(){
      double area = super.calc_area(lenth, with);
      double avrage = class_rome / area;
      return avrage;
    }
    
    public double avrage_rome(){
       double avrage = class_rome / nr_of_floors;
       return avrage;
    }
    
}
