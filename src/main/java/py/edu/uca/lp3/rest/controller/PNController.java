package py.edu.uca.lp3.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import py.edu.uca.lp3.domain.PN;
import py.edu.uca.lp3.service.PNService;

@RestController
@RequestMapping("/pn")
public class PNController {

	@Autowired
	private PNService pnService;

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET)
    public PN greetings(@PathVariable("id") Long id) {
        PN pn = pnService.findById(id);
        return pn;
    }
    
    @RequestMapping(value = "/ci/{ci}", method = RequestMethod.GET)
    public PN greetings(@PathVariable("ci") int ci) {
        PN pn = pnService.findByci(ci);
        return pn;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<PN> list() {
        return pnService.findAll();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void add(@RequestBody PN pn) {
    	pnService.save(pn);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	pnService.delete(id);
    }

}