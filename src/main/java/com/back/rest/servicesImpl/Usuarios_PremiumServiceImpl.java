package com.back.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.rest.entity.Usuarios_Premium;
import com.back.rest.repository.Usuarios_PremiumRepository;
import com.back.rest.services.Usuarios_PremiumService;

@Service
public class Usuarios_PremiumServiceImpl implements Usuarios_PremiumService {
    @Autowired
    private Usuarios_PremiumRepository usuariosPremiumRepository;

    @Override
    public List<Usuarios_Premium> getAllUsuariosPremium() {
        return usuariosPremiumRepository.findAll();
    }

    @Override
    public Usuarios_Premium createUsuarioPremium(Usuarios_Premium usuarioPremium) {
        return usuariosPremiumRepository.save(usuarioPremium);
    }

    @Override
    public Usuarios_Premium updateUsuarioPremium(Long id, Usuarios_Premium usuarioDetails) {
        Usuarios_Premium usuario = usuariosPremiumRepository.findById(id).get();
        usuario.setNombre(usuarioDetails.getNombre());
        usuario.setApellido(usuarioDetails.getApellido());
        usuario.setEmail(usuarioDetails.getEmail());
        usuario.setContraseña(usuarioDetails.getContraseña());
        usuario.setFechaNacimiento(usuarioDetails.getFechaNacimiento());
        usuario.setEstado(usuarioDetails.getEstado());
        return usuariosPremiumRepository.save(usuario);
    }

    @Override
    public void deleteUsuarioPremium(Long id) {
        Usuarios_Premium usuario = usuariosPremiumRepository.findById(id).get();
        usuariosPremiumRepository.delete(usuario);
    }
}
