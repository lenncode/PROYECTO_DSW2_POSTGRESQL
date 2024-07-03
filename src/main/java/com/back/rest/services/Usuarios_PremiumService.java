package com.back.rest.services;

import java.util.List;

import com.back.rest.entity.Usuarios_Premium;

public interface Usuarios_PremiumService {
    List<Usuarios_Premium> getAllUsuariosPremium();
    Usuarios_Premium createUsuarioPremium(Usuarios_Premium usuarioPremium);
    Usuarios_Premium updateUsuarioPremium(Long id, Usuarios_Premium usuarioDetails);
    void deleteUsuarioPremium(Long id);
}
