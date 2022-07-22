package kr.or.study;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudyController {
	@Autowired
	private StudyService service;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value="/studyMain.do")
	public String studyMain() {
		return "study/studymain";
	}
}