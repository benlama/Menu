/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "horaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Horaire.findAll", query = "SELECT h FROM Horaire h"),
    @NamedQuery(name = "Horaire.findById", query = "SELECT h FROM Horaire h WHERE h.id = :id"),
    @NamedQuery(name = "Horaire.findByHeureDeb", query = "SELECT h FROM Horaire h WHERE h.heureDeb = :heureDeb"),
    @NamedQuery(name = "Horaire.findByHeureFin", query = "SELECT h FROM Horaire h WHERE h.heureFin = :heureFin"),
    @NamedQuery(name = "Horaire.findByJour", query = "SELECT h FROM Horaire h WHERE h.jour = :jour")})
public class Horaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_deb")
    @Temporal(TemporalType.TIME)
    private Date heureDeb;
    @Basic(optional = false)
    @NotNull
    @Column(name = "heure_fin")
    @Temporal(TemporalType.TIME)
    private Date heureFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "jour")
    private int jour;

    public Horaire() {
    }

    public Horaire(Integer id) {
        this.id = id;
    }

    public Horaire(Integer id, Date heureDeb, Date heureFin, int jour) {
        this.id = id;
        this.heureDeb = heureDeb;
        this.heureFin = heureFin;
        this.jour = jour;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getHeureDeb() {
        return heureDeb;
    }

    public void setHeureDeb(Date heureDeb) {
        this.heureDeb = heureDeb;
    }

    public Date getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(Date heureFin) {
        this.heureFin = heureFin;
    }

    public int getJour() {
        return jour;
    }

    public void setJour(int jour) {
        this.jour = jour;
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
        if (!(object instanceof Horaire)) {
            return false;
        }
        Horaire other = (Horaire) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Horaire[ id=" + id + " ]";
    }
    
}
