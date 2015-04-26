/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.Publicite;
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
@Path("/publicite")
@LocalBean
public class ServiceImplPublicite {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplPublicite!com.projet.DAO.DAOPublicite")
    private com.projet.DAO.DaoPublicite daoPublicite;
   
    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(Publicite entity) {
        daoPublicite.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, Publicite entity) {
        daoPublicite.edit(entity);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public void remove(@PathParam("id") Integer id) {
        daoPublicite.remove(daoPublicite.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public Publicite find(@PathParam("id") Integer id) {
        return daoPublicite.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Publicite> findAll() {
        return daoPublicite.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Publicite> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return daoPublicite.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(daoPublicite.count());
    }

}
