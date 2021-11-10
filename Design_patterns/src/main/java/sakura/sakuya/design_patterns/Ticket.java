/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.design_patterns;

/**
 *
 * @author SakuyaYae
 */
public class Ticket {
    private int posision = 1;
    private static Ticket instance;
    
    private Ticket(){
    }
    
    public static Ticket get_instance(){
        if(instance == null){
            instance = new Ticket();
        }
        return instance;
    }
    public int get_posision(){
        int pos = posision;
        posision++;
     
        return pos;
    }
}
