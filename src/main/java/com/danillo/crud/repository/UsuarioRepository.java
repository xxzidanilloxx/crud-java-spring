package com.danillo.crud.repository;

import com.danillo.crud.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByCpf(Long cpf);

    boolean existsByEmail(String email);

    boolean existsByCpfAndIdNot(Long cpf, Long id);

    boolean existsByEmailAndIdNot(String email, Long id);
}
