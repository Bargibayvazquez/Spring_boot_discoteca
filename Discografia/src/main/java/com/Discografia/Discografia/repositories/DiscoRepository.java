package com.Discografia.Discografia.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Discografia.Discografia.Disco;
@Repository
public interface DiscoRepository extends  CrudRepository <Disco,Long>{
@Query (value=" select *  from Disco where nombre like 'yipiyou'",nativeQuery=true)
List<Disco>findByNombre();
	
@Query (value="select *  from Disco where duracion_minutos like '100'",nativeQuery=true)
List<Disco>findByDuracion();
	
@Query (value="select *  from Disco where duracion_minutos > '100'",nativeQuery=true)
List<Disco>findByDuracionMayor();


}
