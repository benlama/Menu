/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.Publicite;

/**
 *
 * @author DNS
 */
@Local
public interface DaoPublicite {

    void create(Publicite publicite);

    void edit(Publicite publicite);

    void remove(Publicite publicite);

    Publicite find(Object id);

    List<Publicite> findAll();

    List<Publicite> findRange(int[] range);

    int count();
    
}
