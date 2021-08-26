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
public class Rottweiler extends Dog implements IGuardable{
    public Rottweiler(){
    super.Breed = "Rottweiler";
    
    }

    @Override
    public void guard() {
        System.out.println(String.format(Breed + " is guarding"));
    }

    @Override
    public void bark() {
        System.out.println(String.format(Breed + " barks"));
    }
    
    
}
