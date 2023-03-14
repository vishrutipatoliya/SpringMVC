package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("head", "Registration");
		m.addAttribute("desc","add all details");
		
		System.out.println("common data");
	}
	
	@RequestMapping("/")
	public String showForm() {
		
		return "contact"; //view name as a string
		
	}
	
//	@RequestMapping("/contact")
//	public String showForm() {
//		return "contact";
//		
//	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			//data view to contoller
//			@RequestParam(name="email",required = true) String email,
//			@RequestParam("userName") String userName,
//			@RequestParam("userPassword") String userPassword, Model model
			
			
			@ModelAttribute User user,Model model
			) {
			
//		System.out.println("user email is "+email);
//		System.out.println("user name is "+userName);
//		System.out.println("user password is "+userPassword);
		
//		User user = new User();
//		user.setEmail(email);
//		user.setUserName(userName);
//		user.setUserPassword(userPassword);
		
		
		
//		this.userService.createUser(user);
		
//		String email=request.getParameter("email"); // fatching data
//		System.out.println("user email is "+email);
		
		//data controller to view
//		model.addAttribute("name",userName);
//		model.addAttribute("email",email);
//		model.addAttribute("password",userPassword);
		
//		model.addAttribute("user", user); //data set
		
		
		System.out.println(user);
//		if(user.getUserName().isEmpty()) {
//			return "redirect:/contact";
//		}
		int createUserId = this.userService.createUser(user);
		
		model.addAttribute("msg","successfully added with id is :"+createUserId);
		return "success"; //view return 
		
	}
	

}
