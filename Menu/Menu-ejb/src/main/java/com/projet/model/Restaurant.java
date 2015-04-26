/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projet.model;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author DNS
 */
@Entity
@Table(name = "restaurant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Restaurant.findAll", query = "SELECT r FROM Restaurant r"),
    @NamedQuery(name = "Restaurant.findById", query = "SELECT r FROM Restaurant r WHERE r.id = :id"),
    @NamedQuery(name = "Restaurant.findByAPropos", query = "SELECT r FROM Restaurant r WHERE r.aPropos = :aPropos"),
    @NamedQuery(name = "Restaurant.findByAdresse", query = "SELECT r FROM Restaurant r WHERE r.adresse = :adresse"),
    @NamedQuery(name = "Restaurant.findByDescription", query = "SELECT r FROM Restaurant r WHERE r.description = :description"),
    @NamedQuery(name = "Restaurant.findByEvenement", query = "SELECT r FROM Restaurant r WHERE r.evenement = :evenement"),
    @NamedQuery(name = "Restaurant.findByHistorique", query = "SELECT r FROM Restaurant r WHERE r.historique = :historique"),
    @NamedQuery(name = "Restaurant.findByLatitude", query = "SELECT r FROM Restaurant r WHERE r.latitude = :latitude"),
    @NamedQuery(name = "Restaurant.findByLogo", query = "SELECT r FROM Restaurant r WHERE r.logo = :logo"),
    @NamedQuery(name = "Restaurant.findByLongitude", query = "SELECT r FROM Restaurant r WHERE r.longitude = :longitude"),
    @NamedQuery(name = "Restaurant.findByNom", query = "SELECT r FROM Restaurant r WHERE r.nom = :nom"),
    @NamedQuery(name = "Restaurant.findByPrixRecu", query = "SELECT r FROM Restaurant r WHERE r.prixRecu = :prixRecu")})
public class Restaurant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "a_propos")
    private String aPropos;
    @Size(max = 255)
    @Column(name = "adresse")
    private String adresse;
    @Size(max = 255)
    @Column(name = "description")
    private String description;
    @Size(max = 255)
    @Column(name = "evenement")
    private String evenement;
    @Size(max = 255)
    @Column(name = "historique")
    private String historique;
    @Column(name = "latitude")
    private BigInteger latitude;
    @Size(max = 255)
    @Column(name = "logo")
    private String logo;
    @Column(name = "longitude")
    private BigInteger longitude;
    @Size(max = 255)
    @Column(name = "nom")
    private String nom;
    @Size(max = 255)
    @Column(name = "prix_recu")
    private String prixRecu;

    public Restaurant() {
    }

    public Restaurant(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAPropos() {
        return aPropos;
    }

    public void setAPropos(String aPropos) {
        this.aPropos = aPropos;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEvenement() {
        return evenement;
    }

    public void setEvenement(String evenement) {
        this.evenement = evenement;
    }

    public String getHistorique() {
        return historique;
    }

    public void setHistorique(String historique) {
        this.historique = historique;
    }

    public BigInteger getLatitude() {
        return latitude;
    }

    public void setLatitude(BigInteger latitude) {
        this.latitude = latitude;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public BigInteger getLongitude() {
        return longitude;
    }

    public void setLongitude(BigInteger longitude) {
        this.longitude = longitude;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrixRecu() {
        return prixRecu;
    }

    public void setPrixRecu(String prixRecu) {
        this.prixRecu = prixRecu;
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
        if (!(object instanceof Restaurant)) {
            return false;
        }
        Restaurant other = (Restaurant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Restaurant[ id=" + id + " ]";
    }
    
}
