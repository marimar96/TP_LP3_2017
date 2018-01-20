package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.MensajeTexto;
import py.edu.uca.lp3.service.MensajeTextoService;

@RestController
@RequestMapping("/texto")
public class MensajeTextoController {

	@Autowired
	private MensajeTextoService mensajetextoService;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public MensajeTexto greetings(@PathVariable("id") Long id) {
    	MensajeTexto mensajetexto = mensajetextoService.findById(id);
        return mensajetexto;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MensajeTexto> list() {
        return mensajetextoService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody MensajeTexto mensajetexto) {
    	mensajetextoService.save(mensajetexto);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	mensajetextoService.delete(id);
    }

}