/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.PubZone;

/**
 *
 * @author DNS
 */
@Local
public interface DaoPubZone {

    void create(PubZone pubZone);

    void edit(PubZone pubZone);

    void remove(PubZone pubZone);

    PubZone find(Object id);

    List<PubZone> findAll();

    List<PubZone> findRange(int[] range);

    int count();
    
}
