/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.projet.model.PubZone;

/**
 *
 * @author DNS
 */
@Stateless
public class DaoImplPubZone extends AbstractFacade<PubZone> implements DaoPubZone {
    @PersistenceContext(unitName = "com.projet_Menu-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DaoImplPubZone() {
        super(PubZone.class);
    }
    
}
