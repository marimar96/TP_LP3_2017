package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.Alumno;
import py.edu.uca.lp3.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private AlumnoService alumnoService;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public Alumno greetings(@PathVariable("id") Long id) {
    	Alumno alumno = alumnoService.findById(id);
        return alumno;
    }
    
    @RequestMapping(value = "/ci/{ci}", method = RequestMethod.GET)
    public Alumno greetings(@PathVariable("ci") int ci) {
    	Alumno alumno = alumnoService.findByci(ci);
        return alumno;
    }

    @RequestMapping(value = "/titulo/{titulo}", method = RequestMethod.GET)
    public Alumno greetings(@PathVariable("titulo") String titulo) {
    	Alumno alumno = alumnoService.findBytitulo(titulo);
        return alumno;
    }
  
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Alumno> list() {
        return alumnoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Alumno alumno) {
    	alumnoService.save(alumno);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	alumnoService.delete(id);
    }

}