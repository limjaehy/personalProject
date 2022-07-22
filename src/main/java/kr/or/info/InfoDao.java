package kr.or.info;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class InfoDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
