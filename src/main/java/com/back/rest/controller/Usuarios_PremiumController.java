package com.back.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.back.rest.entity.Usuarios_Premium;
import com.back.rest.services.Usuarios_PremiumService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios-premium")
public class Usuarios_PremiumController {
    @Autowired
    private Usuarios_PremiumService usuariosPremiumService;

    @GetMapping
    public List<Usuarios_Premium> getAllUsuariosPremium() {
        return usuariosPremiumService.getAllUsuariosPremium();
    }

    @PostMapping
    public Usuarios_Premium createUsuarioPremium(@RequestBody Usuarios_Premium usuarioPremium) {
        return usuariosPremiumService.createUsuarioPremium(usuarioPremium);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuarios_Premium> updateUsuarioPremium(@PathVariable Long id, @RequestBody Usuarios_Premium usuarioDetails) {
        Usuarios_Premium updatedUsuario = usuariosPremiumService.updateUsuarioPremium(id, usuarioDetails);
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
