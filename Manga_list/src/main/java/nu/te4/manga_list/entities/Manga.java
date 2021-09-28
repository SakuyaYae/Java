/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.manga_list.entities;

/**
 *
 * @author SakuyaYae
 */
public class Manga {
    private String author;
    private String title;
    
    /**
     *
     */
    public Manga(){
    }
    
    /**
     *
     * @param author The name of a author
     * @param title The titel of a manga
     */
    public Manga(String author, String title){
        this.author = author;
        this.title = title;
        }
    
    /**
     *
     * @return authors name
     */
    public String getAuthor(){
            return author;
    }

    /**
     *
     * @param author The name of a author
     */
    public void setAuthor(String author){
        this.author = author;
     
     }
    
    /**
     *
     * @return the title of manga
     */
    public String getTitle(){
            return title;
    }

    /**
     *
     * @param title The titel of a manga
     */
    public void setTitle(String title){
        this.title = title;
     //
     }
    
    
}
