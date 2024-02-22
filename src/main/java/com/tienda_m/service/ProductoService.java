
package com.tienda_m.service;

import com.tienda_m.domain.Producto;
import java.util.List; 

public interface ProductoService {

    // se define la firma del metodo para obtener los registros de producto, en forma de lista
    public List<Producto> getProductos(boolean activo);
    
    
    
    //se recupera un registro tomando el idProducto como clave de busqueda
    
    public Producto getProducto( Producto producto);
    
    //Si idProducto tiene un valor, se modifica ese regisgro,
    //Si idProducto NO tiene valor, se inserta un nuevo registro
    
    public void save (Producto categoriia);
    
    //Se elimina el registro que tenga el valor del IdProducto pasado
    
    public void delete (Producto producto);
}
