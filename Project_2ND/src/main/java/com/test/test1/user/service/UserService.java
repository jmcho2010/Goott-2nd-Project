package com.test.test1.user.service;

import java.util.List;
import java.util.Map;

import com.test.test1.board.qna.dto.Criteria;
import com.test.test1.user.dto.UserDto;

public interface UserService {

	// 개인정보상세조회  
	UserDto detail(String user_id);

	// 개인정보수정 23/02/20 김지혜 
	void infoModify(UserDto dto);


	
	boolean create(UserDto userDto);
	
	List<UserDto> list(Criteria cri) throws Exception;

	String login(UserDto userDto);

	String idCheck(String id);
	
	String emailCheck(String email);	

	String findid(String email);

	String findpw(UserDto dto);

	void changepw(UserDto dto);

	void paid(Map<String, Object> map);


	String paidCheck(String ID);

	void rePaid(Map<String, Object> map);

	int listCount(Criteria cri) throws Exception;

	void paidUpdate(int months);

	void addVisit();
	
	


}

