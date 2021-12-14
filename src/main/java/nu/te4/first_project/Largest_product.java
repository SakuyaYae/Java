/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.first_project;

import java.io.File;
import java.math.BigInteger;
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
        
        String yuki[];
        yuki = new String[1000];
        
        while(read.hasNextLine()){
            int i = 0;
            String number_from_file = read.next();
            
            yuki[i] = number_from_file;
            i++;
        }
        
        System.out.println();
        
        }
        catch(Exception e){
            
        }
   }

}
