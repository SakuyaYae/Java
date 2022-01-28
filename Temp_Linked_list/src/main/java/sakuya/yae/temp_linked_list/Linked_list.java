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
public class Linked_list {
    Node head;
    private int node_count = 0;
    
    public void add_node(int data){
        if(node_count == 0){
            head = new Node(data);
        }
        else{
            Node current_node = head;
            while(current_node.next != null){
                current_node = current_node.next;
            }
            
            Node node = new Node(data);
            current_node.next = node;
        }
        node_count++;
    }
    public void add_new_first_node(int data){
        if(node_count == 0){
            head = new Node(data);
        }
        else{
            Node node = new Node(data);
            Node pre_head = head;
            head = node;
            Node current_node = head;
            current_node.next = pre_head;
        }
        node_count++;
        }
    
    
    public void remove_node(){
        if(node_count == 0){
            System.out.println("Error: cant remove node when there are none");
        }
        else{
            Node current_node = head;
            while(current_node.next.next != null){
                current_node = current_node.next;
            }
            current_node.next = null;
            node_count--;
        }
    }
    

    public void remove_first_node(){
        if(node_count == 0){
            System.out.println("Error: cant remove node when there are none");
        }
        else{
            Node pre_head = head;
            Node new_head = head.next;
            head = new_head;
            head.next = new_head.next;

            pre_head = null;
            node_count--;
        }
    }
    
    public void print(){
        System.out.println(String.format("Number of nodes: %d", node_count));
            Node current_node = head;
            while(current_node != null){
                System.out.println(current_node.data); 
                current_node = current_node.next;
            }
            
    }
}
