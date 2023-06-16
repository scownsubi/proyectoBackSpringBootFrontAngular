package unsis.edu.tecnologia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import unsis.edu.tecnologia.entity.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	@Query(value = "SELECT * FROM usuario  WHERE id=:id", nativeQuery=true)
	Usuario myGetUsuarioById(@Param("id")Long id);
	
	@Procedure(name="spGetUsuarioById")
	Usuario spGetUsuarioById(Long id);
	
	@Procedure(name = "spGetAllUsers")
	List<Usuario> spGetAllUsers();
	
	/*@Procedure("GET_TOTAL_CARS_BY_MODEL")
	int getTotalCarsByModel(String model);*/
	
	/*
	   @Procedure(procedureName="get_all_categories")
       List<Category> getAllCategoriesThroughStoredProcedure();
	 */
}
