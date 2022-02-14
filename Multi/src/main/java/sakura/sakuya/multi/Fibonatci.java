/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.multi;

/**
 *
 * @author SakuyaYae
 */
public class Fibonatci {
    public long number(long n){
        if(n < 0){
            n = n * -1;
        }
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else{
            return number(n - 1) + number(n - 2);
        }
    }
}
