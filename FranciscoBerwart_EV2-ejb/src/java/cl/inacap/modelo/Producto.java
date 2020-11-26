/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.modelo;

/**
 *
 * @author francisco
 */
public class Producto {
    
    private int codigo;
    private String nombre;
    private int precio;
    private int stock;
    private String categoriaS;
    
    private Categoria categoria;
    
    /**
     * Constructor por defecto.
     */
    public Producto() {
    }
    
    /**
     * Constructor con parametros.
     * @param codigo
     * @param nombre
     * @param precio
     * @param stock
     * @param categoria 
     */
    public Producto(int codigo, String nombre, int precio, int stock, Categoria categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    
    
    
    
    
}
