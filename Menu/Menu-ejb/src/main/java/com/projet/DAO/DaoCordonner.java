/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Cordonner;

/**
 *
 * @author DNS
 */
@Local
public interface DaoCordonner {

    void create(Cordonner cordonner);

    void edit(Cordonner cordonner);

    void remove(Cordonner cordonner);

    Cordonner find(Object id);

    List<Cordonner> findAll();

    List<Cordonner> findRange(int[] range);

    int count();
    
}
