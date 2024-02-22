
package com.tienda_m.service;

import com.tienda_m.domain.Categoria;
import java.util.List; 

public interface CategoriaService {

    // se define la firma del metodo para obtener los registros de categoria, en forma de lista
    public List<Categoria> getCategorias(boolean activo);
    
    
    
    //se recupera un registro tomando el idCategoria como clave de busqueda
    
    public Categoria getCategoria( Categoria categoria);
    
    //Si idCategoria tiene un valor, se modifica ese regisgro,
    //Si idCategoria NO tiene valor, se inserta un nuevo registro
    
    public void save (Categoria categoriia);
    
    //Se elimina el registro que tenga el valor del IdCategoria pasado
    
    public void delete (Categoria categoria);
}
