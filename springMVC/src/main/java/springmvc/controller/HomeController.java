package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

@RequestMapping("/first")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		
		model.addAttribute("name","vishruti");
		model.addAttribute("id",111);
		List<String> frds = new ArrayList<String>();
		frds.add("dhruti");
		frds.add("adi");
		frds.add("asha");
		model.addAttribute("f",frds);
		
		return "index"; //view(page) name return
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about controller");
		return "about"; //about(page) name return
	}
	@RequestMapping(path="/helpp",method=RequestMethod.GET)
	public ModelAndView help() {
		System.out.println("this is help controller");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("name","vishruti");
		modelAndView.addObject("id",123);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time",now);
		List<Integer> list = new ArrayList<Integer>();
		list.add(44);
		list.add(55);
		list.add(66);
		modelAndView.addObject("marks",list);
		modelAndView.setViewName("help");
		return modelAndView;
		
	}

	
}
