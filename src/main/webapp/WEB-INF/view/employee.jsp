<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="UTF-8"%><%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ taglib
uri="http://www.springframework.org/tags/form" prefix="form"%><%@ page
isELIgnored="false"%><c:set var="contextRoot"
value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center">
<h1>EMPLOYEE SEARCH LIST SCREEN</h1>
</div>
<form:form action="${contextRoot}/employee" method="post"
modelAttribute="employee"> Emp no(*) <form:input
path="empId" placeholder="Employee id" />
<br>
<br>First Name(*) <form:input path="firstName"
placeholder="first name" />
<br>
<br>Mobile num(*) <form:input path="mobileNum"
placeholder="TextBox" />
<br>
<br>Date of birth(*) <form:input path="dob"
placeholder="yyyy/mm/dd" />
<br>
<br>Office mail(*) <form:input path="officeMail"
placeholder="office mail" />
<br>
<br>Joining date(*) <form:input path="doj"
placeholder="yyyy/mm/dd" />
<br>
<br>Post(*) <form:input path="postName" placeholder="post" />
<br>
<br>Basic pay(*) <form:input path="basicPay"
placeholder="basic pay" />
<br>
<br>Pan Card no <form:input path="panNum"
placeholder="pan card number" />
<br>
<br>Permanent Address <form:input path="permanentAddress"
placeholder="permanent number" />
<br>
<br>Last name(*) <form:input path="lastName"
placeholder="Last name" />
<br>
<br>Email personal(*) <form:input path="emailId"
placeholder="Personal email" />
<br>
<br>Employee level <form:input path="empLevel"
placeholder="Employee level" />
<br>
<br>Blood Group <form:input path="bloodGroup"
placeholder="blood group" />
<br>
<br>House allowance <form:input path="houseAllowance"
placeholder="TextBox" />
<br>
<br>Aadhaar card no <form:input path="aadhaarNum"
placeholder="TextBox" />
<br>
<br>Present Address <form:input path="presentAddress"
placeholder="TextBox" />
<br>
<br>Gender <form:input path="gender" placeholder="m/f"/>
<br>
<br>  <button type="submit">Add Employee</button>  </form:form>

