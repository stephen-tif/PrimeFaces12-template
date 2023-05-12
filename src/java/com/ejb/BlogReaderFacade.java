package com.ejb;

import com.entity.BlogReader;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase: BlogReaderFacade
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Stateless
public class BlogReaderFacade extends AbstractFacade<BlogReader> implements BlogReaderFacadeLocal {

    @PersistenceContext(unitName = "pruebaTecnicaBandesalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BlogReaderFacade() {
        super(BlogReader.class);
    }
    
}
