/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakuya.yae.temp_linked_list;

/**
 *
 * @author SakuyaYae
 */
public class Main {
    public static void main(String[] args) {
        
        Linked_list sakura = new Linked_list();
        sakura.add_node(5);
        sakura.add_new_first_node(4);
        sakura.remove_first_node();
        sakura.print();
    }
}
