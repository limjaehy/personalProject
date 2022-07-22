package kr.or.photo;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PhotoDao {
	@Autowired
	private SqlSessionTemplate sqlSession;
}
