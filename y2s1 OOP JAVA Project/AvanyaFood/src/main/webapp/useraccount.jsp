<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>User account details</title>
	<link rel="stylesheet" href="res/style.css">
	
</head>
<body>

<header>

     <div class ="wrapper ">
                     <div class ="logo ">
<img src="res/food-logo.png" alt="">

     </div>
        <ul class="nav-area">
            <li> <a href ="#">Home</a></li>
            <li><a href = "#" > AboutUs</a></li>
            <li><a href = "login.jsp" > Login</a></li>
        </ul>
      </div>


<div class ="valuetable ">
	<table border=1px>
	<c:forEach var="cus" items="${cusDetails}">
	
	<c:set var="id" value="${cus.id}"/>
	<c:set var="name" value="${cus.name}"/>
	<c:set var="passwordl" value="${cus.password}"/>
	<c:set var="address" value="${cus.address}"/>
	<c:set var="contact" value="${cus.contact}"/>
	<c:set var="email" value="${cus.email}"/>
	
	<tr>
		<td>Customer ID</td>
		<td>${cus.id}</td>
	</tr>
	<tr>
		<td>Customer Name</td>
		<td>${cus.name}</td>
	</tr>
	<tr>
		<td>Customer password</td>
		<td>${cus.password}</td>
	</tr>
	<tr>
		<td>Customer Address</td>
		<td>${cus.address}</td>
	</tr>
	<tr>
		<td>Customer Contact</td>
		<td>${cus.contact}</td>
	</tr>
	<tr>
		<td>Customer Email</td>
		<td>${cus.email}</td>
	</tr>

	</c:forEach>
	</table>
	</div>
	
	
	</header>
</body>
</html>