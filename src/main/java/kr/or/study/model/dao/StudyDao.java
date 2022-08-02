package kr.or.study.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.study.model.vo.Study;

@Repository
public class StudyDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	public ArrayList<Study> selectStudyList() {
		List list = sqlSession.selectList("study.selectStudyList");
		return (ArrayList<Study>)list;
	}
}
