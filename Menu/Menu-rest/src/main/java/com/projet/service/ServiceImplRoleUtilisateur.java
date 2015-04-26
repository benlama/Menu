/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.RoleUtilisateur;
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
@Path("/roleutilisateur")
@LocalBean
public class ServiceImplRoleUtilisateur  {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplRoleUtilisateur!com.projet.DAO.DAORoleUtilisateur")
    private com.projet.DAO.DaoRoleUtilisateur DaoRoleUtilisateur;
   
    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(RoleUtilisateur entity) {
        DaoRoleUtilisateur.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, RoleUtilisateur entity) {
        DaoRoleUtilisateur.edit(entity);
    }

    @DELETE
    @Path("/delete/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public void remove(@PathParam("id") Integer id) {
        DaoRoleUtilisateur.remove(DaoRoleUtilisateur.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public RoleUtilisateur find(@PathParam("id") Integer id) {
        return DaoRoleUtilisateur.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<RoleUtilisateur> findAll() {
        return DaoRoleUtilisateur.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<RoleUtilisateur> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return DaoRoleUtilisateur.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(DaoRoleUtilisateur.count());
    }
    
}
