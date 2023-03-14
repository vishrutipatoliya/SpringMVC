package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {
	
	//using redirect prifix
//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("this is one handller");
//		return "redirect:/two";
//	}
//	
//	@RequestMapping("/two")
//	public String two() {
//		System.out.println("this is two handller");
//		return "contact";
//		
//	}
	
	
	// redirect using HttpServletResponse
	
//	@RequestMapping("/one")
//	public String one(HttpServletResponse request,HttpServletResponse response) {
//		System.out.println("this is one handller");
//		
//		try {
//			response.sendRedirect("https://www.google.com/");
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return one(request, response);
//		
//	}
	
//	using RedirectView
	
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("this is one handller");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://www.google.com/");
		return redirectView;
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is two handller");
		return "contact";
		
	}
	
	
	
	
	

}
