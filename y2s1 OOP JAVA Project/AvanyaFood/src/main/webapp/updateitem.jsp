<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>Update food item</title>
</head>
<body>


<!-- Main Menu -->
		

   <%
   Connection con = null;
   Class.forName("com.mysql.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop","root","root");
   Statement stat = null;
   ResultSet rs = null;
   
   int ItemID =Integer.parseInt(request.getParameter("ItemID"));
   
   try{
	   stat = con.createStatement();
	   String strSql = "select * from fooditem where ItemID = '"+ItemID+"'";
	   rs = stat.executeQuery(strSql);
	   while(rs.next()){
   
    %>
        <center> <h2> Update Food item Details </h2> </center>
<body>


<form action="updateitem" method = "post">
<table>
<tr>
   <td> ItemID:-</td>
   <td> <input type = "text" name="ItemID"  class="textbox" value ='<%= rs.getInt(1) %>' readonly/> </td>

    <td>Item Price:-</td>
    <td><input type = "text" name="price"  class="textbox" value ='<%=rs.getInt(2)%>'/></td>
    </tr>
<tr>
   <td> Item Name:-</td>
  <td>  <input type = "text" name="Name"  class="textbox" value ='<%=rs.getString(3)%>'/></td>
  
   <td> Item ShopID:-</td>
    <td><input type = "text" name="shopID"  class="textbox" value ='<%=rs.getInt(4)%>' readonly/></td>
    </tr>


    
</table>
 <center>   <input type = "submit" class = "button button2 " name = "submit" value = "Update"> </center>
    
<%}}catch(Exception e) {
 e.printStackTrace();
}
%>


</form>

</body>
</html>