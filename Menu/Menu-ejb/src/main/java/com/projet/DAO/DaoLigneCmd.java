/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.LigneCmd;

/**
 *
 * @author DNS
 */
@Local
public interface DaoLigneCmd {

    void create(LigneCmd ligneCmd);

    void edit(LigneCmd ligneCmd);

    void remove(LigneCmd ligneCmd);

    LigneCmd find(Object id);

    List<LigneCmd> findAll();

    List<LigneCmd> findRange(int[] range);

    int count();
    
}
