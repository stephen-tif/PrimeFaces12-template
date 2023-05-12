package com.controller;

import com.entity.Blog;
import com.ejb.BlogFacadeLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 * Clase: BlogController
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */

@Named
@ViewScoped
public class BlogController implements Serializable{

    @EJB
    private BlogFacadeLocal blogEjb;
    private Blog blog;
    private List<Blog> listaBlog;

    public List<Blog> getListaBlog() {
        return listaBlog;
    }

    public void setListaBlog(List<Blog> listaBlog) {
        this.listaBlog = listaBlog;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    @PostConstruct
    public void init() {
        blog = new Blog();
        mostrar();
    }
    
    public void mostrar(){
        try{
            listaBlog = blogEjb.findAll();
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void guardar(){
        try{
            blogEjb.create(blog);
            this.limpiar();
            info_message("Exito!","Registro guardado con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void modificar(){
        try{
            blogEjb.edit(blog);
            this.limpiar();
            info_message("Exito!","Se ha modificado el registro con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void eliminar(){
        try{
            blogEjb.remove(blog);
            this.limpiar();
            info_message("Exito!","Se ha eliminado el registro con exito!");
        }catch(Exception ex){
            throw ex;
        }
    }
    
    public void limpiar(){
        blog = new Blog();
        mostrar();
    }
    
    //Alerts
    public void info_message(String summary, String detail){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }  
    
}
