<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사원 정보 조회</title>
</head>
<style>
    table { border: black solid 1px; width: 750px;
        border-spacing: 0; }
    th, td { border: black solid 1px;
        padding: 10px; border-spacing: 0; }
</style>
<body>
<h1>사원 정보 조회</h1>
<table id="listTable">
    <tr><th>사원번호</th><th>이름</th><th>이메일</th><th>직책</th><th>부서번호</th></tr>
    <c:forEach items="${emp}" var="emp">
        <tr>
            <td>${emp.empid}</td>
            <td>${emp.fname}</td>
            <td>${emp.email}</td>
            <td>${emp.jobid}</td>
            <td>${emp.deptid}</td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
