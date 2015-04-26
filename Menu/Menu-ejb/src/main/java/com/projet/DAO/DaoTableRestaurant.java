/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.TableRestaurant;

/**
 *
 * @author DNS
 */
@Local
public interface DaoTableRestaurant {

    void create(TableRestaurant table);

    void edit(TableRestaurant table);

    void remove(TableRestaurant table);

    TableRestaurant find(Object id);

    List<TableRestaurant> findAll();

    List<TableRestaurant> findRange(int[] range);

    int count();
    
}
