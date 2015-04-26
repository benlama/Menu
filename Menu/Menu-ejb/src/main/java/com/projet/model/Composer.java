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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "composer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Composer.findAll", query = "SELECT c FROM Composer c"),
    @NamedQuery(name = "Composer.findById", query = "SELECT c FROM Composer c WHERE c.id = :id"),
    @NamedQuery(name = "Composer.findByQuantite", query = "SELECT c FROM Composer c WHERE c.quantite = :quantite")})
public class Composer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quantite")
    private long quantite;
    @JoinColumn(name = "plat", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Plat plat;
    @JoinColumn(name = "ingredient", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ingredient ingredient;

    public Composer() {
    }

    public Composer(Integer id) {
        this.id = id;
    }

    public Composer(Integer id, long quantite) {
        this.id = id;
        this.quantite = quantite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public long getQuantite() {
        return quantite;
    }

    public void setQuantite(long quantite) {
        this.quantite = quantite;
    }

    public Plat getPlat() {
        return plat;
    }

    public void setPlat(Plat plat) {
        this.plat = plat;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
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
        if (!(object instanceof Composer)) {
            return false;
        }
        Composer other = (Composer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Composer[ id=" + id + " ]";
    }
    
}
