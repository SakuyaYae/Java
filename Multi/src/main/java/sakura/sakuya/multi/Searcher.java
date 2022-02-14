/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.multi;

import java.io.File;

/**
 *
 * @author SakuyaYae
 */
public class Searcher {
    public void search(){
        File view = new File("C:\\Users\\Elev\\Pictures\\Anime");
        String names[] = view.list();
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }
    }
    
    public void hdd_space_c(){
        File hdd = new File("C:");
 
        long free = hdd.getFreeSpace();
        long total = hdd.getTotalSpace();
        
        System.out.println("Avalible hdd memory");
        System.out.println(free);
        System.out.println("total hdd memory");
        System.out.println(total);
    }
}
