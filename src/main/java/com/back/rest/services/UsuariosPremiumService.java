package com.back.rest.services;

import java.util.List;

import com.back.rest.entity.UsuariosPremium;

public interface UsuariosPremiumService {
    List<UsuariosPremium> getAllUsuariosPremium();
    UsuariosPremium createUsuarioPremium(UsuariosPremium usuarioPremium);
    UsuariosPremium updateUsuarioPremium(Long id, UsuariosPremium usuarioDetails);
    void deleteUsuarioPremium(Long id);
}
