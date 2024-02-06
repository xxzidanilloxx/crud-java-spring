package com.danillo.crud.service;

import com.danillo.crud.dto.UsuarioDTO;
import com.danillo.crud.exception.RecordNotFoundException;
import com.danillo.crud.model.Usuario;
import com.danillo.crud.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository repository;

    @Transactional
    public List<UsuarioDTO> findAll(){
        List<Usuario> result = repository.findAll();
        return result.stream().map(UsuarioDTO::new).toList();
    }

    @Transactional
    public UsuarioDTO findById(@PathVariable Long id){
        Usuario result = repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));
        return new UsuarioDTO(result);
    }

    @Transactional
    public UsuarioDTO insert(UsuarioDTO dados){
        Usuario usuario = new Usuario();

        usuario.setId(dados.getId());
        usuario.setNome(dados.getNome());
        usuario.setCpf(dados.getCpf());
        usuario.setEmail(dados.getEmail());

        Usuario result = repository.save(usuario);
        return new UsuarioDTO(result);
    }

    @Transactional
    public UsuarioDTO update(Long id, UsuarioDTO dados){
        Usuario usuario = repository.findById(id).orElseThrow(() -> new RecordNotFoundException(id));

        if(usuario != null){
            usuario.setId(dados.getId());
            usuario.setNome(dados.getNome());
            usuario.setCpf(dados.getCpf());
            usuario.setEmail(dados.getEmail());

            Usuario result = repository.save(usuario);
            return new UsuarioDTO(result);
        }
        return null;
    }

    @Transactional
    public void delete(Long id){
        repository.deleteById(id);
    }
}
