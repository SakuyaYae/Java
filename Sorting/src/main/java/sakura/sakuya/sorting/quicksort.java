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
public class quicksort {

    public quicksort() {
    }
    
    public int goro(int sakura[], int start, int end){
        int piviot = sakura[end];
        int i = (start - 1);
        for(int j = start; j <= end; j++){
            if(sakura[j] < piviot){
                i++;
                int temp = sakura[i];
                sakura[i] = sakura[j];
                sakura[j] = temp;
            }
        }
        int t = sakura[i + 1];
        sakura[i + 1] = sakura[end];
        sakura[end] = t;
        return (i + 1);
    }
    
    public void quick_sorting(int sakura[], int start, int end){
        if(start < end){
            int yagyuu =  goro(sakura, start, end);
            quick_sorting(sakura, start, yagyuu - 1);
            quick_sorting(sakura, yagyuu + 1, end);
        }
    }
    
}
