/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.TypeReservation;

/**
 *
 * @author DNS
 */
@Local
public interface DaoTypeReservation {

    void create(TypeReservation typeReservation);

    void edit(TypeReservation typeReservation);

    void remove(TypeReservation typeReservation);

    TypeReservation find(Object id);

    List<TypeReservation> findAll();

    List<TypeReservation> findRange(int[] range);

    int count();
    
}
