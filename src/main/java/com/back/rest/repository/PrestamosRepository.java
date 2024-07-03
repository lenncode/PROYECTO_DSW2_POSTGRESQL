package com.back.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.back.rest.entity.Prestamos;

public interface PrestamosRepository extends JpaRepository<Prestamos, Long> {
}
