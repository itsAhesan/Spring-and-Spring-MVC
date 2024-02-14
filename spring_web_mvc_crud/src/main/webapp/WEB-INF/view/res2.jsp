<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 >All Employee List</h1>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Age</th><th>Salary</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
<c:forEach var="b" items="${user }"> 
<tr>


<td>${b.getId() }</td>
<td>${b.getName() }</td>
<td>${b.getAge() }</td>
<td>${b.getSalary() }</td>
<td>${b.getAddress() }</td>
<td> <a href="Edit/${b.getId() }">Edit </a> </td>
<td> <a href="Delete/${b.getId() }">Delete </a> </td>

</tr>



</c:forEach>


</table>
<br>
<a href="link1">Add New</a>





</body>
</html>