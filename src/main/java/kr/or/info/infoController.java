package kr.or.info;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class infoController {
	@Autowired
	private InfoService service;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value="/infoMain.do")
	public String studyMain() {
		return null;
	}
	
}
