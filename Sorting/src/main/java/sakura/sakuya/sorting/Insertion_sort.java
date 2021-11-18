/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.sorting;

/**
 *
 * @author SakuyaYae
 */
public class Insertion_sort {

    public Insertion_sort() {
    }
    
    
   public static void Insertion_sorting(int sakura[]){
       int len = sakura.length;
            
       for(int x = 1; x < len; x++){
            int num = sakura[x];
            int i = x-1;
            while((i > -1) && (sakura[i] > num)){
                sakura[i+1] = sakura[i];
                i--;
            }
            sakura[i+1] = num;  
       }

   
   }
}
