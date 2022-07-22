package kr.or.study.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.study.model.service.StudyService;

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
