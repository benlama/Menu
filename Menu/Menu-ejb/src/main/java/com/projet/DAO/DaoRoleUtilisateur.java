/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.RoleUtilisateur;

/**
 *
 * @author DNS
 */
@Local
public interface DaoRoleUtilisateur {

    void create(RoleUtilisateur roleUtilisateur);

    void edit(RoleUtilisateur roleUtilisateur);

    void remove(RoleUtilisateur roleUtilisateur);

    RoleUtilisateur find(Object id);

    List<RoleUtilisateur> findAll();

    List<RoleUtilisateur> findRange(int[] range);

    int count();
    
}
