/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.webscraping;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 *
 * @author Elev
 */
public class Main {
    public static void main(String[] args) {
        String title;
        try{
            Document doc = Jsoup.connect("http://myanimelist.net/topanime.php").get();
            Elements tbody = doc.select("tr.ranking-list");
            for(Element tr: tbody){
                title = tr.select("h3 a").get(0).html();
                Element img = tr.select("img").get(0);
                String img_src = img.attr("data-src");
                title = title.replace("/", " ");
                title = title.replace(".", "");
                title = title.replace("'", " ");
                saveimg(img_src, title);
                System.out.println(title);
            }
        }
        catch(IOException ex){
            System.out.println("Error in geting page");
        }
    }
    public static void saveimg(String img_url, String movie_title) throws MalformedURLException, IOException{
        URL url = new URL(img_url);
        BufferedImage img = ImageIO.read(url);
        File file = new File("C:\\Users\\Elev\\Pictures\\Saved Pictures\\" + movie_title + ".jpg");
        ImageIO.write(img, "jpg", file);
    }
}
