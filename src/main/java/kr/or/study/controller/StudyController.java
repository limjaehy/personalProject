package kr.or.study.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.study.model.service.StudyService;
import kr.or.study.model.vo.Study;

@Controller
public class StudyController {
	@Autowired
	private StudyService service;
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value="/studyMain.do")
	public String studyMain(Model model) {
		//ArrayList<Study> list = service.selectStudyList();
		
		
		
		return "study/studymain";
	}
	
	
}
