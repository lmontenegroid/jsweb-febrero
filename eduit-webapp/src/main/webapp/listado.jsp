<%@page import="ar.com.eduit.domain.Producto"%>
<%@page import="java.util.Collection"%>
<%@page import="ar.com.eduit.service.impl.ProductoServiceImpl"%>
<%@page import="ar.com.eduit.service.ProductoService"%>
<%
	ProductoService ps = new ProductoServiceImpl();
	Collection<Producto> productos = ps.obtenerTodos();
%>


<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>

<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-12 col-md-9 col-lg-6 col-xl-4">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">First</th>
							<th scope="col">Last</th>
							<th scope="col">Handle</th>
						</tr>
					</thead>
					<tbody>
						<%
						for(Producto p : productos){
							
						
					%>
						<tr>
							<th scope="row"><%=p.getId() %></th>
							<td><%=p.getTitulo() %></td>
							<td><%=p.getPrecio() %></td>
							<td><%=p.getTipoProducto() %></td>
						</tr>
						<%
						}
						%>
						<tr>
							<th scope="row">2</th>
							<td>Jacob</td>
							<td>Thornton</td>
							<td>@fat</td>
						</tr>
						<tr>
							<th scope="row">3</th>
							<td>Larry</td>
							<td>the Bird</td>
							<td>@twitter</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>