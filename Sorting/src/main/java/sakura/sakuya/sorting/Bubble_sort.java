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
public class Bubble_sort {

    public Bubble_sort() {
        
    }
    
    
    static void bubble(int sakura[]){
        int len = sakura.length;
        int temp = 0;
        
                
        for(int y = 0; y < len; y++){
            for(int x = 1; x < (len - y); x++){
                if(sakura[x - 1] > sakura[x]){
                    temp = sakura[x - 1];
                    sakura[x - 1] = sakura[x];
                    sakura[x] = temp;
                }
            }
        }
    
    
    }
}
