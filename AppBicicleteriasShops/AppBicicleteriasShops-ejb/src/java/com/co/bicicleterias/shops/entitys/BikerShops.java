/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.co.bicicleterias.shops.entitys;

import java.io.Serializable;
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
 * @author jhon
 */
@Entity
@Table(name = "biker_shops")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BikerShops.findAll", query = "SELECT b FROM BikerShops b"),
    @NamedQuery(name = "BikerShops.findByName", query = "SELECT b FROM BikerShops b WHERE b.name = :name"),
    @NamedQuery(name = "BikerShops.findByDocument", query = "SELECT b FROM BikerShops b WHERE b.document = :document"),
    @NamedQuery(name = "BikerShops.findByLogin", query = "SELECT b FROM BikerShops b WHERE b.login = :login"),
    @NamedQuery(name = "BikerShops.findByPassword", query = "SELECT b FROM BikerShops b WHERE b.password = :password"),
    @NamedQuery(name = "BikerShops.findByMail", query = "SELECT b FROM BikerShops b WHERE b.mail = :mail"),
    @NamedQuery(name = "BikerShops.findByPhone", query = "SELECT b FROM BikerShops b WHERE b.phone = :phone"),
    @NamedQuery(name = "BikerShops.findById", query = "SELECT b FROM BikerShops b WHERE b.id = :id")})
public class BikerShops implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 30)
    @Column(name = "name")
    private String name;
    @Column(name = "document")
    private Long document;
    @Size(max = 30)
    @Column(name = "login")
    private String login;
    @Size(max = 30)
    @Column(name = "password")
    private String password;
    @Size(max = 40)
    @Column(name = "mail")
    private String mail;
    @Column(name = "phone")
    private Long phone;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;

    public BikerShops() {
    }

    public BikerShops(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDocument() {
        return document;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof BikerShops)) {
            return false;
        }
        BikerShops other = (BikerShops) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.bicicleterias.shops.entitys.BikerShops[ id=" + id + " ]";
    }
    
}
