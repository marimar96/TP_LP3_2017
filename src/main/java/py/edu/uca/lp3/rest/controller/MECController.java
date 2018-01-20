package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.MEC;
import py.edu.uca.lp3.service.MECService;

@RestController
@RequestMapping("/MEC")
public class MECController {

	@Autowired
	private MECService mecService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public MEC greetings(@PathVariable("id") Long id) {
        MEC mec = mecService.findById(id);
        return mec;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<MEC> list() {
        return mecService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody MEC mec) {
    	mecService.save(mec);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	mecService.delete(id);
    }

}