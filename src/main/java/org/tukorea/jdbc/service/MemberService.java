package org.tukorea.jdbc.service;

import java.util.List;

import org.tukorea.jdbc.domain.StudentVO;

public interface MemberService {

	public StudentVO readMember(String userid) throws Exception;
	public List<StudentVO> readMemberList() throws Exception;
	public void addMember(StudentVO student) throws Exception;
    public void updateMember(StudentVO student) throws Exception;
    public void deleteMember(String userid) throws Exception;
}
