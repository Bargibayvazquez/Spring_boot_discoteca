package com.Discografia.Discografia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Discografia.Discografia.Disco;
import com.Discografia.Discografia.Discografia;
import com.Discografia.Discografia.Interprete;
import com.Discografia.Discografia.repositories.DiscoRepository;
import com.Discografia.Discografia.repositories.DiscografiaRepository;
import com.Discografia.Discografia.repositories.InterpreteRepository;
@Service
public class DaoSericeImplementacion implements DaoService{

	@Autowired
	private DiscografiaRepository IDG;

	@Autowired
	private InterpreteRepository IR;
	
	@Autowired
	private DiscoRepository DIS;

	@Override
	public List<Discografia> findAllDiscografia() {
	
		return (List<Discografia>) IDG.findAll();
	}


	@Override
	public List<Interprete> findALLInterprete() {
		return (List<Interprete>) IR.findAll();
	}


	@Override
	public List<Disco> FindALLDisco() {
		return (List<Disco>) DIS.findAll();
	}


	@Override
	public void delete(Discografia dg) {
		IDG.save(dg);
		
	}


	@Override
	public void save(Discografia dg) {

		IDG.save(dg);
	}


	@Override
	public void save(Interprete In) {

		IR.save(In);
	}


	@Override
	public Disco findDiscoPorId(Long id) {
		
		return DIS.findById(id).orElse(null);
	}


	@Override
	public List<Disco> findDiscoNombre() {
		
		return DIS.findByNombre();
	}


	@Override
	public List<Disco> findDiscoPorTiempo() {
		
		return DIS.findByDuracion();
	}


	@Override
	public List<Disco> findDiscoPorTiempoMayor() {
		
		return DIS.findByDuracionMayor();
	}


	@Override
	public List<Discografia> findNombreR() {
		return IDG.findNombreR();
	}


	@Override
	public List<Discografia> findNombreDiscografia(String nombre) {

		return IDG.findByNombreDiscografia(nombre);
	}


	@Override
	public List<Interprete> findInterprete() {

		return (List<Interprete>) IR.findAll();
	}


	@Override
	public List<Interprete> findNacionalidadParam() {
		// TODO Auto-generated method stub
		return IR.FindPorNacionalidad("ESPAÑOL");
	}


	@Override
	public List<Interprete> findNacionalidadJQPL() {
		// TODO Auto-generated method stub
		return IR.findByporNacionaliadJQPL();
	}



	
	
	
}
