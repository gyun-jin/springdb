package org.tukorea.jdbc.controller;

import java.nio.charset.Charset;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.tukorea.jdbc.domain.StudentVO;
import org.tukorea.jdbc.service.MemberService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/member/rest")
public class MemberRestController {

	private static final Logger logger = LoggerFactory.getLogger(MemberRestController.class);
	@Autowired
	private MemberService memberService;

	// @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@GetMapping("/{id}")
	public ResponseEntity<StudentVO> readMember(@PathVariable String id) throws Exception {
		StudentVO student = memberService.readMember(id);
		logger.info(" /member/rest/{id} REST-API GET method called. then method executed.");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		headers.set("My-Header", "MyHeaderValue");
		return new ResponseEntity<StudentVO>(student, headers, HttpStatus.OK);
	}

	@GetMapping("/list")
	public ResponseEntity<List<StudentVO>> readMemberList() throws Exception {
		List<StudentVO> studentList = memberService.readMemberList();
		logger.info(" /member/rest/list REST-API GET method called. then readMemberList method executed.");
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(new MediaType("application", "json", Charset.forName("UTF-8")));
		headers.set("My-Header", "MyHeaderValue");
		return new ResponseEntity<List<StudentVO>>(studentList, headers, HttpStatus.OK);
	}

	// @RequestMapping(method = RequestMethod.POST)
	@PostMapping
	public String createMemberPost(@RequestBody StudentVO vo) throws Exception {
		memberService.addMember(vo);
		logger.info(vo.toString());
		logger.info(" /member/rest/{id} REST-API POST method called. then method executed.");
		return "OK";
	}

}
