/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "ingredient")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ingredient.findAll", query = "SELECT i FROM Ingredient i"),
    @NamedQuery(name = "Ingredient.findById", query = "SELECT i FROM Ingredient i WHERE i.id = :id"),
    @NamedQuery(name = "Ingredient.findByEtat", query = "SELECT i FROM Ingredient i WHERE i.etat = :etat"),
    @NamedQuery(name = "Ingredient.findByLibelle", query = "SELECT i FROM Ingredient i WHERE i.libelle = :libelle"),
    @NamedQuery(name = "Ingredient.findByPrixAchat", query = "SELECT i FROM Ingredient i WHERE i.prixAchat = :prixAchat"),
    @NamedQuery(name = "Ingredient.findByUnite", query = "SELECT i FROM Ingredient i WHERE i.unite = :unite")})
public class Ingredient implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "etat")
    private int etat;
    @Size(max = 255)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prix_achat")
    private double prixAchat;
    @Size(max = 255)
    @Column(name = "unite")
    private String unite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private List<ProduitEnStock> produitEnStockList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ingredient")
    private List<Composer> composerList;

    public Ingredient() {
    }

    public Ingredient(Integer id) {
        this.id = id;
    }

    public Ingredient(Integer id, int etat, double prixAchat) {
        this.id = id;
        this.etat = etat;
        this.prixAchat = prixAchat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrixAchat() {
        return prixAchat;
    }

    public void setPrixAchat(double prixAchat) {
        this.prixAchat = prixAchat;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }

    @XmlTransient
    public List<ProduitEnStock> getProduitEnStockList() {
        return produitEnStockList;
    }

    public void setProduitEnStockList(List<ProduitEnStock> produitEnStockList) {
        this.produitEnStockList = produitEnStockList;
    }

    @XmlTransient
    public List<Composer> getComposerList() {
        return composerList;
    }

    public void setComposerList(List<Composer> composerList) {
        this.composerList = composerList;
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
        if (!(object instanceof Ingredient)) {
            return false;
        }
        Ingredient other = (Ingredient) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Ingredient[ id=" + id + " ]";
    }
    
}
