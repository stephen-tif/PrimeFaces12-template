package com.entity;

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
 * Clase: Reader
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Entity
@Table(catalog = "prueba_bandesal", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reader.findAll", query = "SELECT r FROM Reader r")
    , @NamedQuery(name = "Reader.findById", query = "SELECT r FROM Reader r WHERE r.id = :id")
    , @NamedQuery(name = "Reader.findByName", query = "SELECT r FROM Reader r WHERE r.name = :name")})
public class Reader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(nullable = false, length = 50)
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idReader")
    private List<BlogReader> blogReaderList;

    public Reader() {
    }

    public Reader(Integer id) {
        this.id = id;
    }

    public Reader(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public List<BlogReader> getBlogReaderList() {
        return blogReaderList;
    }

    public void setBlogReaderList(List<BlogReader> blogReaderList) {
        this.blogReaderList = blogReaderList;
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
        if (!(object instanceof Reader)) {
            return false;
        }
        Reader other = (Reader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.Reader[ id=" + id + " ]";
    }

}
