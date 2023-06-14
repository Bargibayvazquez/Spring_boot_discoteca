package com.Discografia.Discografia.services;

import java.util.List;

import com.Discografia.Discografia.Disco;
import com.Discografia.Discografia.Discografia;
import com.Discografia.Discografia.Interprete;

public interface DaoService {

	
	//Discografias.
	List <Discografia> findAllDiscografia();
	void delete(Discografia dg);
	void save (Discografia dg);
	List<Discografia> findNombreR();
	List<Discografia> findNombreDiscografia(String nombre);

	
	//Interprete
	List<Interprete>findALLInterprete();
	void save (Interprete In);
	List<Interprete> findInterprete();
	List<Interprete>findNacionalidadParam();
	List<Interprete>findNacionalidadJQPL();
	
	//Disco
	List<Disco>FindALLDisco();
	Disco findDiscoPorId(Long id);
	List<Disco>findDiscoNombre();
	List<Disco>findDiscoPorTiempo();
	List<Disco>findDiscoPorTiempoMayor();
}
