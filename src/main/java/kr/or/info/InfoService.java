package kr.or.info;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoService {
	@Autowired
	private InfoDao dao;
}
