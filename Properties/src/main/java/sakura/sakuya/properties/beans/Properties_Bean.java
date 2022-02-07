/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.properties.beans;

import java.io.InputStream;
import java.util.Properties;
import javax.ejb.Stateless;

/**
 *
 * @author SakuyaYae
 */
@Stateless
public class Properties_Bean {
    public String get_prop(String key){
        try{
            ClassLoader class_loder = Thread.currentThread().getContextClassLoader();
            InputStream is = class_loder.getResourceAsStream("config.properties");
            Properties properties = new Properties();
            properties.load(is);
            return properties.getProperty(key);
        }
        catch(Exception e){
            return "no file foundS";
        }
        
    }
    
    
}
