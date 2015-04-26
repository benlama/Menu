/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.Role;
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
@Path("/role")
@LocalBean
public class ServiceImplRole  {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplRole!com.projet.DAO.DAORole")
    private com.projet.DAO.DaoRole DaoRole;
   

    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(Role entity) {
        DaoRole.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, Role entity) {
        DaoRole.edit(entity);
    }

    @DELETE
   @Path("/delete/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public void remove(@PathParam("id") Integer id) {
        DaoRole.remove(DaoRole.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public Role find(@PathParam("id") Integer id) {
        return DaoRole.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Role> findAll() {
        return DaoRole.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<Role> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return DaoRole.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(DaoRole.count());
    }
}
