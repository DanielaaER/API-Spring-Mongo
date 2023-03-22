package org.uv.paradigmasapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;

/* @author miran */

@Entity
@Table(name = "rutas")
@Data
@AllArgsConstructor

public class Ruta {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long _id;
    
    @Column
    private String[] ruta;
    @Column
    private int distancia;
    
}
