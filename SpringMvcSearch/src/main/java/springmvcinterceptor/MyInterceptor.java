package springmvcinterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String name = request.getParameter("user");
		if(name.startsWith("v")) {
			response.setContentType("text/html");
			response.getWriter().println("invalid name");
			return false;
		}
		System.out.println("prehandler ");
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("post handler ");
	
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		System.out.println("after comletion ");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
	
	

}
