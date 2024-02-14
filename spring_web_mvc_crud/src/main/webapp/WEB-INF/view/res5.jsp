<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 >Edit Employee</h2>

 <form action="/springCRUD/sav" >
 
 		<input type="hidden" placeholder="Enter Your Id" name="id" value= "${edit1.getId() } ">
      	<input type="text" placeholder="Enter Your UserName" name="name" value= "${edit1.getName() } ">
      	<input type="text" placeholder="Enter Your Age" name="age" value= "${edit1.getAge() } ">
		<input type="text" placeholder="Enter Your Salary" name="salary" value= "${edit1.getSalary() } ">
	
	<input type="text" placeholder="Enter Your Address" name="address" value= "${edit1.getAddress() } ">
		
		<button type="submit">update</button>
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	<!-- <input type="submit" value="update" >	 -->
	</form>
	<hr>
	<%-- <h1> ${edit1.getId() }</h1>
	<h2> ${edit1.getName() } </h2>
	 --%>
	
	
	
	
	
	
	
	
	
	
<!-- 	<form action="sav" >
 
 		<input type="hidden" placeholder="Enter Your Id" name="id">
      	<input type="text" placeholder="Enter Your UserName" name="name">
      	<input type="text" placeholder="Enter Your Age" name="age">
		<input type="text" placeholder="Enter Your Salary" name="salary">
	
		<input type="text" placeholder="Enter Your Address" name="address">

	<input type="submit" value="update" >	
	</form>
	 -->
	<%-- <form action="sav/${edit1.getId() }" method="post">
 
 		<input type="text" placeholder="Enter Your Id" name="id" value= "${edit1.getId() } ">
      	<input type="text" placeholder="Enter Your UserName" name="name" value= "${edit1.getName() } ">
      	<input type="text" placeholder="Enter Your Age" name="age" value= "${edit1.getAge() } ">
		<input type="text" placeholder="Enter Your Salary" name="salary" value= "${edit1.getSalary() } ">
	
		<input type="text" placeholder="Enter Your Address" name="address" value= "${edit1.getAddress() } ">

	<input type="submit" value="update" >	
	</form> --%>
	
	
	

</body>
</html>