<%--
  Created by IntelliJ IDEA.
  User: cytech
  Date: 11/21/22
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<link rel="stylesheet" href="./bootstrap/dist/css/bootstrap.min.css">
<header>
    <div class="container-fluid">
        <div class="container">
            <div class="row">
                <div class="col-1">
                    <img src="./Pictures/sabiba_LOGO_sansBG.png" alt="logo" width="100%" height="100%">
                </div>
                <div class="col-2">
                    <p>Test</p>
                </div>
                <div class="col-3">
                    <div class="dropdown text-end">
                        <a class="d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                            <svg width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                                <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                            </svg>
                        </a>
                        <ul class="dropdown-menu text-small" style="position: absolute; inset: 0px auto auto 0px; margin: 0px; transform: translate(0px, 34px);" data-popper-placement="bottom-start">
                            <li><a class="dropdown-item" href="index.jsp">Accueil</a></li>
                            <li><a class="dropdown-item" href="categories.jsp">Catégories</a></li>
                            <li><a class="dropdown-item" href="produits.jsp">Produits</a></li>
                            <li><hr class="dropdown-divider"></li>
                            <li><a class="dropdown-item" href="about.jsp">A Propos</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-4">
                    <div class="dropdown">
                    <a href="#" class="d-flex align-items-center col-lg-4 mb-2 mb-lg-0 link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                        <svg width="16" height="16" fill="currentColor" class="bi bi-list" viewBox="0 0 16 16">
                            <path fill-rule="evenodd" d="M2.5 12a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5zm0-4a.5.5 0 0 1 .5-.5h10a.5.5 0 0 1 0 1H3a.5.5 0 0 1-.5-.5z"/>
                        </svg>
                    </a>
                    <ul class="dropdown-menu text-small shadow">
                        <li><a class="dropdown-item active" href="#" aria-current="page">Overview</a></li>
                        <li><a class="dropdown-item" href="#">Inventory</a></li>
                        <li><a class="dropdown-item" href="#">Customers</a></li>
                        <li><a class="dropdown-item" href="#">Products</a></li>
                        <li><hr class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="#">Reports</a></li>
                        <li><a class="dropdown-item" href="#">Analytics</a></li>
                    </ul>
                </div>
                </div>
            </div>
        </div>

    </div>
</header>
<header class="py-3 mb-3 border-bottom">
    <div class="container-fluid d-grid gap-3 align-items-center" style="grid-template-columns: 1fr 2fr;">
        <div class="dropdown">
            <a href="#" class="d-flex align-items-center col-lg-4 mb-2 mb-lg-0 link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
            </a>
            <ul class="dropdown-menu text-small shadow">
                <li><a class="dropdown-item active" href="#" aria-current="page">Overview</a></li>
                <li><a class="dropdown-item" href="#">Inventory</a></li>
                <li><a class="dropdown-item" href="#">Customers</a></li>
                <li><a class="dropdown-item" href="#">Products</a></li>
                <li><hr class="dropdown-divider"></li>
                <li><a class="dropdown-item" href="#">Reports</a></li>
                <li><a class="dropdown-item" href="#">Analytics</a></li>
            </ul>
        </div>

        <div class="d-flex align-items-center">
            <form class="w-100 me-3" role="search">
                <input type="search" class="form-control" placeholder="Search..." aria-label="Search">
            </form>

            <div class="flex-shrink-0 dropdown">
                <a class="btn btn-primary d-block link-dark text-decoration-none dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    <img src="https://github.com/mdo.png" alt="mdo" width="32" height="32" class="rounded-circle">
                </a>
                <ul class="dropdown-menu text-small shadow">
                    <li><a class="dropdown-item" href="#">New project...</a></li>
                    <li><a class="dropdown-item" href="#">Settings</a></li>
                    <li><a class="dropdown-item" href="#">Profile</a></li>
                    <li><hr class="dropdown-divider"></li>
                    <li><a class="dropdown-item" href="#">Sign out</a></li>
                </ul>
            </div>
        </div>
    </div>
</header>
</html>
