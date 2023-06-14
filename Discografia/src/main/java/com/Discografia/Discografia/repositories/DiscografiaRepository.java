package com.Discografia.Discografia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Discografia.Discografia.Discografia;
@Repository
public interface DiscografiaRepository extends  CrudRepository <Discografia,Long> {
	@Query (value="select * from discografia where nombre_discografia like 'E%'", nativeQuery=true)
	List<Discografia> findNombreR();
	
	List<Discografia> findByNombreDiscografia(String nombre);
	
	
}
