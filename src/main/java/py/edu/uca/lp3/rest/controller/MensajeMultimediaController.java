package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.MensajeMultimedia;
import py.edu.uca.lp3.service.MensajeMultimediaService;

@RestController
@RequestMapping("/multimedia")
public class MensajeMultimediaController {

	@Autowired
	private MensajeMultimediaService mensajemultimediaService;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public MensajeMultimedia greetings(@PathVariable("id") Long id) {
    	MensajeMultimedia mensajemultimedia = mensajemultimediaService.findById(id);
        return mensajemultimedia;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MensajeMultimedia> list() {
        return mensajemultimediaService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody MensajeMultimedia mensajemultimedia) {
    	mensajemultimediaService.save(mensajemultimedia);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	mensajemultimediaService.delete(id);
    }

}