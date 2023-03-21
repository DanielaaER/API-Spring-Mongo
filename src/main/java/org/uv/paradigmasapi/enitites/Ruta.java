/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.paradigmasapi.enitites;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Danielaa
 */
@Entity
@Table(name = "ruta")
@Data
@AllArgsConstructor
public class Ruta {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column
    private int id;

    @Column(nullable = false)
    private String[] listaRuta;

    @Column(nullable = false)
    private int distancia;
}
