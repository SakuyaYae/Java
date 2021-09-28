package nu.te4.manga_list.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 *
 * @author SakuyaYae
 */
@Path("ping")
public class JavaEE8Resource {
    
    /**
     *
     * @return response ok
     */
    @GET
    public Response ping(){
        return Response
                .ok("Sakuya")
                .build();
    }
}
