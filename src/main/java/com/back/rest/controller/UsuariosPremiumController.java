package com.back.rest.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.back.rest.entity.UsuariosPremium;
import com.back.rest.services.UsuariosPremiumService;

@RestController
@RequestMapping("/api/usuarios-premium")
public class UsuariosPremiumController {
    @Autowired
    private UsuariosPremiumService usuariosPremiumService;

    @GetMapping
    public List<UsuariosPremium> getAllUsuariosPremium() {
        return usuariosPremiumService.getAllUsuariosPremium();
    }

    @PostMapping
    public UsuariosPremium createUsuarioPremium(@RequestBody UsuariosPremium usuarioPremium) {
        return usuariosPremiumService.createUsuarioPremium(usuarioPremium);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UsuariosPremium> updateUsuarioPremium(@PathVariable Long id, @RequestBody UsuariosPremium usuarioDetails) {
        UsuariosPremium updatedUsuario = usuariosPremiumService.updateUsuarioPremium(id, usuarioDetails);
        return ResponseEntity.ok(updatedUsuario);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteUsuarioPremium(@PathVariable Long id) {
        usuariosPremiumService.deleteUsuarioPremium(id);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}
