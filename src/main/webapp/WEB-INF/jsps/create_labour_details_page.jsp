<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Labour Info Insertion Page</title>
</head>
<body>
<h1>New Labour Register Here</h1>
<form action="create_labour_details_page" method="post">
<table>
<tr><td>Labour Id :</td><td><input type="text" name="Id" placeholder="Labour id..."/></td></tr>
<tr><td>Full Name :</td><td><input type="text" name="fullName" placeholder="Full Name.."/></td></tr>
<tr><td>Age :</td><td><input type="text" name="age" placeholder="Age..."/></td></tr>
<tr><td>City :</td><td><input type="text" name="city" placeholder="City..."/></td></tr>
<tr><td>State:</td><td><input type="text" name="state" placeholder="State.."/></td></tr>
<tr><td>Contact no :</td><td><input type="text" name="mobileNo" placeholder="Conatct Info..."/></td></tr>
<tr><td><input type="submit" value="register"/></td></tr>



</table>
<a href="seelist">click here....</a>


</form>
${msg}

</body>
</html>