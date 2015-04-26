/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Zone;

/**
 *
 * @author DNS
 */
@Local
public interface DaoZone {

    void create(Zone zone);

    void edit(Zone zone);

    void remove(Zone zone);

    Zone find(Object id);

    List<Zone> findAll();

    List<Zone> findRange(int[] range);

    int count();
    
}
