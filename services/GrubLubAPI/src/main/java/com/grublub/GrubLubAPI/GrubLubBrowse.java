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

@Path("/browse/")
public class GrubLubBrowse {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecipeBy(@Context HttpServletRequest request) {
    	
    	HttpSession session= request.getSession();
		Repository repo = (Repository) session.getAttribute("repository");
		
        return Response.status(200).entity(repo.getRecipe(2)).build();
    }
    
}
