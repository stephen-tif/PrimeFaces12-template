package com.ejb;

import com.entity.Reader;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Clase: ReaderFacade
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Stateless
public class ReaderFacade extends AbstractFacade<Reader> implements ReaderFacadeLocal {

    @PersistenceContext(unitName = "pruebaTecnicaBandesalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ReaderFacade() {
        super(Reader.class);
    }
    
}
