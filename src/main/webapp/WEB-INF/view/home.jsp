<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Home</title>
	<c:import url="/tag/css.jsp"/>
</head>
<body>
	<c:import url="/tag/navbar.jsp"/>
	
	<div class="presentation">
		<div class="title">
			<h1>Home</h1>
			<h2>Welcome to the world's lagest games store</h2>
		</div>
		<div class="mainImage">
			<img src="<c:url value='/img/console.png'/>">
		</div>
	</div>
	
	<c:import url="/tag/footer.jsp"/>
	<c:import url="/tag/js.jsp"/>
</body>
