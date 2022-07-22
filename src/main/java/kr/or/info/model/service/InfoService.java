package kr.or.info.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.info.model.dao.InfoDao;

@Service
public class InfoService {
	@Autowired
	private InfoDao dao;
}
