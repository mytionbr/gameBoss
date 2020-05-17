<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="navbar-menu fixed-top">
		<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<a class="navbar-brand logo" href="/gameBoss/">GAMEBOSS</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNav">
				<ul class="navbar-nav">
					<li class="nav-item">
						<a class="nav-link" href="/gameBoss/">Home <span class="sr-only">(current)</span></a>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Category Games
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
							
							<c:forEach var="category" items="${categories }">
								<c:if test="${not empty category}">
									<a class="dropdown-item" href="entry?logic=GamesCategoryLogic&game=${category }">${category }</a>
								</c:if>
								<c:if test="${empty category}">
									<a class="dropdown-item" href="#">Error</a>
								</c:if>
								
							</c:forEach>							
						</div>
					</li>
					<li class="nav-item dropdown">
						<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
							Consoles
						</a>
						<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<c:forEach var="console" items="${consoles}">
						<a class="dropdown-item" href="entry?logic=GamesConsoleLogic&game=${console }">
							<c:if test="${not empty console}">
								${console }
								
							</c:if>
							<c:if test="${empty console}">
								<p>Error</p>
							</c:if>
						</a>
						</c:forEach>
														
						</div>
					</li>
					<li class="nav-item">
						<a class="nav-link" href="#">My account</a>
					</li>
				</ul>
			</div>
		</nav>
	</div>