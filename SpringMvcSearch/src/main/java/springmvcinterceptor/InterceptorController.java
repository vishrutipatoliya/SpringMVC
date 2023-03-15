package springmvcinterceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {
	
	@RequestMapping("/interceptor")
	public String show() {
		return "interceptor";
	}
	@RequestMapping("/*")
	public String welcome(@RequestParam("user") String user, Model m ){
		System.out.println(user);
		m.addAttribute("name",user);
		return "welcome";
	}

}
