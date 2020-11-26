/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bean;

import javax.ejb.Local;

/**
 *
 * @author franc
 */
@Local
public interface ServicioLocal {

    public void buscarProducto();

    public void vender();

    public void getProductos();// Retorna Lista de Productos.
    
    
    
}
