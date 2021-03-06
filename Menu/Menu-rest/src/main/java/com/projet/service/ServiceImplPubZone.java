/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.PubZone;
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
@Path("/pubzone")
@LocalBean
public class ServiceImplPubZone {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplPubZone!com.projet.DAO.DAOPubZone")
    private com.projet.DAO.DaoPubZone daoPubZone;
   

    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(PubZone entity) {
        daoPubZone.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, PubZone entity) {
        daoPubZone.edit(entity);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public void remove(@PathParam("id") Integer id) {
        daoPubZone.remove(daoPubZone.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public PubZone find(@PathParam("id") Integer id) {
        return daoPubZone.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<PubZone> findAll() {
        return daoPubZone.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<PubZone> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return daoPubZone.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(daoPubZone.count());
    }
}
