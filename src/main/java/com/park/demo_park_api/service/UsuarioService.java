package com.park.demo_park_api.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.park.demo_park_api.repositorio.UsuarioRepositorio;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;

}
