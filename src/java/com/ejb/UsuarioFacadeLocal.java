package com.ejb;

import com.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 * Interfaz: UsuarioFacadeLocal
 * Versión: 1.0
 * CopyRight: Visible Outsource
 * @author admin
 */
@Local
public interface UsuarioFacadeLocal {

    void create(Usuario usuario);

    void edit(Usuario usuario);

    void remove(Usuario usuario);

    Usuario find(Object id);

    List<Usuario> findAll();

    List<Usuario> findRange(int[] range);
    
    Usuario verifyLogin(Usuario us);

    int count();
    
}
