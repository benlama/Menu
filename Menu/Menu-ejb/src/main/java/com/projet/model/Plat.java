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
@Table(name = "plat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Plat.findAll", query = "SELECT p FROM Plat p"),
    @NamedQuery(name = "Plat.findById", query = "SELECT p FROM Plat p WHERE p.id = :id"),
    @NamedQuery(name = "Plat.findByDescription", query = "SELECT p FROM Plat p WHERE p.description = :description"),
    @NamedQuery(name = "Plat.findByHistorique", query = "SELECT p FROM Plat p WHERE p.historique = :historique"),
    @NamedQuery(name = "Plat.findByInfosNutritionnels", query = "SELECT p FROM Plat p WHERE p.infosNutritionnels = :infosNutritionnels"),
    @NamedQuery(name = "Plat.findByLibelle", query = "SELECT p FROM Plat p WHERE p.libelle = :libelle"),
    @NamedQuery(name = "Plat.findByOrigine", query = "SELECT p FROM Plat p WHERE p.origine = :origine"),
    @NamedQuery(name = "Plat.findByPhoto", query = "SELECT p FROM Plat p WHERE p.photo = :photo"),
    @NamedQuery(name = "Plat.findByPrix", query = "SELECT p FROM Plat p WHERE p.prix = :prix"),
    @NamedQuery(name = "Plat.findByStatus", query = "SELECT p FROM Plat p WHERE p.status = :status")})
public class Plat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "historique")
    private String historique;
    @Size(max = 255)
    @Column(name = "infos_nutritionnels")
    private String infosNutritionnels;
    @Size(max = 255)
    @Column(name = "libelle")
    private String libelle;
    @Size(max = 255)
    @Column(name = "origine")
    private String origine;
    @Size(max = 255)
    @Column(name = "photo")
    private String photo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "prix")
    private Double prix;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plat")
    private List<PlatCategorie> platCategorieList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plat")
    private List<Composer> composerList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "plat")
    private List<LigneCmd> ligneCmdList;

    public Plat() {
    }

    public Plat(Integer id) {
        this.id = id;
    }

    public Plat(Integer id, int status) {
        this.id = id;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHistorique() {
        return historique;
    }

    public void setHistorique(String historique) {
        this.historique = historique;
    }

    public String getInfosNutritionnels() {
        return infosNutritionnels;
    }

    public void setInfosNutritionnels(String infosNutritionnels) {
        this.infosNutritionnels = infosNutritionnels;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @XmlTransient
    public List<PlatCategorie> getPlatCategorieList() {
        return platCategorieList;
    }

    public void setPlatCategorieList(List<PlatCategorie> platCategorieList) {
        this.platCategorieList = platCategorieList;
    }

    @XmlTransient
    public List<Composer> getComposerList() {
        return composerList;
    }

    public void setComposerList(List<Composer> composerList) {
        this.composerList = composerList;
    }

    @XmlTransient
    public List<LigneCmd> getLigneCmdList() {
        return ligneCmdList;
    }

    public void setLigneCmdList(List<LigneCmd> ligneCmdList) {
        this.ligneCmdList = ligneCmdList;
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
        if (!(object instanceof Plat)) {
            return false;
        }
        Plat other = (Plat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Plat[ id=" + id + " ]";
    }
    
}
