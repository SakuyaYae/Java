/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.manga_list.entities;

/**
 *
 * @author Elev
 */
public class Manga {
    private String author;
    private String title;
    
    public Manga(){
    }
    
    
    public Manga(String author, String title){
        this.author = author;
        this.title = title;
        }
    
     public String getAuthor(){
            return author;
    }
     public void setAuthor(String author){
        this.author = author;
     
     }
    
     public String getTitle(){
            return title;
    }
    public void setTitle(String title){
        this.title = title;
     //
     }
    
    
}
