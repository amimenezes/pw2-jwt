package edu.ifrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/getSum")
public class Backend {

    @GET
    @Path("/{numUm}/{numDois}")
    @Produces(MediaType.APPLICATION_JSON)
    public double getSum(@PathParam("numUm") double numUm, @PathParam("numDois") double numDois) {
        return numUm + numDois;
    }
}