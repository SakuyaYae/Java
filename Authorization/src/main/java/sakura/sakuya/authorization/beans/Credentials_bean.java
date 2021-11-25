/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.authorization.beans;

import com.mysql.jdbc.Connection;
import java.util.Base64;
import javax.ejb.Stateless;
import sakura.sakuya.authorization.ConnectionFactory;
import sakura.sakuya.autorization.enteties.Credentials;

/**
 *
 * @author SakuyaYae
 */
@Stateless
public class Credentials_bean {
    public Credentials createCredentials(String basic_auth){
        basic_auth.substring(6).trim();
        
        byte[] bytes = Base64.getDecoder().decode(basic_auth);
        basic_auth = new String(bytes);
        int colon = basic_auth.indexOf(":");
        String username = basic_auth.substring(0, colon);
        String password = basic_auth.substring(colon + 1);
        
        return new Credentials(username, password);
    }
    public boolean checkCredentials(Credentials credentials){
        return true;
    }    
    public int saveCredentials(Credentials credentials){
        try(Connection connection = ConnectionFactory.getconnection()){
            String has
        }
        catch{Exception e}{
        
        }
        return 0;
    }
}
