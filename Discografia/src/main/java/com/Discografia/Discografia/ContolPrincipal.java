package com.Discografia.Discografia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Discografia.Discografia.services.DaoService;






@Controller
public class ContolPrincipal {
	@Autowired
	DaoService daoS;
	
	@GetMapping("/Discografica")
	public String Discografia(Model model) {
		
		List<Discografia> sellosList= daoS.findAllDiscografia();
		sellosList.forEach(x-> System.out.println(x));	
		System.out.println("vamos a borrar un elemento-----------------------------------------------------------------------------------------");
		Discografia dg= new Discografia();
		dg.setId_discografia(11L);
		daoS.delete(dg);
		System.out.println("Vamos a volver a mostrar la lista de nuevo ------------------------------------------------------------------------");
		
		sellosList.forEach(x-> System.out.println(x));	
		
		System.out.println("Vamos a filtrar por nombres que empiezen por E----------------------------------------------------------------------");
		List<Discografia> dList= daoS.findNombreR();
		dList.forEach(x-> System.out.println(x));
		
		System.out.println("Vamos a filtrar por nombre-------------------------------------------------------------------------------------------");
	    dList=daoS.findNombreDiscografia("EMI");
	    dList.forEach(x-> System.out.println(x));
	  
	    
	    
	    System.out.println("Vamos a crear una discografica.........................................................................................");
	    Discografia d1= new Discografia (0L,"Nuevo","Alemania");
	    daoS.save(d1);
	    
	    System.out.println("Listaremos todo con la nueva discografia...............................................................................");
	    sellosList.forEach(x-> System.out.println(x));
	    
	    //HTML
	    model.addAttribute("DIG", sellosList);
		
	    
	    
	    
		
		return "Discografia";
	}
	
	@GetMapping("/Disco")
	public String Disco(Model model) {
		
		
		System.out.println("Listamos todo-------------------------------------------------------------------------------------------------------");
		List<Disco>discoList=daoS.FindALLDisco();
		discoList.forEach(x-> System.out.println(x));
		System.out.println("Terminamos de listar-----------------------------------------------------------------------------------------------");
		
		System.out.println("Buscar por ID------------------------------------------------------------------------------------------------------");
		Disco dis = daoS.findDiscoPorId(12L);
		Disco dis1= daoS.findDiscoPorId(23l);
		List<Disco>discoidList=new ArrayList<Disco>();
		discoidList.add(dis);
		discoidList.add(dis1);
		discoidList.forEach(x-> System.out.println(x));
		System.out.println("Terminar de buscar------------------------------------------------------------------------------------------------");
		
		System.out.println("Buscar cd por nombre-----------------------------------------------------------------------------------------------");
		List<Disco>nombreList=daoS.findDiscoNombre();
		nombreList.forEach(x-> System.out.println(x));
		System.out.println("Terminar de buscar");
	
		System.out.println("Buscar por duracion del cd");
		List<Disco>tiempoList=daoS.findDiscoPorTiempo();
		tiempoList.forEach(x-> System.out.println(x));
		System.out.println("Terminar de buscar");
		
		System.out.println("Buscar por duracion del cd");
		List<Disco>tiempoListMayor=daoS.findDiscoPorTiempoMayor();
		tiempoListMayor.forEach(x-> System.out.println(x));
		System.out.println("Terminar de buscar");
		
		
		
		//HTML
	    model.addAttribute("DIS", discoList);
		
		return "Discos";
	}
	
	@GetMapping("/interpretes")
	public String interpretes(Model model) {
		
		List<Interprete>interpreteList;
		
		List<Interprete>interpreteListE=daoS.findALLInterprete();
		interpreteListE.forEach(x-> System.out.println(x));
		
		System.out.println("Vamos a mostrar todo------------------------------------------------------------------------------------------------------");
		interpreteList=daoS.findInterprete();
		interpreteList.forEach(x-> System.out.println(x));
	
		System.out.println("Vamos a mostrar por nacionalidad param------------------------------------------------------------------------------------");
		interpreteList=daoS.findNacionalidadParam();
		interpreteList.forEach(x-> System.out.println(x));
		
		System.out.println("Vamos a mostrar nacionalidad sin parametro con jpql------------------------------------------------------------------------");
		interpreteList=daoS.findNacionalidadJQPL();
		interpreteList.forEach(x-> System.out.println(x));
		
		
		//HTML
	    model.addAttribute("IN", interpreteListE);
		
		return "interprete";
	}
}

