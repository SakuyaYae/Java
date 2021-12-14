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
public class Large_sum {
   public void calc(){
    try{
        BigInteger sum = new BigInteger("0");
        File numbers = new File("C:\\Users\\Elev\\Documents\\GitHub\\Java\\sum.txt");
        Scanner read = new Scanner(numbers);
    
    
        while(read.hasNextLine()){
            String number_from_file = read.nextLine();
            BigInteger number = new BigInteger(number_from_file);
            sum = sum.add(number);
        }
        
        System.out.println(sum.toString().substring(0, 10));
        
        }
        catch(Exception e){
            
        }
   }
}

