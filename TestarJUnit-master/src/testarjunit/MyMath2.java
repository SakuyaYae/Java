/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testarjunit;

/**
 *
 * @author Daniel
 */
public class MyMath2 {
    
        
    public double convertToFarenheit(double c){
        if(c<-273.15){
            throw new IllegalArgumentException("Temperature cant be lower than 0 Kelvin.");
        }            
         double f = 1.8*c + 32;
        return f; 
    }
    
    public int compareTo(int a, int b){
        
        //om a > b --> 1
        
        //om a == b --> 0
        
        //om a < b --> -1
        return 0; 
    }
    
}
