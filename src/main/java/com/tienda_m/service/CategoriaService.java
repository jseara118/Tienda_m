package com.tienda_m.service;

import com.tienda_m.domain.Categoria;
import java.util.List;


public interface CategoriaService {

    // se define la firma del metodo para obtener los registros de categoria, en forma de lista
    public List<Categoria> getCategorias(boolean activo);
    
    
    // se recupera un registro tomando el idCategoria como clave de busqueda
    public Categoria getCategoria(Categoria categoria);
    
    // si idCategoria tiene un valor, se modifica ese registro,
    // si idCategoria NO tiene valor, se inserta un nuevo registro
    public void save(Categoria categoria);
    
    // se elimina ek registgro que tenga el valor del idCategoria pasado
    public void delete(Categoria categoria);
}
