package com.danillo.crud.service;

import com.danillo.crud.dto.UsuarioDTO;
import com.danillo.crud.model.Usuario;
import com.danillo.crud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    public List<UsuarioDTO> findAll(){
        List<Usuario> result = repository.findAll();
        return result.stream().map(UsuarioDTO::new).toList();
    }

    public UsuarioDTO findById(@PathVariable Long id){
        Usuario result = repository.findById(id).get();
        return new UsuarioDTO(result);
    }

    public UsuarioDTO insert(UsuarioDTO dados){
        Usuario usuario = new Usuario();

        usuario.setId(dados.getId());
        usuario.setNome(dados.getNome());
        usuario.setCpf(dados.getCpf());
        usuario.setEmail(dados.getEmail());

        Usuario result = repository.save(usuario);
        return new UsuarioDTO(result);
    }
}
