package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.Materia;
import py.edu.uca.lp3.service.MateriaService;

@RestController
@RequestMapping("/materia")
public class MateriaController {

	@Autowired
	private MateriaService materiaService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Materia greetings(@PathVariable("id") Long id) {
    	Materia materia = materiaService.findById(id);
        return materia;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Materia> list() {
        return materiaService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody Materia materia) {
    	materiaService.save(materia);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	materiaService.delete(id);
    }

}