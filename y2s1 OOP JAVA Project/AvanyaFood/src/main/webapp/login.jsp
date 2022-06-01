<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Login</title>
	 <link rel="stylesheet" href="res/style.css">
	
</head>
<body>

<header>

     <div class ="wrapper ">
                     <div class ="logo ">
<img src="res/food-logo.png" alt="">

     </div>
        <ul class="nav-area">
            <li> <a href ="index.jsp">Home</a></li>
            <li><a href = "aboutus.jsp" > AboutUs</a></li>
            <li><a href = "login.jsp" > Login</a></li>
        </ul>
      </div>
	
	
	 <div class="welcome-text">
               <h1> Please login to continue</h1>
               <br>
       
       	
	       	<form action="login" method="post">
			<p> User Name</p> <input type="text" name="username" placeholder="Enter your username"><br><br>
			<p>Password</p> <input type="password" name="password" placeholder="Enter your password"><br>
			<input type="submit" name="submit" value="Login">
			</form>
       	
               
        
               </div>
</header>
</body>
</html>