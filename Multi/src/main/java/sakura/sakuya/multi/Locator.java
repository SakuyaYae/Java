/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.multi;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author SakuyaYae
 */
public class Locator {
    public void calebration(){
        try{
            
        int sum = 0;
        int number = 0;
        File numbers = new File("C:\\Users\\Elev\\Documents\\GitHub\\Java\\disturbanse.txt");
        Scanner read = new Scanner(numbers);
        
    
        while(read.hasNextLine()){
            String number_from_file = read.nextLine();
            number_from_file = number_from_file.replace("\t", "");
            number = Integer.parseInt(number_from_file);
            sum += number;
        }
        
        System.out.println(sum);
        
        }
        catch(Exception e){
            System.out.println("error");
        }
    }
    
    
    
}
