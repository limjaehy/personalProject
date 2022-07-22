package kr.or.photo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PhotoController {
	@Autowired
	private PhotoService service;
	@Autowired
	private HttpServletRequest request;
		
	
	
}
