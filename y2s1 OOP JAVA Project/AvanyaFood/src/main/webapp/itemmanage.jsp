<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manage Food Items</title>

<header>


</head>
<body>


		

<h1>Manage Items </h1>
<table id ="item">




	
    <tr>
        <th>Item ID</th>
        <th>Price</th>
        <th>Name</th>
        <th>Shop ID</th>
   </tr>         
    
  
  
  
    <% 
    Connection con = null;
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","root");
    Statement stat = null;
    ResultSet rs = null;
	
   
   
   try{
	   
	   
		
		
	   
	   	
	 
	   stat = con.createStatement();
	   String strSql = "select * from fooditem";
	   rs = stat.executeQuery(strSql);
	   while(rs.next()){ 
    
    %>
             



  

		      <tr>
		             
		          
		      <td><%= rs.getInt(1) %></td>
		      <td><%= rs.getInt(2) %></td>
		      <td><%= rs.getString(3) %></td>
		      <td><%= rs.getInt(4) %></td>
		      
		      

                <td>
                <form action="updateitem.jsp" method = "post">
                <input type="hidden" name="ItemID" value=<%=rs.getInt(1) %>>
                <input class="button button2" type="submit" value="Update">
                </form>
               
                 
               
                
                <form action="deleteitem" method = "post">
                <input type="hidden" name="ItemID" value=<%=rs.getInt(1) %>>
                <input type="submit" class="button button3" value="Remove">
                </form></td>
               
                
               
          <%}}catch(Exception e){
        	  e.printStackTrace();
        	  
          } %>                
                
             

          
   
 </tr>
 </table>



</header>
</body>
</html>