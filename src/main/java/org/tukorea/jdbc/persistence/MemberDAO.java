package org.tukorea.jdbc.persistence;

import java.util.List;

import org.tukorea.jdbc.domain.StudentVO;

public interface MemberDAO {

	public StudentVO read(String id) throws Exception;
	public List<StudentVO> readList() throws Exception;
	public void add(StudentVO student) throws Exception;
    public void update(StudentVO student) throws Exception;
    public void delete(String id) throws Exception;
}
