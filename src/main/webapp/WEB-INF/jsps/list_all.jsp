<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of All Labours</title>
</head>
<body>

<table border="1">
<tr>
<th>id</th>
<th>Full Name</th>
<th>Age</th>
<th>City</th>
<th>State</th>
<th>Phone No</th>
<th>action</th>
<th>update</th>
</tr>
<c:forEach var="lab" items="${labours}">
<tr>
<td>${lab.id}</td>
<td>${lab.fullName}</td>
<td>${lab.age}</td>
<td>${lab.city}</td>
<td>${lab.state}</td>
<td>${lab.mobileNo}</td>
<td><a href="delete?id=${lab.id}">delete</a></td>
<td><a href="update?id=${lab.id}">update</a></td>
</tr>
</c:forEach>







</table>
</body>
</html>