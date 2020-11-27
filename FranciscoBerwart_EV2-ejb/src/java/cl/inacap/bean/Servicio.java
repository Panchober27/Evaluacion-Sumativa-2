/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.bean;

import cl.inacap.modelo.Categoria;
import cl.inacap.modelo.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Singleton;

/**
 *
 * @author francisco
 */
@Singleton
public class Servicio implements ServicioLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    ArrayList<Producto> listaProducto = new ArrayList();

    public Servicio() {
        listaProducto.add(new Producto(1, "Mouse", 3000, 18, new Categoria(1, "Dispositivo de Entrada", "")));
        listaProducto.add(new Producto(2, "Teclado", 5000, 25, new Categoria(1, "Dispositivo de Entrada", "")));
        listaProducto.add(new Producto(3, "Pendrive 8GB", 4000, 10, new Categoria(2, "Almacenamiento", "")));
        listaProducto.add(new Producto(4, "HDD Externo 500GB", 50000, 6, new Categoria(2, "Almacenamiento", "")));
        listaProducto.add(new Producto(5, "Kit de Limpieza", 3000, 20, new Categoria(3, "Utilidades", "")));
        listaProducto.add(new Producto(6, "Cámara GoPro HD", 120000, 23, new Categoria(4, "Multimedia", "")));

    }

    @Override
    public Producto buscarProducto(int codigo) {
        // Se recupera desde la peticion el codigo para buscar.
        return listaProducto.get(codigo);
    }

    @Override
    public List<Producto> getProductos() {
        //Lista de Productos.
        return listaProducto;
    }

    @Override
    public String vender(int codigo, int cantidad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
