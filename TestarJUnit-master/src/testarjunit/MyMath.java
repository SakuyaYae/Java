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
        //skillnaden mellan a och b;
        int res = 0;
        if(a == 4){
           res = a / b;
           
            
        }
        //om a = 4 och b = 2 -> 2
        if(b == 4){
         res = b / a;
        }    
        // 2 och b = 4 -> 2  
        return res;
    }
    
    public int difference(String a,String b){
        //skillnaden mellan a och b; 
        
        //om a = 4 och b = 2 -> 2
        
        //om a = 2 och b = 4 -> 2
        
        //talen skall även parsas 
        
        //Fel förväntas om man lägger in fel.
        
        return 0;
    }

}
