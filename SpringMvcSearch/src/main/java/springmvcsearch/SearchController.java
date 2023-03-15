package springmvcsearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;


@Controller
public class SearchController {

	@RequestMapping("/user/{userid}/{username}")
	//@PathVariable annotation
	public String getUserDetail(@PathVariable("userid") int userid,@PathVariable("username") String username) {
		System.out.println(userid);
		System.out.println(username);
		return "home";
	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("going to home");
//		String str = null;
//		System.out.println(str.length());

		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {

		String url = "https://www.google.com/search?q=" + query;

		RedirectView redirectView = new RedirectView();
		if (query.isBlank()) {
			redirectView.setUrl("home");
			System.out.println("back to home");
			return redirectView;
		}
		redirectView.setUrl(url);
		System.out.println(url);
		return redirectView;
	}
	

	
	
	//handling exception in spring mvc
	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg","null pointer exception");
//		return "null_page";
//}

	//or
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg","null pointer exception");
//		return "null_page";
//	}
	
	//or
//	
//	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=Exception.class)
//	public String exceptionHandlerGeneric(Model m) {
//		m.addAttribute("msg","generic exception");
//		return "null_page";
//	}
	

}
