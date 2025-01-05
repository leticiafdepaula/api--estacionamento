package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repositorio.UsuarioRepositorio;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepositorio usuarioRepositorio;

}
