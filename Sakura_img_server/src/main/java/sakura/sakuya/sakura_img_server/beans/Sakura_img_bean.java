/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.sakura_img_server.beans;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import java.util.Random;
import javax.ejb.Stateless;
import javax.imageio.ImageIO;
import sakura.sakuya.sakura_img_server.ConnectionFactory;

/**
 *
 * @author SakuyaYae
 */
@Stateless
public class Sakura_img_bean {
    private final String PATH = "images";
    public Sakura_img_bean() {
    }
    
    public boolean save_img(String img){
        byte[] data = Base64.getDecoder().decode(img);
        InputStream istream = new ByteArrayInputStream(data);
        boolean yuki = false;
        try(Connection con = ConnectionFactory.getconnection()){
            if(!Files.exists(Paths.get(PATH))){
                Files.createDirectory(Paths.get(PATH));
            }
            String name = rando_name();
            
            File file = new File(PATH + "/" + name + ".png");
            BufferedImage imgs = ImageIO.read(istream);
            ImageIO.write(imgs, "png", file);
            
            java.sql.PreparedStatement stmt = con.prepareStatement("INSERT INTO images(img_name,img_path) VALUES (?,?)");
            stmt.setString(1, name);
            stmt.setString(2, PATH);
            yuki = stmt.executeUpdate() == 1;
            
            istream.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return yuki;
    }
    private String rando_name(){
        String name = "";
        Random rand = new Random();
        for(int i = 0; i < 16; i++){
            int num = rand.nextInt() % 25 + 97;
            name += (char)num;
        }
        return name;
    }
    
}
