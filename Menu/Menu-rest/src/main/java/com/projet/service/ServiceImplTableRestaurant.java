/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.TableRestaurant;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.APPLICATION_XML;

/**
 *
 * @author DNS
 */
@Stateless
@Path("/tablerestaurant")
@LocalBean
public class ServiceImplTableRestaurant  {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplTableRestaurant!com.projet.DAO.DAOTableRestaurant")
    private com.projet.DAO.DaoTableRestaurant daoTableRestaurant;
   
    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(TableRestaurant entity) {
        daoTableRestaurant.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, TableRestaurant entity) {
        daoTableRestaurant.edit(entity);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public void remove(@PathParam("id") Integer id) {
        daoTableRestaurant.remove(daoTableRestaurant.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public TableRestaurant find(@PathParam("id") Integer id) {
        return daoTableRestaurant.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<TableRestaurant> findAll() {
        return daoTableRestaurant.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<TableRestaurant> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return daoTableRestaurant.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(daoTableRestaurant.count());
    }

    
}
