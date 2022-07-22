package kr.or.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
	@Autowired
	private StudyDao dao;
	
}
