package webprj.controller.api;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import webprj.entity.Notice;
import webprj.service.NoticeService;

//@RestController를 사용하면 @ResponseBody를 사용하는 것처럼 페치지가 아닌 응답값을 반환하게 된다.
@RestController("apiNoticeController")
@RequestMapping("/api/notice/")
public class NoticeController {
	
	@Autowired
	private NoticeService service;
	
	@RequestMapping("list")
	public List<Notice> list() throws ClassNotFoundException, SQLException {
		
		List<Notice> list = service.getList(1, "TITLE", "");
		System.out.println(list.get(0).getTitle());
		
		return list;
	}

}
