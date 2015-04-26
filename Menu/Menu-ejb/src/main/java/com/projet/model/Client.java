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
@Table(name = "client")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findById", query = "SELECT c FROM Client c WHERE c.id = :id"),
    @NamedQuery(name = "Client.findByIdRs", query = "SELECT c FROM Client c WHERE c.idRs = :idRs"),
    @NamedQuery(name = "Client.findByPointFidelite", query = "SELECT c FROM Client c WHERE c.pointFidelite = :pointFidelite"),
    @NamedQuery(name = "Client.findByAccessTokenRs", query = "SELECT c FROM Client c WHERE c.accessTokenRs = :accessTokenRs"),
    @NamedQuery(name = "Client.findByUsernameRs", query = "SELECT c FROM Client c WHERE c.usernameRs = :usernameRs"),
    @NamedQuery(name = "Client.findByFirstnameRs", query = "SELECT c FROM Client c WHERE c.firstnameRs = :firstnameRs"),
    @NamedQuery(name = "Client.findByLastnameRs", query = "SELECT c FROM Client c WHERE c.lastnameRs = :lastnameRs"),
    @NamedQuery(name = "Client.findByPhotoRs", query = "SELECT c FROM Client c WHERE c.photoRs = :photoRs"),
    @NamedQuery(name = "Client.findByLinkRs", query = "SELECT c FROM Client c WHERE c.linkRs = :linkRs"),
    @NamedQuery(name = "Client.findByGenderRs", query = "SELECT c FROM Client c WHERE c.genderRs = :genderRs"),
    @NamedQuery(name = "Client.findByTypeRs", query = "SELECT c FROM Client c WHERE c.typeRs = :typeRs")})
public class Client implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "id_rs")
    private String idRs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "point_fidelite")
    private int pointFidelite;
    @Size(max = 255)
    @Column(name = "access_token_rs")
    private String accessTokenRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "username_rs")
    private String usernameRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "firstname_rs")
    private String firstnameRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "lastname_rs")
    private String lastnameRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "photo_rs")
    private String photoRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "link_rs")
    private String linkRs;
    @Basic(optional = false)
    @NotNull
    @Column(name = "gender_rs")
    private int genderRs;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "type_rs")
    private String typeRs;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Reservation> reservationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<FeedBack> feedBackList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Commande> commandeList;

    public Client() {
    }

    public Client(Integer id) {
        this.id = id;
    }

    public Client(Integer id, int pointFidelite, String usernameRs, String firstnameRs, String lastnameRs, String photoRs, String linkRs, int genderRs, String typeRs) {
        this.id = id;
        this.pointFidelite = pointFidelite;
        this.usernameRs = usernameRs;
        this.firstnameRs = firstnameRs;
        this.lastnameRs = lastnameRs;
        this.photoRs = photoRs;
        this.linkRs = linkRs;
        this.genderRs = genderRs;
        this.typeRs = typeRs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdRs() {
        return idRs;
    }

    public void setIdRs(String idRs) {
        this.idRs = idRs;
    }

    public int getPointFidelite() {
        return pointFidelite;
    }

    public void setPointFidelite(int pointFidelite) {
        this.pointFidelite = pointFidelite;
    }

    public String getAccessTokenRs() {
        return accessTokenRs;
    }

    public void setAccessTokenRs(String accessTokenRs) {
        this.accessTokenRs = accessTokenRs;
    }

    public String getUsernameRs() {
        return usernameRs;
    }

    public void setUsernameRs(String usernameRs) {
        this.usernameRs = usernameRs;
    }

    public String getFirstnameRs() {
        return firstnameRs;
    }

    public void setFirstnameRs(String firstnameRs) {
        this.firstnameRs = firstnameRs;
    }

    public String getLastnameRs() {
        return lastnameRs;
    }

    public void setLastnameRs(String lastnameRs) {
        this.lastnameRs = lastnameRs;
    }

    public String getPhotoRs() {
        return photoRs;
    }

    public void setPhotoRs(String photoRs) {
        this.photoRs = photoRs;
    }

    public String getLinkRs() {
        return linkRs;
    }

    public void setLinkRs(String linkRs) {
        this.linkRs = linkRs;
    }

    public int getGenderRs() {
        return genderRs;
    }

    public void setGenderRs(int genderRs) {
        this.genderRs = genderRs;
    }

    public String getTypeRs() {
        return typeRs;
    }

    public void setTypeRs(String typeRs) {
        this.typeRs = typeRs;
    }

    @XmlTransient
    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    @XmlTransient
    public List<FeedBack> getFeedBackList() {
        return feedBackList;
    }

    public void setFeedBackList(List<FeedBack> feedBackList) {
        this.feedBackList = feedBackList;
    }

    @XmlTransient
    public List<Commande> getCommandeList() {
        return commandeList;
    }

    public void setCommandeList(List<Commande> commandeList) {
        this.commandeList = commandeList;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "matier.Client[ id=" + id + " ]";
    }
    
}
