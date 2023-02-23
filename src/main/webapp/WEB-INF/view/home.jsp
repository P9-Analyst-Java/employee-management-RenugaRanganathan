<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="UTF-8"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><%@ page
isELIgnored="false"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head></head>
<meta charset="ISO-8859-1">
<title>Expense tracker home Page</title>
<style type="text/css">
<
div style ="text-align:center ">table {
width: 600px
}
 
 td {
border: 1px solid black;
padding: 5px;
border-collapse: collapse;
text-align: center;
background-color: #AEB6BF
}
 
th {
width: 1000px;
border: 1px solid black;
background-color: #5d6d7E
}
 
span {
color: green;
font-weight: bold;
font-family: sans-serif;
font-size: large;
}
</style>
</head>
<body>
<div style="text-align: center">
<h1>EMPLOYEE SEARCH LIST SCREEN</h1>
</div>
<%-- <h2><span>${message}</span></h2> --%>
 
<form action="/search" method="post">
Emp ID: <input type="number" id="empId" name="empId"
placeholder="enter id" />Emp Name: <input type="text" id="firstName"
name="firstName" placeholder="enter name" />
<button type="submit" value="submit">Search</button>
</form>
 
<span><a href="${contextRoot}/employee">ADD AN EMPLOYEE</a></span>
<br></br>
<table>
<tr>
<th bgcolor=#A9DFBF>EMPLOYEE</th>
<th bgcolor=#A9DFBF>CONTACT</th>
<th bgcolor=#A9DFBF>LEVEL AND POST</th>
<th bgcolor=#A9DFBF>ACTION</th>
<!-- <th>EMPLOYEE PHOTO</th> -->
</tr>
 
<c:forEach var="employee" items="${employees}">
<tr>
<td><h4>${employee.firstName}${employee.lastName}</h4>
<br>#${employee.empId}</td>
<td><p>${employee.mobileNum}<br>${employee.emailId}</p></td>
<td>${employee.empLevel}<br>${employee.postName}</td>
<td><a href="${contextRoot}/employee/${employee.empId}">Edit
</a> / <a href="/${employee.empId}">Delete </a> <a href="${contextRoot}/history/${employee.empId}">History</a></td>
<!-- <td>substitute for a photo</td> -->
</tr>
</c:forEach>
</table>
</div>
  
</body>
</html>

