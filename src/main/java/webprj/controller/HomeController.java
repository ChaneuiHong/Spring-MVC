package webprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController{
	
	@RequestMapping("index")
	public String index() {
		
		return"index";
		
	}
	
	
/*	public void index(HttpServletResponse response){
		PrintWriter  out;
		try {
			out = response.getWriter();
			out.println("Hello World!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return "index";
	}*/
	
//	@ResponseBody
//	//View Resolver를 사용하지 않고 바로 사용자에게 보낼때 사용
//	public String index() {
//		return "Hello Index";
//	}
		
	

//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("test");
//		
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("data", "Hello Spring MVC");
//		mv.setViewName("index");
//		
//		return mv;
//	}

}
