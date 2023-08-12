<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Details Here....</title>
</head>
<body>
<h1>Update Details Here....</h1>
<form action="update_labour_page" method="post">
<table>
<tr><td>id :</td><td><input type="text" name="id" value="${labourInfo.id}"/></td></tr>
<tr><td>Full Name :</td><td><input type="text" name="fullName" value="${labourInfo.fullName}"/></td></tr>
<tr><td>age</td><td><input type="text" name="age" value="${labourInfo.age}"/></td></tr>
<tr><td>City :</td><td><input type="text" name="city" value="${labourInfo.city}"/></td></tr>
<tr><td>State :</td><td><input type="text" name="state" value="${labourInfo.state}"/></td></tr>
<tr><td>Contact Info :</td><td><input type="text" name="mobileNo" value="${labourInfo.mobileNo}"/></td></tr>
<tr><td><input type="submit" value="update"/></td></tr>


</table>




</form>
${msg}

</body>
</html>