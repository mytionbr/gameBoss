<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Home</title>
<c:import url="/tag/css.jsp" />
</head>
<body>
	<c:import url="/tag/navbar.jsp" />

	<div class="presentation">
		<div class="title">
			<h1>Games</h1>
			<h2>The best game offers</h2>
		</div>
		<div>
			<ul>
			
				<c:forEach var="game" items="${games }">
						<c:if test="${not empty game }">
							<li>${game.name }</li>
						</c:if>
						<c:if test="${empty game }">
							<li><p>Erro</p></li>
						</c:if>
					
				</c:forEach>

			</ul>
		</div>
	</div>

	<c:import url="/tag/footer.jsp" />
	<c:import url="/tag/js.jsp" />
</body>