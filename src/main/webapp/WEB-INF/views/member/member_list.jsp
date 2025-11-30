<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.tukorea.jdbc.domain.*, java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Web Service Programming Homework</title>
	<link rel="stylesheet" href="../resources/student.css" type="text/css"></link>
</head>
<body>
	<header>Member List</header>
	
	<nav>
    <a href="http://localhost:8080/pyj-springdb/" target="_self">메인 페이지 이동</a>
</nav>

<table>
    <tr>
        <th>계정</th>
        <th>이름</th>
        <th>학번</th>
        <th>학과</th>
        <th>모바일</th>
        <th>이메일</th>
        <th>관리</th>
    </tr>

<%
    List<StudentVO> students = (List<StudentVO>)request.getAttribute("students");
    for (StudentVO vo : students) {
%>
    <tr>
        <td><%= vo.getId() %></td>
        <td><%= vo.getUsername() %></td>
        <td><%= vo.getSnum() %></td>
        <td><%= vo.getDepart() %></td>
        <td><%= vo.getMobile() %></td>
        <td><%= vo.getEmail() %></td>
        <td>
        	<a href="http://localhost:8080/pyj-springdb/member/read?id=<%= vo.getId() %>" target="_self">보기</a>
        	<a href="http://localhost:8080/pyj-springdb/member/update?id=<%= vo.getId() %>" target="_self">수정</a>
            <a href="http://localhost:8080/pyj-springdb/member/delete?id=<%= vo.getId() %>" target="_self">삭제</a>
        </td>
    </tr>
<%
    }
%>
</table>
	

</body>
</html>