<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>학생 정보 수정</title>
    <link rel="stylesheet" href="../resources/student.css" type="text/css">
</head>
<body>
<div align="center">
    <header>학생 정보 수정</header>
    <form name="form1" action="../member/update" method="post">
        <table>
            <tr>
                <th>LoginID</th>
                <td><input type="text" name="id" value="${student.id}" readonly></td>
            </tr>
            <tr>
                <th>LoginPWD</th>
                <td><input type="text" name="passwd" value="${student.passwd}"></td>
            </tr>
            <tr>
                <th>YourName</th>
                <td><input type="text" name="username" value="${student.username}"></td>
            </tr>
            <tr>
                <th>StudentNumber</th>
                <td><input type="text" name="snum" value="${student.snum}"></td>
            </tr>
            <tr>
                <th>Department</th>
                <td><input type="text" name="depart" value="${student.depart}"></td>
            </tr>
            <tr>
                <th>MobileNumber</th>
                <td><input type="text" name="mobile" value="${student.mobile}"></td>
            </tr>
            <tr>
                <th>EmailAddress</th>
                <td><input type="text" name="email" value="${student.email}"></td>
            </tr>
        </table>
        <dl>
            <dd><input type="submit" name="submit" value="수정 완료"></dd>
            <dd><input type="reset" name="reset" value="다시 작성"></dd>
        </dl>
    </form>
</div>
</body>
</html>
