<%@page import="ar.com.eduit.domain.User"%>
<%
	User user = (User)session.getAttribute("user");
	if(user == null){
		
	
%>

<html>
	<head>
		<title>Login Form</title>

	</head>	
	<body>
		<form method = "post" action="<%=request.getContextPath()%>/loginController.jsp">
		<!-- get, post, put, delete, option, trace SE USAN EN SERVICIOS REST -->
		
		<!-- get: lo que envio si se ve en la url -->
		<!-- post: lo que envio no se ve en la url -->
		
		<%
			String msjError = request.getParameter("msjError");
			if(msjError != null){
				out.print("Usuario/Password inválido");
			}
		%>
		
			<label>Username:</label>
			<input type = "text" name="username">
			
			<label>Password:</label>
			<input type = "password" name="password">
			
			<input type = "submit" value = "login">
		
		</form>
	
	</body>


</html>
<% }else{
	response.sendRedirect(request.getContextPath()+ "/loginSuccess.jsp");
}

%>

