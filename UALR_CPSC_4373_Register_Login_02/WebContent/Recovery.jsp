<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recovery Page</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
<div class="container">
<form action="Recoverycontroller" method="post">
	<div class="menu">
	<a href="index.jsp">Home</a>
	
	
	</div><br><br>
	<center><h1>Hospice Prognosis Estimator</h1></center>
	<center><h3>Incorrect Password!</h3></center>
    <center><p>Enter Username and favorite ice cream flavor to recover account:</p></center>
    <center><input type="text" name="uid" placeholder="Username"></input><br><br></center>
    <center><input type="text" name=rAns placeholder="ice cream"></input><br></center><br>
  	<center><input id="in" type= "submit" name="submit" value="LOGIN"></input><br><br></center>
    
    
   
</form>
</div>
</body>
</html>
