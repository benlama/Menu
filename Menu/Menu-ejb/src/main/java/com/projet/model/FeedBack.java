/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "feed_back")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FeedBack.findAll", query = "SELECT f FROM FeedBack f"),
    @NamedQuery(name = "FeedBack.findById", query = "SELECT f FROM FeedBack f WHERE f.id = :id"),
    @NamedQuery(name = "FeedBack.findByCommantaire", query = "SELECT f FROM FeedBack f WHERE f.commantaire = :commantaire"),
    @NamedQuery(name = "FeedBack.findByEtoile", query = "SELECT f FROM FeedBack f WHERE f.etoile = :etoile")})
public class FeedBack implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "commantaire")
    private String commantaire;
    @Basic(optional = false)
    @NotNull
    @Column(name = "etoile")
    private int etoile;
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Client client;

    public FeedBack() {
    }

    public FeedBack(Integer id) {
        this.id = id;
    }

    public FeedBack(Integer id, int etoile) {
        this.id = id;
        this.etoile = etoile;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommantaire() {
        return commantaire;
    }

    public void setCommantaire(String commantaire) {
        this.commantaire = commantaire;
    }

    public int getEtoile() {
        return etoile;
    }

    public void setEtoile(int etoile) {
        this.etoile = etoile;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FeedBack)) {
            return false;
        }
        FeedBack other = (FeedBack) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.FeedBack[ id=" + id + " ]";
    }
    
}
