/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Composer;

/**
 *
 * @author DNS
 */
@Local
public interface DaoComposer {

    void create(Composer composer);

    void edit(Composer composer);

    void remove(Composer composer);

    Composer find(Object id);

    List<Composer> findAll();

    List<Composer> findRange(int[] range);

    int count();
    
}
