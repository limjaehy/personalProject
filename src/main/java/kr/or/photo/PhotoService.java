package kr.or.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {
	@Autowired
	private PhotoDao dao;
	
	
}
