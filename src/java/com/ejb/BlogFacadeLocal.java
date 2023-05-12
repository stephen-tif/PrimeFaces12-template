package com.ejb;

import com.entity.Blog;
import java.util.List;
import javax.ejb.Local;

/**
 * Interfaz: BlogFacadeLocal
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Local
public interface BlogFacadeLocal {

    void create(Blog blog);

    void edit(Blog blog);

    void remove(Blog blog);

    Blog find(Object id);

    List<Blog> findAll();

    List<Blog> findRange(int[] range);

    int count();
    
}
