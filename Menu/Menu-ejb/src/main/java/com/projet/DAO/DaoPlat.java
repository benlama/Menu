/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Plat;

/**
 *
 * @author DNS
 */
@Local
public interface DaoPlat {

    void create(Plat plat);

    void edit(Plat plat);

    void remove(Plat plat);

    Plat find(Object id);

    List<Plat> findAll();

    List<Plat> findRange(int[] range);

    int count();
    
}
