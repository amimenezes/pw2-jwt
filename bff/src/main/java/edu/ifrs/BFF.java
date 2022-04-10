package edu.ifrs;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/sum")
public class BFF {

    private static final Logger LOGGER = Logger.getLogger(BFF.class.getName());
    
    String fullName;

    /* Rest client */
    @Inject
    @RestClient
    BackendClient backend;
    
    @GET
    @Path("/{numUm}/{numDois}")
    @Produces(MediaType.APPLICATION_JSON)
    public double sum(@PathParam("numUm") double numUm, @PathParam("numDois") double numDois) {
        LOGGER.log(Level.INFO, "BFF: {0}", fullName);
        return backend.getSum(numUm, numDois);
    }
}