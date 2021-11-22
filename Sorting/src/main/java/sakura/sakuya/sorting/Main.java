/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.sorting;

import java.time.Duration;
import java.time.Instant;
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
        sakura = new int[10000000];
         
        int yuki = sakura.length;
         
         
        for(int i = 0; i < sakura.length; i++ ){
            sakura[i] = rand.nextInt();
        }
        

        
        Shell_sort shell = new Shell_sort();
        Insertion_sort insert = new Insertion_sort();
        Bubble_sort bubbles = new Bubble_sort();
        Merge_sort merge = new Merge_sort();
        quicksort quick = new quicksort();
        
        Instant start = Instant.now();
        shell.shell_sorting(sakura, yuki); 
        Instant end = Instant.now();
        
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("shell sort 10 000 000");
        System.out.println(timeElapsed);
        
        
        // bubbles.bubble(sakura); not done
        // insert.Insertion_sorting(sakura);    10Mil elemnt tid: 3H29M2.3276041S
        //         
        // merge.Merge_sort(sakura, 0, yuki-1);
        // quick.quick_sorting(sakura, 0, yuki - 1);
        

    
     
     }
}
