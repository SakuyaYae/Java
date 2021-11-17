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
public class Shell_sort {

    public Shell_sort() {
    }
    
    public static void shell_sorting(int sakura[], int yagyuu){
        for(int interval = yagyuu / 2; interval > 0;interval /= 2 ){
            for(int i = interval; i < yagyuu; i += 1){
                int temp = sakura[i];
                int x;
                for(x = i; x >= interval && sakura[x - interval] > temp; x -= interval){
                    sakura[x] = sakura[x - interval];
                }   
                sakura[x] = temp;
            }  
        }
    }
}
