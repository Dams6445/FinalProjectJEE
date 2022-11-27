<%--
  Created by IntelliJ IDEA.
  User: cytech
  Date: 11/21/22
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="./css/bootstrap.css">
</head>
<div class="container">
    <header class="p-3 mb-3 border-bottom">
        <div class="container">
            <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
                <img class="d-flex align-items-center col-md-1 navbar-brand img-responsive" src="./Pictures/sabiba_LOGO_sansBG.png" alt="logo" >

                <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="./index.jsp" class="nav-link px-2 link-dark">Accueil</a></li>
                    <li><a href="./categories.jsp" class="nav-link px-2 link-dark">Catégories</a></li>
                    <li><a href="./produits.jsp" class="nav-link px-2 link-dark">Produits</a></li>
                    <li><a href="./about.jsp" class="nav-link px-2 link-dark">A Propos</a></li>
                </ul>

                <form class="col-12 col-lg-auto mb-3 mb-lg-0 me-lg-3" role="search">
                    <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
                </form>

                <div class="dropdown text-end">
                    <button class="btn btn-secondary dropdown-toggle" data-bs-toggle="dropdown" type="button">
                        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                            <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"></path>
                        </svg>
                    </button>
                    <ul class="dropdown-menu text-small">
                        <li><a class="dropdown-item" href="./index.jsp">Accueil</a></li>
                        <li><a class="dropdown-item" href="./categories.jsp">Catégories</a></li>
                        <li><a class="dropdown-item" href="./produits.jsp">Produits</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="./about.jsp">A Propos</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </header>
</div>
</html>