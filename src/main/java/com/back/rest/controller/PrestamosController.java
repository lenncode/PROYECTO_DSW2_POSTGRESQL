package com.back.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.back.rest.entity.Prestamos;
import com.back.rest.services.PrestamosService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamosController {
    @Autowired
    private PrestamosService prestamosService;

    @GetMapping
    public List<Prestamos> getAllPrestamos() {
        return prestamosService.getAllPrestamos();
    }

    @PostMapping
    public Prestamos createPrestamo(@RequestBody Prestamos prestamo) {
        return prestamosService.createPrestamo(prestamo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamos> updatePrestamo(@PathVariable Long id, @RequestBody Prestamos prestamoDetails) {
        Prestamos updatedPrestamo = prestamosService.updatePrestamo(id, prestamoDetails);
        return ResponseEntity.ok(updatedPrestamo);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deletePrestamo(@PathVariable Long id) {
        prestamosService.deletePrestamo(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

