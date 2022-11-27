<%--
  Created by IntelliJ IDEA.
  User: cytech
  Date: 11/27/22
  Time: 3:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Supprimer Produit - Sadida</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div class="row">
    <div class="col-lg-auto">
        <jsp:include page="sidebar.jsp"></jsp:include>
    </div>
    <!--Container Main start-->
    <div class="col">
        <div class="position-relative overflow-hidden p-3 p-md-2 m-md-3 text-center bg-light">
            <div class="col-md-5 p-lg-5 mx-auto my-5">
                <h1 class="display-4 pb-5 fw-normal">Supprimer un produit</h1>
                <form class="needs-validation" novalidate>
                    <div class="row g-3">
                        <div class="col-sm-6">
                            <label for="categories" class="form-label">Catégories</label>
                            <select class="form-select" id="categories" required>
                                <option>Sport</option>
                                <option>Lifestyle</option>
                                <option>Chill</option>
                            </select>
                            <div class="invalid-feedback">
                                Veuillez sélectionner une catégorie valide.
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <label for="nomProduit" class="form-label">Nom du produit</label>
                            <select class="form-select" id="nomProduit" required>
                                <option>Produit 1</option>
                                <option>Produit 2</option>
                                <option>Produit 3</option>
                            </select>
                            <div class="invalid-feedback">
                                Veuillez sélectionner un nom valide.
                            </div>
                        </div>

                        <div class="col-12">
                            <label for="reference" class="form-label">Catégories</label>
                            <select class="form-select" id="reference" required>
                                <option>Ref 1</option>
                                <option>Ref 2</option>
                                <option>Ref 3</option>
                            </select>
                            <div class="invalid-feedback">
                                Veuillez sélectionner une référence valide.
                            </div>
                        </div>
                        <hr class="my-4">
                        <button class="w-100 btn btn-primary btn-lg" type="submit">Supprimer le produit</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</div>
</h1>
<jsp:include page="footer.jsp"></jsp:include>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>
