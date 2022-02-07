/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.sakura_img_server.resources;


import java.nio.file.Files;
import java.nio.file.Paths;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import sakura.sakuya.sakura_img_server.beans.Sakura_img_bean;

/**
 *
 * @author SakuyaYae
 */
@Path("images")
public class Sakura_img_resorse {
    @EJB
    Sakura_img_bean img_bean;
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response upload_img(String img){
        if(img_bean.save_img(img)){
            return Response.status(Response.Status.CREATED).build();
        }
        else{
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }
    @GET
    @Produces("image/png")
    @Path("/{name}")
    public Response get_img(@PathParam("name") String name){
        try{
        byte[] data = Files.readAllBytes(Paths.get("images", name));
            return Response.status(Response.Status.OK).build();
        }
        catch(Exception e){
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        
    }
    
    
    
}
