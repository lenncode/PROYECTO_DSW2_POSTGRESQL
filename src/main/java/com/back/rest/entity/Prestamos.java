package com.back.rest.entity;

//import javax.persistence.*;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Prestamos")
public class Prestamos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPrestamo;

    private Long idUsuario;
    private Long idLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;
    private Byte estado;

    // Getters y Setters
    
    public Long getIdPrestamo() {
        return idPrestamo;
}
    
}