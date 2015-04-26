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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "produit_en_stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProduitEnStock.findAll", query = "SELECT p FROM ProduitEnStock p"),
    @NamedQuery(name = "ProduitEnStock.findById", query = "SELECT p FROM ProduitEnStock p WHERE p.id = :id"),
    @NamedQuery(name = "ProduitEnStock.findByDateAchat", query = "SELECT p FROM ProduitEnStock p WHERE p.dateAchat = :dateAchat"),
    @NamedQuery(name = "ProduitEnStock.findByQuantiteStocker", query = "SELECT p FROM ProduitEnStock p WHERE p.quantiteStocker = :quantiteStocker")})
public class ProduitEnStock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "date_achat")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAchat;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantite_stocker")
    private Double quantiteStocker;
    @JoinColumn(name = "ingredient", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Ingredient ingredient;
    @JoinColumn(name = "fournisseur", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Fournisseur fournisseur;

    public ProduitEnStock() {
    }

    public ProduitEnStock(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateAchat() {
        return dateAchat;
    }

    public void setDateAchat(Date dateAchat) {
        this.dateAchat = dateAchat;
    }

    public Double getQuantiteStocker() {
        return quantiteStocker;
    }

    public void setQuantiteStocker(Double quantiteStocker) {
        this.quantiteStocker = quantiteStocker;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public Fournisseur getFournisseur() {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur) {
        this.fournisseur = fournisseur;
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
        if (!(object instanceof ProduitEnStock)) {
            return false;
        }
        ProduitEnStock other = (ProduitEnStock) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.ProduitEnStock[ id=" + id + " ]";
    }
    
}
