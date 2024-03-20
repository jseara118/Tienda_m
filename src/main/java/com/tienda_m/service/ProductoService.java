package com.tienda_m.service;

import com.tienda_m.domain.Producto;
import java.util.List;


public interface ProductoService {

    // se define la firma del metodo para obtener los registros de producto, en forma de lista
    public List<Producto> getProductos(boolean activo);
    
    
    // se recupera un registro tomando el idProducto como clave de busqueda
    public Producto getProducto(Producto producto);
    
    // si idProducto tiene un valor, se modifica ese registro,
    // si idProducto NO tiene valor, se inserta un nuevo registro
    public void save(Producto producto);
    
    // se elimina ek registgro que tenga el valor del idProducto pasado
    public void delete(Producto producto);
    
    // esta consulta utiliza consultas ampliadas query
    public List<Producto> metodoJPA(double precioInf, double precioSup);
    
    // esta consulta utiliza consultas JPQL
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
    // esta consulta utiliza consultas JPQL
    public List<Producto> metodoSQL(double precioInf, double precioSup);
}
