package br.com.departamento.repository;

import br.com.departamento.entity.Authentication;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthenticationRepository extends JpaRepository<Authentication, Long> {
        Optional<Authentication> findById (Long IdUsuario);
        Optional<Authentication> finByUser (String NomeUsuario);



}
