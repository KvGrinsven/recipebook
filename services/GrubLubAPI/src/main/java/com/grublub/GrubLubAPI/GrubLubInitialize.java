package com.grublub.GrubLubAPI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.grublub.persistence.Repository;

@Path("init")
public class GrubLubInitialize {
    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response initialize(@Context HttpServletRequest request) {
    	
    	HttpSession session= request.getSession(true);
		Repository repo = new Repository();
		session.setAttribute("repository", repo);
		        
        return Response.status(200).entity(repo.getAllRecipes()).build();
    }

}
