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
@Table(name = "table_restaurant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TableRestaurant.findAll", query = "SELECT t FROM TableRestaurant t"),
    @NamedQuery(name = "TableRestaurant.findById", query = "SELECT t FROM TableRestaurant t WHERE t.id = :id"),
    @NamedQuery(name = "TableRestaurant.findByLibelle", query = "SELECT t FROM TableRestaurant t WHERE t.libelle = :libelle"),
    @NamedQuery(name = "TableRestaurant.findByDescription", query = "SELECT t FROM TableRestaurant t WHERE t.description = :description"),
    @NamedQuery(name = "TableRestaurant.findByNombrePlace", query = "SELECT t FROM TableRestaurant t WHERE t.nombrePlace = :nombrePlace"),
    @NamedQuery(name = "TableRestaurant.findByPhoto", query = "SELECT t FROM TableRestaurant t WHERE t.photo = :photo"),
    @NamedQuery(name = "TableRestaurant.findByEtat", query = "SELECT t FROM TableRestaurant t WHERE t.etat = :etat")})
public class TableRestaurant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "libelle")
    private String libelle;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nombre_place")
    private int nombrePlace;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "photo")
    private String photo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "etat")
    private int etat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "table_restaurant")
    private List<Reservation> reservationList;

    public TableRestaurant() {
    }

    public TableRestaurant(Integer id) {
        this.id = id;
    }

    public TableRestaurant(Integer id, String libelle, String description, int nombrePlace, String photo, int etat) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.nombrePlace = nombrePlace;
        this.photo = photo;
        this.etat = etat;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNombrePlace() {
        return nombrePlace;
    }

    public void setNombrePlace(int nombrePlace) {
        this.nombrePlace = nombrePlace;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
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
        if (!(object instanceof TableRestaurant)) {
            return false;
        }
        TableRestaurant other = (TableRestaurant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.TableRestaurant[ id=" + id + " ]";
    }
    
}
