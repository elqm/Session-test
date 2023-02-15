package com.greedy.member.model.service;

import java.sql.Connection;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dao.MemberDAO;
import com.greedy.member.model.dto.MemberDTO;
import static com.greedy.common.Template.getSqlSession;

public class MemberService {

	private MemberDAO memberDAO = new MemberDAO();
	
	public boolean createNewMember(MemberDTO member) {
		
		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.insertNewMember(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

	public List<MemberDTO> selectAllMember() {
		
		SqlSession sqlSession = getSqlSession();
		
		List<MemberDTO> memberList = memberDAO.selectMemberList(sqlSession);
		
		sqlSession.close();
		
		
		return memberList;
	}
	
	public MemberDTO selectMemberById(String id) {
		
		SqlSession sqlSession = getSqlSession();
		
		MemberDTO result = memberDAO.selectIdMember(sqlSession, id);
		
		sqlSession.close();
		
		return result;
	}

	public List<MemberDTO> selectMemberByGender(String gender) {
		
		SqlSession sqlSession = getSqlSession();
		
		List<MemberDTO> memberList = memberDAO.selectMemberGenList(sqlSession, gender);
		
		sqlSession.close();
		
		return memberList;
	}

	public boolean updatePwdById(MemberDTO member) {

		SqlSession sqlSession = getSqlSession();
		
		int result = memberDAO.updatePwd(sqlSession, member);
		
		if(result > 0) {
			sqlSession.commit();
		} else {
			sqlSession.rollback();
		}
		
		sqlSession.close();
		
		return result > 0? true: false;
	}

//	public MemberDTO updateEmailById(String memberId, String email) {
//
//		Connection con = getConnection();
//		
//		MemberDTO result = memberDAO.updateEmail(con, memberId, email);
//		
//		close(con);
//		
//		return result;
//	}
//
//	public MemberDTO updatePhoneById(String memberId, String phone) {
//
//		Connection con = getConnection();
//		
//		MemberDTO result = memberDAO.updatePhone(con, memberId, phone);
//		
//		close(con);
//		
//		return result;
//	}
//
//	public MemberDTO updateAddressById(String memberId, String address) {
//
//		Connection con = getConnection();
//		
//		MemberDTO result = memberDAO.updateAddress(con, memberId, address);
//		
//		close(con);
//		
//		return result;
//	}
//
//	public MemberDTO deleteMemberById(String memberId) {
//
//		Connection con = getConnection();
//		
//		MemberDTO result = memberDAO.deleteMemberInfo(con, memberId);
//		
//		close(con);
//		
//		return result;
//	}

}
