package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.Profesor;
import py.edu.uca.lp3.service.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {

	@Autowired
	private ProfesorService profesorService;
	
    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Profesor greetings(@PathVariable("id") Long id) {
    	Profesor profesor = profesorService.findById(id);
        return profesor;
    }
    
    @RequestMapping(value = "/ci/{ci}", method = RequestMethod.GET)
    public Profesor greetings(@PathVariable("ci") int ci) {
    	Profesor profesor = profesorService.findByci(ci);
        return profesor;
    }

    @RequestMapping(value = "/titulo/{titulo}", method = RequestMethod.GET)
    public Profesor greetings(@PathVariable("titulo") String titulo) {
    	Profesor profesor = profesorService.findBytitulo(titulo);
        return profesor;
    } 
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Profesor> list() {
        return profesorService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Profesor profesor) {
    	profesorService.save(profesor);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	profesorService.delete(id);
    }

}