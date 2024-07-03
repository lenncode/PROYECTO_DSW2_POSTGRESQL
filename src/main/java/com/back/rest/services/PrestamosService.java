package com.back.rest.services;

import java.util.List;

import com.back.rest.entity.Prestamos;

public interface PrestamosService {
    List<Prestamos> getAllPrestamos();
    Prestamos createPrestamo(Prestamos prestamo);
    Prestamos updatePrestamo(Long id, Prestamos prestamoDetails);
    void deletePrestamo(Long id);
}
