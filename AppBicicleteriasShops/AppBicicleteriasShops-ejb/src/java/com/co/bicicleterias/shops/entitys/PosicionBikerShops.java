/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.co.bicicleterias.shops.entitys;

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
 * @author jhon
 */
@Entity
@Table(name = "posicion_biker_shops")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PosicionBikerShops.findAll", query = "SELECT p FROM PosicionBikerShops p"),
    @NamedQuery(name = "PosicionBikerShops.findById", query = "SELECT p FROM PosicionBikerShops p WHERE p.id = :id"),
    @NamedQuery(name = "PosicionBikerShops.findByNameShops", query = "SELECT p FROM PosicionBikerShops p WHERE p.nameShops = :nameShops"),
    @NamedQuery(name = "PosicionBikerShops.findByLatitud", query = "SELECT p FROM PosicionBikerShops p WHERE p.latitud = :latitud"),
    @NamedQuery(name = "PosicionBikerShops.findByLongitud", query = "SELECT p FROM PosicionBikerShops p WHERE p.longitud = :longitud")})
public class PosicionBikerShops implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 40)
    @Column(name = "name_shops")
    private String nameShops;
    @Column(name = "latitud")
    private BigInteger latitud;
    @Column(name = "longitud")
    private BigInteger longitud;

    public PosicionBikerShops() {
    }

    public PosicionBikerShops(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameShops() {
        return nameShops;
    }

    public void setNameShops(String nameShops) {
        this.nameShops = nameShops;
    }

    public BigInteger getLatitud() {
        return latitud;
    }

    public void setLatitud(BigInteger latitud) {
        this.latitud = latitud;
    }

    public BigInteger getLongitud() {
        return longitud;
    }

    public void setLongitud(BigInteger longitud) {
        this.longitud = longitud;
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
        if (!(object instanceof PosicionBikerShops)) {
            return false;
        }
        PosicionBikerShops other = (PosicionBikerShops) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.co.bicicleterias.shops.entitys.PosicionBikerShops[ id=" + id + " ]";
    }
    
}
