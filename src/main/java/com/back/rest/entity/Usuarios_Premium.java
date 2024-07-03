package com.back.rest.entity;

import java.time.LocalDate;

//import javax.persistence.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuarios_Premium")
@Getter
@Setter
public class Usuarios_Premium {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;
    private String apellido;
    private String email;
    private String contraseña;
    private LocalDate fechaNacimiento;
    private Byte estado;

    // Getters y Setters
    public Long getIdUsuario() {
        return idUsuario;
}
    
}