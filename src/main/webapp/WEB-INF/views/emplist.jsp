<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>사원 정보 조회</title>
</head>
<link rel="stylesheet" href="css/empcss.css">
<body>
<div>
    <p class="listMainlink"><a href="/">메인으로</a></p>
    <h1>사원 정보 조회</h1>
</div>
<table id="listTable">
    <tr><th>사원번호</th><th>이름</th><th>이메일</th><th>직책</th><th>부서번호</th></tr>
    <c:forEach items="${emp}" var="emp">
        <tr>
            <td>${emp.empid}</td>
            <td><a href="/view?empid=${emp.empid}">${emp.fname}</a></td>
            <td>${emp.email}</td>
            <td>${emp.jobid}</td>
            <td>${emp.deptid}</td>
        </tr>
    </c:forEach>

</table>

<p class="listMainlink"><a href="/">메인으로</a></p>
</body>
</html>
