<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>사원 정보 조회 프로그램</title>
    <link rel="stylesheet" href="css/empcss.css">
</head>
<body>
    <h1>사원 정보 상세 조회</h1>
    <table id="viewtable">
        <tr><th>사원번호</th><th>이름</th><th>성</th><th>이메일</th><th>전화번호</th><th>입사일</th>
            <th>직책</th><th>급여</th><th>수당</th><th>상사번호</th><th>부서번호</th></tr>
        <tr><td>${emp.empid}</td><td>${emp.fname}</td><td>${emp.lname}</td>
            <td>${emp.email}</td><td>${emp.phone}</td><td>${emp.hdate}</td>
            <td>${emp.jobid}</td><td>${emp.sal}</td><td>${emp.comm}</td>
            <td>${emp.mgrid}</td><td>${emp.deptid}</td></tr>
    </table>

    <p><a href="/modify?empid=${emp.empid}">수정하기</a></p>
    <p><a href="/remove?empid=${emp.empid}">삭제하기</a></p>

    <p><a href="/list">목록보기</a></p>

</body>
</html>
