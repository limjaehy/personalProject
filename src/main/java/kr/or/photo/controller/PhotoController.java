package kr.or.photo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.or.photo.model.service.PhotoService;

@Controller
public class PhotoController {
	@Autowired
	private PhotoService service;
	@Autowired
	private HttpServletRequest request;
		
	
	
}
