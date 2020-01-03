package com.bbk.jenkins;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;

@Controller
@CrossOrigin
//@RequestMapping("Jenkins")
public class JenkinsController {

	
	@RequestMapping(path="/home",method=RequestMethod.GET)
	public String getHome()
	{	
		return "home";
	}
	
	@RequestMapping(path="/Names",method=RequestMethod.GET)
	public @ResponseBody String[] getNames()
	{
		String[] names= {"Elephant","Cat","Dog"};
		return names;
	}
	
	@RequestMapping(path="/Name",method=RequestMethod.GET)
	public @ResponseBody String getName(@RequestParam("nameId") String nameId)
	{
		String name= nameId+" is a tiger";
		return name;
	}
}
