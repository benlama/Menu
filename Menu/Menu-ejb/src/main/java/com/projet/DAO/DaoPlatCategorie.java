/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.PlatCategorie;

/**
 *
 * @author DNS
 */
@Local
public interface DaoPlatCategorie {

    void create(PlatCategorie platCategorie);

    void edit(PlatCategorie platCategorie);

    void remove(PlatCategorie platCategorie);

    PlatCategorie find(Object id);

    List<PlatCategorie> findAll();

    List<PlatCategorie> findRange(int[] range);

    int count();
    
}
