package com.ejb;

import com.entity.Blog;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase: BlogFacade
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Stateless
public class BlogFacade extends AbstractFacade<Blog> implements BlogFacadeLocal {

    @PersistenceContext(unitName = "pruebaTecnicaBandesalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BlogFacade() {
        super(Blog.class);
    }
    
}
