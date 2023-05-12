package com.entity;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase: BlogReader
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Entity
@Table(name = "blog_reader", catalog = "prueba_bandesal", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BlogReader.findAll", query = "SELECT b FROM BlogReader b")
    , @NamedQuery(name = "BlogReader.findById", query = "SELECT b FROM BlogReader b WHERE b.id = :id")})
public class BlogReader implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @JoinColumn(name = "IdBlog", referencedColumnName = "Id", nullable = false)
    @ManyToOne(optional = false)
    private Blog idBlog;
    @JoinColumn(name = "IdReader", referencedColumnName = "Id", nullable = false)
    @ManyToOne(optional = false)
    private Reader idReader;

    public BlogReader() {
    }

    public BlogReader(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Blog getIdBlog() {
        return idBlog;
    }

    public void setIdBlog(Blog idBlog) {
        this.idBlog = idBlog;
    }

    public Reader getIdReader() {
        return idReader;
    }

    public void setIdReader(Reader idReader) {
        this.idReader = idReader;
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
        if (!(object instanceof BlogReader)) {
            return false;
        }
        BlogReader other = (BlogReader) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entity.BlogReader[ id=" + id + " ]";
    }
    
}