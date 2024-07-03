package com.back.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.rest.entity.Prestamos;
import com.back.rest.repository.PrestamosRepository;
import com.back.rest.services.PrestamosService;

@Service
public class PrestamosServiceImpl implements PrestamosService  {
    @Autowired
    private PrestamosRepository prestamosRepository;

    @Override
    public List<Prestamos> getAllPrestamos() {
        return prestamosRepository.findAll();
    }

    @Override
    public Prestamos createPrestamo(Prestamos prestamo) {
        return prestamosRepository.save(prestamo);
    }

    @Override
    public Prestamos updatePrestamo(Long id, Prestamos prestamoDetails) {
        Prestamos prestamo = prestamosRepository.findById(id).get();
        prestamo.setIdUsuario(prestamoDetails.getIdUsuario());
        prestamo.setIdLibro(prestamoDetails.getIdLibro());
        prestamo.setFechaPrestamo(prestamoDetails.getFechaPrestamo());
        prestamo.setFechaDevolucion(prestamoDetails.getFechaDevolucion());
        prestamo.setEstado(prestamoDetails.getEstado());
        return prestamosRepository.save(prestamo);
    }

    @Override
    public void deletePrestamo(Long id) {
        Prestamos prestamo = prestamosRepository.findById(id).get();
        prestamosRepository.delete(prestamo);
    }
}
