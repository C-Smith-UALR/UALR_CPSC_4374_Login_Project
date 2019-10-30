<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index_Page</title>
<link rel="stylesheet" type="text/css" href="/UALR_CPSC_4373_Register_Login_02/style.css">
</head>
<body>
<div class="container">
<form action="Indexcontroller" method="post">
	<div class="menu">
	<a href="index.jsp">Home</a>
	
	
	</div><br><br>
	
    <center><h1>Hospice Prognosis Estimator</h1></center>
    <center><input type="text" name="uid" placeholder="Username"></input><br><br></center>
    <center><input type="password" name=pass placeholder="Password"></input><br></center><br>
  	<center><input id="in" type= "submit" name="submit" value="LOGIN"></input><br><br></center>
    <center><p >Not registered? <a href="Register.jsp">Create an account</a></p></center>
    
   
    
</form>
</div>
</body>
</html>
