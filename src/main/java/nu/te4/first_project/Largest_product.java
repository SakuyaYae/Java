/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.first_project;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author SakuyaYae
 */
public class Largest_product {
    public void calc(){
    try{
        
        File numbers = new File("C:\\Users\\Elev\\Documents\\GitHub\\Java\\Large_product.txt");
        Scanner read = new Scanner(numbers);
        
        int yuki[];
        String data = "";
        while(read.hasNext()){   
            data += read.next();  
        }
        yuki = new int[data.length()];
        for (int i = 0; i < data.length(); i++) {
            yuki[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
        }
        long max_res = 0;
        for(int i = 0; i < yuki.length-12; i++){
            long res = 1;
            for(int j = 0; j < 13; j++){
                res *= yuki[i + j]; 
            }
            if(res > max_res){
                max_res = res;
            }
        }
        System.out.println(max_res);
        
        }
        catch(Exception e){
            System.out.println("error");
        }
   }

}
