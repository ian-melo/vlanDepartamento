package br.com.departamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.departamento.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	@Query(value = "CALL spLogin(:idUsuario, :passwd);", nativeQuery = true)
	int login(@Param("idUsuario") long id, @Param("passwd") String password);
}
