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
public class Low_divider {
    public void divider(){
    int res = 0;
    int div = 1;
    int i = 1;
    while(res == 0){
            if((div % i) == 0){
              if((div % (i + 1)) == 0){
                if((div % (i + 2)) == 0){
                    if((div % (i + 3)) == 0){
                        if((div % (i + 4)) == 0){
                            if((div % (i + 5)) == 0){
                                if((div % (i + 6)) == 0){
                                    if((div % (i + 7)) == 0){
                                        if((div % (i + 8)) == 0){
                                            if((div % (i + 9)) == 0){
                                                if((div % (i + 10)) == 0){
                                                    if((div % (i + 11)) == 0){
                                                        if((div % (i + 12)) == 0){
                                                            if((div % (i + 13)) == 0){
                                                                if((div % (i + 14)) == 0){
                                                                    if((div % (i + 15)) == 0){
                                                                        if((div % (i + 16)) == 0){
                                                                            if((div % (i + 17)) == 0){
                                                                                if((div % (i + 18)) == 0){
                                                                                    if((div % (i + 19)) == 0){
                                                                                        res = div;
                                                                                        break;
                                                                                    } 
                                                                                } 
                                                                            } 
                                                                        } 
                                                                    } 
                                                                } 
                                                            } 
                                                        } 
                                                    }  
                                                }
                                            } 
                                        } 
                                    } 
                                } 
                            } 
                        } 
                    } 
                } 
              }  
            }  
            div++;
    }
        System.out.println("lowest divder is: ");
        System.out.println(res);
    }
    public void chosen_diveder(int number){
        int div = 0;
        int yuki = 0;
        int sakura[];
        
        while(true){
            sakura = new int[number];
            for(int i = 1; i < number; i++){
                if((div % i) == 0){
                    sakura[i-1] = 1;
                }   
            } 
            for (int i = 0; i < number ; i++) {
                if(sakura[i] == 1){
                   yuki++;
                } 
            } 
            
            if(yuki == number){
               break;
            } 
            
            div++; 
        }
        System.out.println(number);
        System.out.println("lowest divder is: ");
        System.out.println(div);
    }
}
