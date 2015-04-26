/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author DNS
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.projet.service.ServiceImplCategorie.class);
        resources.add(com.projet.service.ServiceImplClient.class);
        resources.add(com.projet.service.ServiceImplCommande.class);
        resources.add(com.projet.service.ServiceImplComposer.class);
        resources.add(com.projet.service.ServiceImplCordonner.class);
        resources.add(com.projet.service.ServiceImplFacture.class);
        resources.add(com.projet.service.ServiceImplFeedBack.class);
        resources.add(com.projet.service.ServiceImplFournisseur.class);
        resources.add(com.projet.service.ServiceImplGallery.class);
        resources.add(com.projet.service.ServiceImplHoraire.class);
        resources.add(com.projet.service.ServiceImplIngredient.class);
        resources.add(com.projet.service.ServiceImplLigneCmd.class);
        resources.add(com.projet.service.ServiceImplPlat.class);
        resources.add(com.projet.service.ServiceImplPlatCategorie.class);
        resources.add(com.projet.service.ServiceImplProduitEnStock.class);
        resources.add(com.projet.service.ServiceImplPubZone.class);
        resources.add(com.projet.service.ServiceImplPublicite.class);
        resources.add(com.projet.service.ServiceImplReservation.class);
        resources.add(com.projet.service.ServiceImplRestaurant.class);
        resources.add(com.projet.service.ServiceImplRole.class);
        resources.add(com.projet.service.ServiceImplRoleUtilisateur.class);
        resources.add(com.projet.service.ServiceImplTableRestaurant.class);
        resources.add(com.projet.service.ServiceImplTypeReservation.class);
        resources.add(com.projet.service.ServiceImplUtilisateur.class);
        resources.add(com.projet.service.ServiceImplZone.class);
    }
    
}
