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
public class Main {
    public static void main(String[] args){
        int ticket = Ticket.get_instance().get_posision(); 
        System.out.println(ticket);
        System.out.println(Ticket.get_instance().get_posision());
    
    }
}
