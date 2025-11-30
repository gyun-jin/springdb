package org.tukorea.jdbc.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentVO {
	

	private String id;
	private String passwd;
	private String username;
	private String snum;
	private String depart;
	private String mobile;
	private String email;
}
