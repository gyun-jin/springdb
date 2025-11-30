package org.tukorea.jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.tukorea.jdbc.domain.StudentVO;
import org.tukorea.jdbc.persistence.MemberDAO;

@Component
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDAO memberDAO;

	public StudentVO readMember(String id) throws Exception {
		return memberDAO.read(id);
	}

	public void addMember(StudentVO student) throws Exception {
		memberDAO.add(student);
	}

	public List<StudentVO> readMemberList() throws Exception {
		return memberDAO.readList();
	}

	public void updateMember(StudentVO student) throws Exception {
		memberDAO.update(student);
	}

	public void deleteMember(String userid) throws Exception {
		memberDAO.delete(userid);
	}
}
