package com.ejb;

import com.entity.BlogReader;
import java.util.List;
import javax.ejb.Local;

/**
 * Interfaz: BlogReaderFacadeLocal
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Local
public interface BlogReaderFacadeLocal {

    void create(BlogReader blogReader);

    void edit(BlogReader blogReader);

    void remove(BlogReader blogReader);

    BlogReader find(Object id);

    List<BlogReader> findAll();

    List<BlogReader> findRange(int[] range);

    int count();
    
}
