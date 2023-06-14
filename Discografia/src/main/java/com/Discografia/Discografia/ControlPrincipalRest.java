package com.Discografia.Discografia;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Discografia.Discografia.services.DaoService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping ("/api")
public class ControlPrincipalRest {
	@Autowired
	DaoService daoS;
	
	@GetMapping(value="/listaInterpretes", produces= {"application/json"})
	public List<Interprete> interprete(){
		List<Interprete> interpretesList= daoS.findALLInterprete();
		interpretesList.forEach(x-> System.out.println(x));
		
		return interpretesList;
	}
	
	@GetMapping(value="/listaDisco", produces= {"application/json"})
	public List<Disco> disco(){
		List<Disco> discoList= daoS.FindALLDisco();
		discoList.forEach(x-> System.out.println(x));
		
		return discoList;
	}
	
	@GetMapping(value="/listaDiscografia", produces= {"application/json"})
	public List<Discografia> discografia(){
		List<Discografia> discografiaList= daoS.findAllDiscografia();
		discografiaList.forEach(x-> System.out.println(x));
		
		return discografiaList;
	}
}
