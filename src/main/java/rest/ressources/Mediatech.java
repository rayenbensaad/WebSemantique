package rest.ressources;

import java.awt.PageAttributes.MediaType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.ResultSet;

import javax.management.Query;
import javax.net.ssl.SSLEngineResult.Status;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.hp.hpl.jena.query.QueryExecution;
import com.hp.hpl.jena.query.QueryExecutionFactory;
import com.hp.hpl.jena.query.QueryFactory;
import com.hp.hpl.jena.query.ResultSetFormatter;
import com.hp.hpl.jena.rdf.model.Model;

import Elearning.JenaEngine;

@Path("Mediatech")
public class Mediatech {

	
	Model model = JenaEngine.readModel("data/mediatech.owl");
	
	
	 @GET
	    @Path("movies")
	    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	    public Response getMovies() 
		 { 
	    	Model model = JenaEngine.readModel("data/mediatech.owl");
			 String q =
					" PREFIX ns: <http://www.semanticweb.org/gitplease/Mediatech#>"+
						 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
						" SELECT ?movie "+
						" WHERE {"+
						" ?movie rdf:type ns:movie ."+
						" }";
					
			 com.hp.hpl.jena.query.Query query = QueryFactory.create( q);  // No reasoning 
			 // Execute the query and obtain results
			 QueryExecution qe = QueryExecutionFactory.create(query, model); 
			 com.hp.hpl.jena.query.ResultSet results = qe.execSelect(); 
			 OutputStream output = new OutputStream() { 
				 private StringBuilder string = new StringBuilder(); 
			 
			 @Override 
			 public void write(int b) throws IOException {
				 this.string.append((char) b); } 
			 

			 public String toString() { 
			 return this.string.toString(); 
			 } 
			 }; 
			 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			 ResultSetFormatter.outputAsJSON(outputStream, results);

			 // and turn that into a String
			 String json = new String(outputStream.toByteArray());

			 System.out.println(json);
			 return Response.status(javax.ws.rs.core.Response.Status.OK).entity(json).build();
			
			 
	
	 }


    
	 @GET
	    @Path("albums")
	    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	    public Response getAlbums() 
		 { 
	    	Model model = JenaEngine.readModel("data/mediatech.owl");
			 String q =
					" PREFIX ns: <http://www.semanticweb.org/gitplease/Mediatech#>"+
						 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
						" SELECT ?album "+
						" WHERE {"+
						" ?album rdf:type ns:Album ."+
						" }";
					
			 com.hp.hpl.jena.query.Query query = QueryFactory.create( q);  // No reasoning 
			 // Execute the query and obtain results
			 QueryExecution qe = QueryExecutionFactory.create(query, model); 
			 com.hp.hpl.jena.query.ResultSet results = qe.execSelect(); 
			 OutputStream output = new OutputStream() { 
				 private StringBuilder string = new StringBuilder(); 
			 
			 @Override 
			 public void write(int b) throws IOException {
				 this.string.append((char) b); } 
			 

			 public String toString() { 
			 return this.string.toString(); 
			 } 
			 }; 
			 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			 ResultSetFormatter.outputAsJSON(outputStream, results);

			 // and turn that into a String
			 String json = new String(outputStream.toByteArray());

			 System.out.println(json);
			 return Response.status(javax.ws.rs.core.Response.Status.OK).entity(json).build();
			
			 
	
	 }
	 
	 
	 @GET
	    @Path("series")
	    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	    public Response getSeries() 
		 { 
	    	Model model = JenaEngine.readModel("data/mediatech.owl");
			 String q =
					" PREFIX ns: <http://www.semanticweb.org/gitplease/Mediatech#>"+
						 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
						" SELECT ?serie "+
						" WHERE {"+
						" ?serie rdf:type ns:serie ."+
						" }";
					
			 com.hp.hpl.jena.query.Query query = QueryFactory.create( q);  // No reasoning 
			 // Execute the query and obtain results
			 QueryExecution qe = QueryExecutionFactory.create(query, model); 
			 com.hp.hpl.jena.query.ResultSet results = qe.execSelect(); 
			 OutputStream output = new OutputStream() { 
				 private StringBuilder string = new StringBuilder(); 
			 
			 @Override 
			 public void write(int b) throws IOException {
				 this.string.append((char) b); } 
			 

			 public String toString() { 
			 return this.string.toString(); 
			 } 
			 }; 
			 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			 ResultSetFormatter.outputAsJSON(outputStream, results);

			 // and turn that into a String
			 String json = new String(outputStream.toByteArray());

			 System.out.println(json);
			 return Response.status(javax.ws.rs.core.Response.Status.OK).entity(json).build();
			
			 
	
	 }
	 
	 
	 @GET
	    @Path("actors")
	    @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	    public Response getActors() 
		 { 
	    	Model model = JenaEngine.readModel("data/mediatech.owl");
			 String q =
					 " PREFIX ns: <http://www.semanticweb.org/gitplease/Mediatech#>"+
							 "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#>"+
							" SELECT ?Actor "+
							" WHERE {"+
							" ?Actor rdf:type ns:Actor ."+
							" }";
					
			 com.hp.hpl.jena.query.Query query = QueryFactory.create( q);  // No reasoning 
			 // Execute the query and obtain results
			 QueryExecution qe = QueryExecutionFactory.create(query, model); 
			 com.hp.hpl.jena.query.ResultSet results = qe.execSelect(); 
			 OutputStream output = new OutputStream() { 
				 private StringBuilder string = new StringBuilder(); 
			 
			 @Override 
			 public void write(int b) throws IOException {
				 this.string.append((char) b); } 
			 

			 public String toString() { 
			 return this.string.toString(); 
			 } 
			 }; 
			 ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

			 ResultSetFormatter.outputAsJSON(outputStream, results);

			 // and turn that into a String
			 String json = new String(outputStream.toByteArray());

			 System.out.println(json);
			 return Response.status(javax.ws.rs.core.Response.Status.OK).entity(json).build();
			
			 
	
	 }
	 
	 
}
