/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Santas_database.entities;

/**
 *
 * @author SakuyaYae
 */

public class Santa {
    private String kids;
    private String adress;
    
    public Santa(){
    }
    
    public Santa(String kids, String adress){
        this.kids = kids;
        this.adress = adress;
    }
    
    public String getKids(){
        return kids;
    }
    public void setKids(String kids){
        this.kids = kids;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    
    
    
}
