package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "Categoria")
public class Categoria implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private long idCategoria;
    
    
    private String descripcion;
    private String ruta_imagen;
    private boolean activo;

    public Categoria(long idCategoria, String descripcion, String ruta_imagen, boolean activo) {
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.ruta_imagen = ruta_imagen;
        this.activo = activo;
    }

    public Categoria() {
    }
    
    
    

}
