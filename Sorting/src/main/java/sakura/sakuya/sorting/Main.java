/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.sorting;

import java.util.Random;

/**
 *
 * @author SakuyaYae
 */
public class Main {
     public static void main(String[] args) {
         System.out.println("Sakura");
         Random rand = new Random();
         
         
         int sakura[];
         sakura = new int[10];
         
         int yuki = sakura.length;
         
         
         for(int i = 0; i < sakura.length; i++ ){
            sakura[i] = rand.nextInt();
         }
         Shell_sort shell = new Shell_sort();
         Insertion_sort insert = new Insertion_sort();
         Bubble_sort bubbles = new Bubble_sort();
         
  
         bubbles.bubble(sakura);
         insert.Insertion_sorting(sakura);
         shell.shell_sorting(sakura, yuki);
                     
         
     
     }
}
