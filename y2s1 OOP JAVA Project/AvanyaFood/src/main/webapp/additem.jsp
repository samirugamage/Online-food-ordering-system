<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddItem</title>
<link rel="stylesheet" href="res/style.css">

</head>

<body>
	
	
<header>

     <div class ="wrapper">
     <div class ="logo">
<img src="res/food-logo.png" alt="">

     </div>
        <ul class="nav-area">
            <li> <a href ="index.jsp">home</a></li>
            <li><a href = "aboutus.jsp"> AboutUs</a></li>
            <li><a href = "shoplogin.jsp"> Login</a></li>
        </ul>
         </div>
        
         <div class="welcome-text">
         
         
    <form action="additem" method="post">
		<p>Name</p> <input type="text" name="Name"><br>
		<p>Price</p> <input type="text" name="Price"><br><br>
		<input id="button1" type="submit" name="submit" value="Add Item">
	</form>
	
</div>

     



	
	
	</header>
</body>

</html>
