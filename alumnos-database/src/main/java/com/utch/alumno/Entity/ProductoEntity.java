package com.utch.alumno.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(setterPrefix = "with") //Facilita los Getters y Setters
@Entity //Esta clase es tratada como entidad de la Base de Datos
@AllArgsConstructor //Constructor con parametros
@NoArgsConstructor //Constructor vacio
@Table (name = "productosIVF") //Crea una tabla, sustituye AAA por tus iniciales

public class ProductoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "productos")
    private Integer id;
    private String title;
    private double price;
    private String description;
}
