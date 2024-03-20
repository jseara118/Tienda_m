package com.tienda_m.domain;

import jakarta.annotation.Generated;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "categoria")
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id //el siguiente atributo es el primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria") //especificar como se llama en la base de datos
    private Long idCategoria;

    private String descripcion;
    private String rutaImagen;
    private boolean activo;
    
    @OneToMany
    @JoinColumn(name="id_categoria", updatable = false)
    private List<Producto> productos;
}

