package kr.or.photo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.photo.model.dao.PhotoDao;

@Service
public class PhotoService {
	@Autowired
	private PhotoDao dao;
	
	
}
