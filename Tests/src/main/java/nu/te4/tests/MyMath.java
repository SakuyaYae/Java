/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.tests;

/**
 *
 * @author Daniel
 */
public class MyMath {
    
    public int add(String a, String b){       
        int tal1, tal2; 
        try {
            tal1 = Integer.parseInt(a);
            tal2 = Integer.parseInt(b);
            return tal1+tal2;
        } catch (Exception e) { //Vilket exceptions är det vi får här? kan förbättras.
            throw new NumberFormatException("Du måste ha siffror");
        }
    }
    
    public boolean isEqual(int a, int b){
        return a == b;
    }
    
    public int difference(int a, int b){
        
        int res = 0;
        if(a == 4){
           res = a - b;
           
            
        }
        
        if(b == 4){
         res = b - a;
        }    
         
        return res;
    }
    
    public int difference(String a,String b){
        
        int res = 0;
        
        
           int tal1, tal2; 
        try {
            tal1 = Integer.parseInt(a);
            tal2 = Integer.parseInt(b);
            
            
             
        if(tal1 == 4){
           res = tal1 - tal2;
           
            
        }
        
        if(tal2 == 4){
         res = tal2 - tal1;
        }    
         
        return res;

        } catch (Exception e) { //Vilket exceptions är det vi får här? kan förbättras.
            throw new NumberFormatException("Du måste ha siffror");
        }
    }

}
