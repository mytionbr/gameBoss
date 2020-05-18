<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>${sessionName }</title>
<c:import url="/tag/css.jsp" />
</head>
<body>
	<c:import url="/tag/navbar.jsp" />

	<div class="presentation">
		<div class="title">
			<h1>Games</h1>
			<h2>${sessionName }</h2>
		</div>
	</div>
	<div>
					<table class="table table-striped table-dark">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Name</th>
						<th scope="col">Description</th>
						<th scope="col">Price</th>
						<th scope="col">Number</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach var="game" items="${games }" varStatus="id">
				<c:if test="${not empty game }">
					<tr>
						<th scope="row">${id.count}</th>
						<td>${game.name }</td>
						<td>${game.description }</td>
						<td>${game.price }</td>
						<td><button type="button" class="btn btn-success"><a style="color: inherit;" href="entry?logic
						=AddGameToCart&id=${game.id }">
								Add +1						
						</a> </button></td>
						
						
					</tr>
					</c:if>
					<c:if test="${empty game }">
						<tr>
						<th scope="row">1</th>
						<td>Erro</td>
					</tr>
					</c:if>
					</c:forEach>
				</tbody>
			</table>


		</div>
	<c:import url="/tag/footer.jsp" />
	<c:import url="/tag/js.jsp" />
</body>