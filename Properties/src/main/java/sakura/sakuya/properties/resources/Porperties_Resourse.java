/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sakura.sakuya.properties.resources;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import sakura.sakuya.properties.beans.Properties_Bean;

/**
 *
 * @author SakuyaYae
 */
@Path("properties")
public class Porperties_Resourse {
    @EJB
    Properties_Bean properties;
    
    @GET
    @Path("{key}")
    public Response get_key(@PathParam("key") String key){
        return Response.ok(properties.get_prop(key)).build();
    
    }
}
