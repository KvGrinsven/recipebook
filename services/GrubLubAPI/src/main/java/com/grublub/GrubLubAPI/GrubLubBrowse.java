package com.grublub.GrubLubAPI;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.grublub.model.Recipe;
import com.grublub.persistence.Repository;

@Path("/browse/")
public class GrubLubBrowse {
	
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecipeById(
    		@PathParam("id") int id,
    		@Context HttpServletRequest request) {
    	
    	HttpSession session= request.getSession();
		Repository repo = (Repository) session.getAttribute("repository");
		
        return Response.status(200).entity(repo.getRecipe(id)).build();
    }
    
    @GET
    @Path("/{id}/{servings}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getRecipeWithServings(
    		@PathParam("id") int id,
    		@PathParam("servings") int servings,
    		@Context HttpServletRequest request) {
    	
    	HttpSession session= request.getSession();
		Repository repo = (Repository) session.getAttribute("repository");
		
		Recipe recipe = repo.getRecipe(id);
		
		recipe.ofServings(servings);
		
    	return Response.status(200).entity(recipe).build();
    }
}
