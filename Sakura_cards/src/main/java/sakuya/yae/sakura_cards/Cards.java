/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakuya.yae.sakura_cards;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author SakuyaYae
 */
@ServerEndpoint("/Sakura_cards")
public class Cards {
    
    static Set<Session> sessions = new HashSet<>();
    
    @OnMessage
    public void onMessage(String message, Session user) throws IOException {
        String username = (String)user.getUserProperties().get("username");
        
        if(username == null){
            user.getUserProperties().put("username", message);
            user.getBasicRemote().sendText(Build_json("System", "You have conected as " + message));
            Iterator<Session> i = sessions.iterator();
            while(i.hasNext()){
                i.next().getBasicRemote().sendText(Build_users_json());
            
            }
        }
        else{
            Iterator<Session> iterator = sessions.iterator();
            while(iterator.hasNext()){
                iterator.next().getBasicRemote().sendText(Build_json(username, message));
            }
        }
    }
    @OnOpen
    public void open(Session session){
        sessions.add(session);
        
    }
    @OnClose
    public void close(Session session) throws IOException{
        String username = (String)session.getUserProperties().get("username");
        sessions.remove(session);
        Iterator<Session> iterator = sessions.iterator();
            while(iterator.hasNext()){
                Session user = iterator.next();
                user.getBasicRemote().sendText(Build_json("System: ",username + " Has left"));
                user.getBasicRemote().sendText(Build_users_json());
            }
    }
    
    private String Build_json(String from, String message){
        JsonObject json_message = Json.createObjectBuilder().add("from", from).add("message", message).build();
        return json_message.toString();
                
    }
    
    private String Build_users_json(){
        JsonArrayBuilder json_arr = Json.createArrayBuilder();
        Iterator<Session> iterator = sessions.iterator();
        while(iterator.hasNext()){
                String username = (String)iterator.next().getUserProperties().get("username");
                JsonObject json_obj = Json.createObjectBuilder().add("username", username).build();
                json_arr.add(json_obj);
            }
        return json_arr.build().toString();
    }
}
