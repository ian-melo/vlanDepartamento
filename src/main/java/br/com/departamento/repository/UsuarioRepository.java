package br.com.departamento.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.departamento.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	@Query(value = "CALL spLogin(:idUsuario, :passwd);", nativeQuery = true)
	int authenticate(@Param("idUsuario") long id, @Param("passwd") String password);
	
	@Query(value = "CALL spTrazInfoUsuario(:idUsuario);", nativeQuery = true)
	Object findInfo(@Param("idUsuario") long id);
	
	@Query(value = "CALL spListaChamados(:idUsuario, 100);", nativeQuery = true)
	List<Object> findTickets(@Param("idUsuario") long id);
	
	@Query(value = "CALL spMontaMenu();", nativeQuery = true)
	List<Object> listDepartments();
}
