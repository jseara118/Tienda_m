package com.tienda_m.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //el siguiente atributo es el primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto") //especificar como se llama en la base de datos
    private Long idProducto;
//    private Long idCategoria; // ya no se usa porque categoria se volvio objeto
    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;
    private String rutaImagen;
    private boolean activo;
    
    @ManyToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
}
