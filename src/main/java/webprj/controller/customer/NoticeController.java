package webprj.controller.customer;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import webprj.entity.Notice;
import webprj.service.NoticeService;

@Controller
@RequestMapping("customer/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("list")
	public String NoticeList(@RequestParam(name = "p", defaultValue = "1") int page, Model model) throws Exception {

		//String  p = request.getParameter("p");
		System.out.println(page);
		
		List<Notice> list = noticeService.getList(1, "TITLE", "");
		model.addAttribute("list", list);
		
		// 경로 지정 이해 안됨.
		return "notice.list";
	}
	
	
	
	@RequestMapping("detail")
	public String handleRequest(Model model) throws Exception {
		// TODO Auto-generated method stub
	
		return "notice.detail";
	}

	@RequestMapping("api")
	@ResponseBody
	public List<Notice> api() throws ClassNotFoundException, SQLException{
		
		List<Notice> api = noticeService.getList(1, "TITLE", "");
		
		return api;
	}


}