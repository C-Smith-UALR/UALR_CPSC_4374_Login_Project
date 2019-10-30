<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration_page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>

<body>
<div class="container">
<form action="Registercontroller" method="post">
<div class="menu">
<a href="index.jsp">Home</a>
</div><br><br>
<center><h1>Hospice Prognosis Estimator</h1></center>
<h2>Create Account<h2><hr>
<center><input id= "first_name" style="text-indent:20px;" type="text" name="firstname" placeholder="First name"><br></center>
<center><input id= "last_name" style="text-indent:20px;" type="text" name="lastname" placeholder="Last name"><br></center>
<center><input id= "username" style="text-indent:20px;" type="text" name="uid" placeholder="User name"><br></center>
<center><input id= "password" style="text-indent:20px;" type="password" name="password" placeholder="Password"><br><center>
<center><input id= "confirmpass" style="text-indent:20px;" type="password" name="confirm" placeholder="Confirm password"><br><center>
<center><input id= "address" style="text-indent:20px;" type="text" name="address" placeholder="Address"><br></center>
<center><input id= "contact" style="text-indent:20px;" type="text" name="contact" placeholder="Contact"><br><center>
<center><input id= "security" style="text-indent:20px;" type="text" name="securityAnswer" placeholder="Favorite Ice Cream"><br></center>
<center><input id="in"  type="submit" name="submit" value="Sign up"></input><center> 
</form>
</div>
</body>
</html>
