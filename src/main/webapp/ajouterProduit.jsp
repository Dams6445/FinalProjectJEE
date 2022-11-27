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
    <title>Ajouter Produit - Sadida</title>
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
                <h1 class="display-4 pb-5 fw-normal">Ajouter un produit</h1>
                    <form class="needs-validation" novalidate>
                        <div class="row g-3">
                            <div class="col-sm-6">
                                <label for="nomProduit" class="form-label">Nom du produit</label>
                                <input type="text" class="form-control" id="nomProduit" placeholder="Nom du produit" value="" required>
                                <div class="invalid-feedback">
                                    Veuillez saisir un nom valide.
                                </div>
                            </div>

                            <div class="col-sm-6">
                                <label for="prix" class="form-label">Prix</label>
                                <div class="input-group has-validation">
                                    <input type="text" class="form-control" id="prix" placeholder="Prix" required>
                                    <span class="input-group-text">€</span>
                                    <div class="invalid-feedback">
                                        Veuillez saisir un prix valide.
                                    </div>
                                </div>
                            </div>

                            <div class="col-12">
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

                            <div class="col-12">
                                <label for="description" class="form-label">Description <span class="text-muted">(Optionelle)</span></label>
                                <input type="text" class="form-control" id="description" placeholder="Description produit">
                                <div class="invalid-feedback">
                                    Veuillez saisir une description valide.
                                </div>
                            </div>

                            <div class="col-12">
                                <label for="reference" class="form-label">Reference</label>
                                <input type="text" class="form-control" id="reference" placeholder="Ex : AZ-201" required>
                                <div class="invalid-feedback">
                                    Veuillez saisir une reference valide.
                                </div>
                            </div>
                            <hr class="my-4">
                            <button class="w-100 btn btn-primary btn-lg" type="submit">Ajouter le produit</button>
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
