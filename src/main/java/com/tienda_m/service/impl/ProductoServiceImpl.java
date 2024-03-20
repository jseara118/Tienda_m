package com.tienda_m.service.impl;

import com.tienda_m.dao.ProductoDao;
import com.tienda_m.domain.Producto;
import com.tienda_m.service.ProductoService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Producto> getProductos(boolean activo) {
        var lista = productoDao.findAll();

        if (activo) { // si se quieren solo las productos activas
            lista.removeIf(c -> !c.isActivo());
        }

        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }

    @Transactional
    @Override
    public void save(Producto producto) {
        productoDao.save(producto);
    }

    @Transactional
    @Override
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoJPA(double precioInf, double precioSup) {
        return productoDao.findByPrecioBetweenOrderByDescripcion(precioInf, precioSup);

    }

    // esta consulta utiliza consultas JPQL
    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoJPQL(double precioInf, double precioSup) {
        return productoDao.metodoJPQL(precioInf, precioSup);

    }

    // esta consulta utiliza consultas JPQL
    @Override
    @Transactional(readOnly = true)
    public List<Producto> metodoSQL(double precioInf, double precioSup) {
        return productoDao.metodoSQL(precioInf, precioSup);
    }
    
    @Override
    public List<Producto> findByDescripcion(String descripcion) {
        return productoDao.findByDescripcion(descripcion);
    
}
    
}


