package com.greedy.member.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.greedy.member.model.dto.MemberDTO;

public class MemberDAO {


	
	public int insertNewMember(SqlSession sqlSession, MemberDTO member) {

		return sqlSession.insert("MemberMapper.insertMember", member);
	}

	public List<MemberDTO> selectMemberList(SqlSession sqlSession) {

		return sqlSession.selectList("MemberMapper.selectMember");
	}

	public MemberDTO selectIdMember(SqlSession sqlSession, String id) {
		
		return sqlSession.selectOne("MemberMapper.selectMemberById", id);
	}

	public List<MemberDTO> selectMemberGenList(SqlSession sqlSession, String gender) {

		return sqlSession.selectList("MemberMapper.selectMemberByGender", gender);
	}

	public int updatePwd(SqlSession sqlSession, MemberDTO member) {
		
		return sqlSession.update("MemberMapper.updatePwd", member);
	}

//	public MemberDTO updateEmail(Connection con, String memberId, String email) {
//
//		String query = prop.getProperty("updateEmail");
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		MemberDTO member = new MemberDTO();
//		
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, email);
//			pstmt.setString(2, memberId);
//			rset = pstmt.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rset);
//		}
//		
//		return member;
//	}
//
//	public MemberDTO updatePhone(Connection con, String memberId, String phone) {
//
//		String query = prop.getProperty("updatePhone");
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		MemberDTO member = new MemberDTO();
//		
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, phone);
//			pstmt.setString(2, memberId);
//			rset = pstmt.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rset);
//		}
//		
//		return member;
//	}
//
//	public MemberDTO updateAddress(Connection con, String memberId, String address) {
//
//		String query = prop.getProperty("updateAddress");
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		MemberDTO member = new MemberDTO();
//		
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, address);
//			pstmt.setString(2, memberId);
//			rset = pstmt.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rset);
//		}
//		
//		return member;
//	}
//
//	public MemberDTO deleteMemberInfo(Connection con, String memberId) {
//
//		String query = prop.getProperty("deleteMember");
//		
//		PreparedStatement pstmt = null;
//		ResultSet rset = null;
//		MemberDTO member = new MemberDTO();
//		
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, memberId);
//			rset = pstmt.executeQuery();
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			close(pstmt);
//			close(rset);
//		}
//		
//		return member;
//	}

}
