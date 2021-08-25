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
public class House {
    protected int nr_of_floors;
    protected String adress;
    protected double lenth;
    protected double with;
    
   
    public House(){
        this.nr_of_floors = 10;
        this.adress = "Akihabara";
        this.lenth = 10.5;
        this.with = 15.4;
    } 
    
    
    public double calc_area(double lenth, double with){
        double area;
        area = lenth + with;
        return area;
        
    }
    
}
