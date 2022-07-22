package kr.or.study.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class StudyDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
