package com.back.rest.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.back.rest.entity.UsuariosPremium;
import com.back.rest.repository.UsuariosPremiumRepository;
import com.back.rest.services.UsuariosPremiumService;

@Service
public class UsuariosPremiumServiceImpl implements UsuariosPremiumService {
    @Autowired
    private UsuariosPremiumRepository usuariosPremiumRepository;

    @Override
    public List<UsuariosPremium> getAllUsuariosPremium() {
        return usuariosPremiumRepository.findAll();
    }

    @Override
    public UsuariosPremium createUsuarioPremium(UsuariosPremium usuarioPremium) {
        return usuariosPremiumRepository.save(usuarioPremium);
    }

    @Override
    public UsuariosPremium updateUsuarioPremium(Long id, UsuariosPremium usuarioDetails) {
        UsuariosPremium usuario = usuariosPremiumRepository.findById(id).get();
        usuario.setNombre(usuarioDetails.getNombre());
        usuario.setApellido(usuarioDetails.getApellido());
        usuario.setEmail(usuarioDetails.getEmail());
        usuario.setPassword(usuarioDetails.getPassword()
        usuario.setFechaNacimiento(usuarioDetails.getFechaNacimiento());
        usuario.setEstado(usuarioDetails.getEstado());
        return usuariosPremiumRepository.save(usuario);
    }

    @Override
    public void deleteUsuarioPremium(Long id) {
        UsuariosPremium usuario = usuariosPremiumRepository.findById(id).get();
        usuariosPremiumRepository.delete(usuario);
    }
}
