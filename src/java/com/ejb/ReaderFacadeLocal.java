package com.ejb;

import com.entity.Reader;
import java.util.List;
import javax.ejb.Local;

/**
 * Interfaz: ReaderFacadeLocal
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Local
public interface ReaderFacadeLocal {

    void create(Reader reader);

    void edit(Reader reader);

    void remove(Reader reader);

    Reader find(Object id);

    List<Reader> findAll();

    List<Reader> findRange(int[] range);

    int count();
    
}
