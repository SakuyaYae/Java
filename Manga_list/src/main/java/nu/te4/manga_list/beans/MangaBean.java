/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.manga_list.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import nu.te4.manga_list.ConnectionFactory;
import nu.te4.manga_list.entities.Manga;

/**
 *
 * @author Elev
 */
@Stateless
public class MangaBean {
    public List<Manga> getManga(){
        List<Manga> MangaList = new ArrayList<>();
        try(Connection con = ConnectionFactory.getconnection()){
            
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM `book` ");
            ResultSet result = stmt.executeQuery();
            
            while(result.next()){
                String author = result.getString("author");
                String title = result.getString("title");
                Manga manga = new Manga(author, title);
                MangaList.add(manga);
            
            }
        }catch(Exception e){
        System.out.println("MangaBean.getmanga: " + e.getMessage());
        }
        return MangaList;
    }
    public boolean postManga(Manga manga){
        boolean success = false;
    try(Connection con = ConnectionFactory.getconnection()){
            
            PreparedStatement stmt = con.prepareStatement("INSERT INTO book(author, title) VALUES(?, ?)");
            stmt.setString(1, manga.getAuthor());
            stmt.setString(2, manga.getTitle());
            success = stmt.executeUpdate() > 0;
            
           
        }catch(Exception e){
        System.out.println("MangaBean.postmanga: " + e.getMessage());
        }
        return success;
    
    }
}
