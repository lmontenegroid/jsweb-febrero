<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<html>
<header>
	<title>EducacionIT - JSWEB</title>

</header>
<body>
	<h1>Clase 11 - JSWEB</h1>


	<!-- 
quiero mostrar los valores del 
1 - 10 
 -->

	<!-- contenido est�tico -->
	<h3>Bloque est�tico</h3>
	<ul>
		<li>1</li>
		<li>2</li>
		<li>3</li>
		<li>4</li>
		<li>5</li>
		<li>6</li>
		<li>7</li>
		<li>8</li>
		<li>9</li>
		<li>10</li>
	</ul>

	<!-- contenido din�mico -->
	<h3>Bloque din�mico</h3>
	<ul>
		<%
		//codigo java
		int valores = 10;
		for (int i = 0; i < valores; i++) {
			out.print("<li>" + i + "</li>");
		}
		%>


	</ul>


	<%
	List<String> paises = new ArrayList<>();
	paises.add("Argentina");
	paises.add("Paraguay");
	paises.add("Brasil");
	%>

	<select>
		<%
		for (String pais : paises) {
			out.print("<option>" + pais + "</option>");
		}
		%>

	</select>

	<a href="<%=request.getContextPath()%>/login.jsp">Ir Login</a>








</body>

</html>