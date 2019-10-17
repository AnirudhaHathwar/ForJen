package jenkins.embed;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dlithe")// localhost:8080/dlithe/
public class ResourceController 
{
	@Autowired
	public ResourceCrudl crudl;
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public ModelAndView list()
	{
		List<Resource> res=new ArrayList<Resource>();
		crudl.findAll().forEach(res::add);
		return new ModelAndView("listDlithe").addObject("all", res);
	}
}