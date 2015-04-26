/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import com.projet.model.Fournisseur;
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
@Path("/fournisseur")
@LocalBean
public class ServiceImplFournisseur {
    @EJB(mappedName = "java:global/Menu-rest/DAOImplFournisseur!com.projet.DAO.DAOFournisseur")
    private com.projet.DAO.DaoFournisseur DaoFournisseur;
   

    @POST
    @Path("/insert")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void create(Fournisseur entity) {
        DaoFournisseur.create(entity);
    }

    @PUT
    @Path("/update/{id}")
    @Consumes({APPLICATION_JSON,APPLICATION_XML})
    public void edit(@PathParam("id") Integer id, Fournisseur entity) {
        DaoFournisseur.edit(entity);
    }

    @DELETE
    @Path("/all")
    public void remove(@PathParam("id") Integer id) {
        DaoFournisseur.remove(DaoFournisseur.find(id));
    }

    @GET
    @Path("/select/{id}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public Fournisseur find(@PathParam("id") Integer id) {
        return DaoFournisseur.find(id);
    }

    @GET
    @Path("/all")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Fournisseur> findAll() {
        return DaoFournisseur.findAll();
    }

    @GET
    @Path("/some/{from}/{to}")
    @Produces({APPLICATION_JSON,APPLICATION_XML})
    public List<Fournisseur> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return DaoFournisseur.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(DaoFournisseur.count());
    }

    
}
