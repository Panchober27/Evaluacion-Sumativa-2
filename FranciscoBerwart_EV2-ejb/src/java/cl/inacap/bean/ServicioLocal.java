/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bean;

import cl.inacap.modelo.Producto;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author franc
 */
@Local
public interface ServicioLocal {

    Producto buscarProducto(int codigo);
    
    List<Producto> getProductos();
    
    String vender(int codigo, int cantidad);
    
}
