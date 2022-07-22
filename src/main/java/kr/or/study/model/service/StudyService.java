package kr.or.study.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.study.model.dao.StudyDao;

@Service
public class StudyService {
	@Autowired
	private StudyDao dao;
	
}
