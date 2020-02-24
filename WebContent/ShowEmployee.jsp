<%@page import="com.employee.Model.FetchEmployeeModel"%> 
<%@page import="java.util.ArrayList"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<table border ="1" width="500" align="center"> 
         <tr bgcolor="00FF7F"> 
          <th><b>ID</b></th> 
          <th><b>First Name</b></th> 
          <th><b>Last Name</b></th>
          <th><b>Email</b></th> 
         </tr> 
         
         <%ArrayList<FetchEmployeeModel> emp = (ArrayList<FetchEmployeeModel>)request.getAttribute("list"); %>
         <%for(FetchEmployeeModel s:emp){%> 
         <%-- Arranging data in tabular form 
         --%> 
             <tr> 
                 <td><%=s.getId()%></td> 
                 <td><%=s.getFrist_name()%></td> 
                 <td><%=s.getLast_name()%></td>
                 <td><%=s.getEmail_address() %></td> 
             </tr> 
             <%}%> 
         
         


	</body>
</html>