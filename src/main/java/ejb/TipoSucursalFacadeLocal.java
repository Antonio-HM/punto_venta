/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import entity.TipoSucursal;
import java.util.List;

/**
 *
 * @author eddie.hernandezusam
 */
public interface TipoSucursalFacadeLocal {

    void create(TipoSucursal st);
    void edit(TipoSucursal st);
    void delete(TipoSucursal st);
    List<TipoSucursal> findAll();
    TipoSucursal find (Object id);
    
    
}
