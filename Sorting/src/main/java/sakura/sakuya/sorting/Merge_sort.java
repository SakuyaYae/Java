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
public class Merge_sort {

    public Merge_sort() {
    }
    
    public void Merge(int sakura[], int orgin, int mid, int end){
        int i;
        int x;
        int y;
        
        int yuki_l = mid - orgin + 1;
        int yuki_r = end - mid;
        
        int left[] = new int[yuki_l];
        int right[] = new int[yuki_r];
        
        for(i = 0; i < yuki_l; i++){
            left[i] = sakura[orgin + 1];
        }
        for(x = 0; x < yuki_r; x++){
            right[x] = sakura[mid + 1 + x];
        }   
        
        i = 0;
        x = 0;
        y = orgin;
        
        while(i < yuki_l && x < yuki_r){
            if(left[i] <= right[x]){
                sakura[y] = left[i];
                i++;
            }
            else{
                sakura[y] = right[x];
                x++;
            }
            y++;
        }
        while(i < yuki_l){
            sakura[y] = left[i];
            i++;
            y++;
        }
        while(x < yuki_r){
            sakura[y] = right[x];
            x++;
            y++;        
        }
    
    }
    public void Merge_sort(int sakura[], int orgin, int end){
        if(orgin < end){
            int mid = (orgin + end) / 2;
            Merge_sort(sakura, orgin, mid);
            Merge_sort(sakura, mid + 1, end);
            Merge(sakura, orgin, mid, end);
        }
    }
    
    
}
