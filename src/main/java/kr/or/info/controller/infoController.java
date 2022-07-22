package kr.or.info.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.info.model.service.InfoService;

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
