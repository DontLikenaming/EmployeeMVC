<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>사원 정보 처리 프로그램</title>
</head>
<style>
    form {width: 260px; text-align: right;}
    form div {margin-bottom: 3px; margin-right: 3px;}
    form button {margin-top: 10px; margin-right: 3px;}
</style>
<body>
<h1>사원 등록</h1>

<form name="emp" method="post">
    <div>사원번호 : <input type = "text" name = "empid"></div>
    <div>이름 : <input type = "text" name = "fname"></div>
    <div>성 : <input type = "text" name = "lname"></div>
    <div>이메일 : <input type = "text" name = "email"></div>
    <div>전화번호 : <input type = "text" name = "phone"></div>
    <div>입사일 : <input type = "text" name = "hdate"></div>
    <div>직책 : <input type = "text" name = "jobid"></div>
    <div>급여 : <input type = "text" name = "sal"></div>
    <div>수당 : <input type = "text" name = "comm"></div>
    <div>상사번호 : <input type = "text" name = "mgrid"></div>
    <div>부서번호 : <input type = "text" name = "deptid"></div>
    <div><button type="submit">입력완료</button></div>
</form>

</body>
</html>
