package kr.or.photo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.photo.model.service.PhotoService;

@Controller
public class PhotoController {
	@Autowired
	private PhotoService service;
	@Autowired
	private HttpServletRequest request;
		
	@RequestMapping(value="/photoMain.do")
	public String studyMain() {
		return "photo/photomain";
	}
	
}
