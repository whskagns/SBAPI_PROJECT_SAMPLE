package com.sbapi.project.dao;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sbapi.project.response.ApiException;

@Repository
public class UserDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	/* 회원등록여부조회 */
	public String selectUserRegYn(Map<String, Object> params) throws ApiException {
		return sqlSession.selectOne("UserDAO.selectUserRegYn", params);
	}

	/* 회원정보조회 */
	public Map<String, Object> selectUserInfo(Map<String, Object> params) throws ApiException {
		return sqlSession.selectOne("UserDAO.selectUserInfo", params);
	}
	
}
