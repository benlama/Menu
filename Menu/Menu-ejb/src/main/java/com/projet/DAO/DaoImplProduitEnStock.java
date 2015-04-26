/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.projet.model.ProduitEnStock;

/**
 *
 * @author DNS
 */
@Stateless
public class DaoImplProduitEnStock extends AbstractFacade<ProduitEnStock> implements DaoProduitEnStock {
    @PersistenceContext(unitName = "com.projet_Menu-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DaoImplProduitEnStock() {
        super(ProduitEnStock.class);
    }
    
}
