/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.tim.oauth.beans;

import javax.ejb.Stateless;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Tim
 */
@Stateless
public class GitHubOAuthBean {
    private final String CLIENT_ID ="a36d2aaa108e16bb3604";
    private final String CLIENTSECRET ="67ebb53de5b284805a77c371f5eb869416ada800";
    
    
    public String getToken(String code){
        String url = String.format("https://github.com/login/oauth/access_token?client_id=%s&client_secret=%s&code=%s", CLIENT_ID,CLIENTSECRET,code);
        Client client = ClientBuilder.newClient();
        String res = client.target(url).request().post(null, String.class);

        return res.substring(13, res.indexOf("&"));
    }
    
    public JsonObject githubAuth(String token){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.github.com/user");
        return target.request(MediaType.APPLICATION_JSON).header("Authorrization","token" + token).get(JsonObject.class);
    }
}
