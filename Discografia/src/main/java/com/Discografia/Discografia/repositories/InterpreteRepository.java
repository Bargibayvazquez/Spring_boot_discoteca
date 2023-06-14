package com.Discografia.Discografia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Discografia.Discografia.Discografia;
import com.Discografia.Discografia.Interprete;
@Repository
public interface InterpreteRepository  extends  CrudRepository <Interprete,Long>{
	@Query ("from Interprete")
	List<Interprete> findTodosInterpretes();
	
	@Query ("select n from Interprete n where n.Nacionalidad like:nac ")
	List<Interprete>FindPorNacionalidad(@Param("nac")String Nacionalidad);
	
	@Query("select n from Interprete n where n.Nacionalidad like 'USA'")
	List<Interprete>findByporNacionaliadJQPL();
}
