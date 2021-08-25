/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nu.te4.manga_list.resources;

import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import nu.te4.manga_list.beans.MangaBean;
import nu.te4.manga_list.entities.Manga;

/**
 *
 * @author Elev
 */
@Produces(MediaType.APPLICATION_JSON)
@Path("manga")
@Consumes(MediaType.APPLICATION_JSON)
public class Mangaresource {
    
    
    @EJB
    MangaBean mangabean;
    
    @GET
    public Response getManga(){
        List<Manga> manga = mangabean.getManga();
        if(manga.size() > 0){
            return Response
                .ok(manga)
                .build();
    }
        else{
            return Response
                .noContent()
                .build();
        }
    }
    
    @POST
    public Response postManga(Manga manga){
        if(mangabean.postManga(manga)){
        return Response.status(Response.Status.CREATED).build();
        }
        else{
            return Response.serverError().entity("Oops somting went worng!").build();
        }
    }
}
