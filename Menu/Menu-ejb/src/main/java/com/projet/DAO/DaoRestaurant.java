/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Restaurant;

/**
 *
 * @author DNS
 */
@Local
public interface DaoRestaurant {

    void create(Restaurant restaurant);

    void edit(Restaurant restaurant);

    void remove(Restaurant restaurant);

    Restaurant find(Object id);

    List<Restaurant> findAll();

    List<Restaurant> findRange(int[] range);

    int count();
    
}
