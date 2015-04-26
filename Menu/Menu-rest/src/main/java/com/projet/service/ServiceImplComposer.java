/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.Composer;
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
@Path("/composer")
@LocalBean
public class ServiceImplComposer {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplComposer!com.projet.DAO.DAOComposer")
    private com.projet.DAO.DaoComposer DaoComposer;
   
    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(Composer entity) {
        DaoComposer.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, Composer entity) {
        DaoComposer.edit(entity);
    }

    @DELETE
    @Path("/delete/{id}")
    public void remove(@PathParam("id") Integer id) {
        DaoComposer.remove(DaoComposer.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public Composer find(@PathParam("id") Integer id) {
        return DaoComposer.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Composer> findAll() {
        return DaoComposer.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Composer> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return DaoComposer.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(DaoComposer.count());
    }
}
