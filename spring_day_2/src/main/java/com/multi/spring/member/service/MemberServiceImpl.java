package com.multi.spring.member.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.multi.spring.member.model.dao.MemberDAO;
import com.multi.spring.member.model.dto.MemberDTO;


@Service
public class MemberServiceImpl implements MemberService {
	private final MemberDAO memberDAO;
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
//	@Override
//	public void insertMember(MemberDTO memberDTO) throws Exception {
//		
//		int result = memberDAO.insertMember(sqlSession, memberDTO);
//		
//		if(result < 0) {
//			throw new Exception("회원가입에 실패하였습니다.");
//		}
//		
//	}

	@Override
	public List<MemberDTO> selectList() throws Exception {
		// TODO Auto-generated method stub
		
		List<MemberDTO> list = memberDAO.selectList(sqlSession);
		
		return list;
	}

	@Override
	public void deleteMember(String id) throws Exception {
		// TODO Auto-generated method stub
		int result = memberDAO.deleteMember(sqlSession, id);
		
        if (result < 0) {
            throw new Exception("회원 삭제에 실패하였습니다.");
        }
	}

	@Override
	public void updateMember(MemberDTO memberDTO) throws Exception {
		// TODO Auto-generated method stub
		int result = memberDAO.updateMember(sqlSession, memberDTO);
		
        if (result < 0) {
            throw new Exception("회원 정보 수정에 실패하였습니다.");
        }
		
	}
	// 롤백안됨 - 롤백되게 하려면 @Transactional(rollbackFor = Exception.class) 설정
				//throw new RuntimeException("회원정보 수정에 실패하였습니다"); // 롤백됨
	
	  /*Request processing failed; nested exception is org.springframework.dao.DataIntegrityViolationException:
			중복키 예외외에 다른 제약조건 위반상황에서도 발생  젤위에있다에러메세지 발생
			https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/dao/DataIntegrityViolationException.html 
			위 경로로 가서 보면 DataAccessException을 상속 받고 있고 들어가서 보면  액세스 API(예: JDBC)에 대한 세부 정보를 모른 채 발생한 오류 종류를 찾아 처리할 수 있도록 하는 것을 목표로하여 sqlexception 을 런타임으로  던져주고 있다
			따라서 기본 롤백됨
			 */

	@Override
	public MemberDTO selectMember(String id) throws Exception {
		// TODO Auto-generated method stub
		
		return memberDAO.selectMember(sqlSession, id);
		
	}

//	@Override
//	public MemberDTO loginMember(MemberDTO memberDTO) throws Exception {
//		// TODO Auto-generated method stub
//		MemberDTO loginUser = memberDAO.loginMember(sqlSession, memberDTO);
//		
//		if(loginUser == null) {
//			throw new Exception("loginUser 정보 확인, 로그인 실패");
//		}
//		
//		return loginUser;
//	}
	
	@Override
	public void insertMember(MemberDTO memberDTO) throws Exception {
		
		System.out.println("암호화 전 : " + memberDTO.getPw());
		String encpw = bCryptPasswordEncoder.encode(memberDTO.getPw());
		System.out.println("암호화 후 : " + encpw);
		
		memberDTO.setPw(encpw);
		
		
		int result = memberDAO.insertMember(sqlSession, memberDTO);
		
		if(result < 0) {
			throw new Exception("회원가입에 실패하였습니다.");
		}
		
	}
	
	@Override
	public MemberDTO loginMember(MemberDTO memberDTO) throws Exception {
		// TODO Auto-generated method stub
		
		MemberDTO loginUser = memberDAO.loginMember(sqlSession, memberDTO);
		
		if(loginUser == null) {
			throw new Exception("loginUser 정보 확인, 로그인 실패");
		}
		
		if(!bCryptPasswordEncoder.matches(memberDTO.getPw(), loginUser.getPw())) {
			throw new Exception("비밀번호 불일치, 로그인 실패");
		}
		
		return loginUser;
	}
}
