package kr.or.study.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.study.model.dao.StudyDao;
import kr.or.study.model.vo.Study;

@Service
public class StudyService {
	@Autowired
	private StudyDao dao;

	public ArrayList<Study> selectStudyList() {
		// TODO Auto-generated method stub
		return dao.selectStudyList();
	}
	
}
