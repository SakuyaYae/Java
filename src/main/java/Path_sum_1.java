/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SakuyaYae
 */
public class Path_sum_1 {
    public void path(){
    try{

        int yuki[];
        
        
        String data =               "75" +
                                   "95 64" + 
                                  "17 47 82" +
                                 "18 35 87 10" +
                                "20 04 82 47 65" +
                              "19 01 23 75 03 34" +
                            "88 02 77 73 07 63 67" + // 23 24 25 
                          "99 65 04 28 06 16 70 92" + // 30 31 33
                        "41 41 26 56 83 40 80 70 33" +
                      "41 48 72 33 47 32 37 16 94 29" +
                    "53 71 44 65 25 43 91 52 97 51 14" +
                  "70 11 33 28 77 73 17 78 39 68 17 57" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48" +
              "63 66 04 68 89 53 67 30 73 16 69 87 40 31" +
             "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        
        
        yuki = new int[data.length()];
        for (int i = 0; i < data.length(); i++) {
            yuki[i] = Integer.parseInt(String.valueOf(data.charAt(i)));
        }
        int yui = 0;
        int i = 0;

        yui = yuki[i];
       
        if(yuki[1] > yuki[2]){
            yui += yuki[1];
            if(yuki[3] > yuki[4]){
                yui += yuki[3];
                if(yuki[6] > yuki[7]){
                    yui += yuki[6];
                    if(yuki[11] > yuki[12]){
                        yui = yuki[i] + yuki[11];
                            if(yuki[16] > yuki[17]){
                                yui = yuki[i] + yuki[16];
                                    if(yuki[23] > yuki[24]){
                                        yui = yuki[i] + yuki[23];
                                        if(yuki[30] > yuki[31]){
                                            yui = yuki[i] + yuki[30];
                
                                        } 
            
                                        if(yuki[30] < yuki[31]){
                                            yui = yuki[i] + yuki[31];
                    
                                        } 
                                    }                    
                                    if(yuki[23] < yuki[24]){
                                         yui = yuki[i] + yuki[24];
                                         
                                    } 
                            } 
                            if(yuki[16] < yuki[17]){
                            yui = yuki[i] + yuki[4];
                    
                            } 
                            
                    }
                    if(yuki[11] < yuki[12]){
                        yui = yuki[i] + yuki[11];
                    
                    } 
                }
                if(yuki[6] < yuki[7]){
                    yui += yuki[7];
                    
                } 
                
            }
            if(yuki[3] < yuki[4]){
                    yui += yuki[4];
                    
            } 
               
        }
        
        
        
        if(yuki[2] > yuki[1]){
            if(yuki[1] > yuki[2]){
                yui += yuki[1];
            }   
        }
        
        System.out.println(yui);
        
    }
    catch(Exception e){
        System.out.println("error");
    }
    
   }
}
