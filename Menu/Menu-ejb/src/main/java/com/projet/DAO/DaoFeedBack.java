/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.DAO;

import java.util.List;
import javax.ejb.Local;
import com.projet.model.FeedBack;

/**
 *
 * @author DNS
 */
@Local
public interface DaoFeedBack {

    void create(FeedBack feedBack);

    void edit(FeedBack feedBack);

    void remove(FeedBack feedBack);

    FeedBack find(Object id);

    List<FeedBack> findAll();

    List<FeedBack> findRange(int[] range);

    int count();
    
}
