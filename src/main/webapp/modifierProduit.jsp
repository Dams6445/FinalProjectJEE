<%--
  Created by IntelliJ IDEA.
  User: cytech
  Date: 11/27/22
  Time: 3:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Modifier Produits - Sadida</title>
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
            <div class="p-lg-5 mx-auto my-5">
                <h1 class="display-4 pb-5 fw-normal">Modifier les produits</h1>
                <h5 class="col-1" style="text-align: left">Filtre</h5>
                <select id="categories" required="" style="width: 300px" class="col-1 pr-auto mb-5 form-select">
                    <option>Sport</option>
                    <option>Lifestyle</option>
                    <option>Chill</option>
                    <option disabled>------------</option>
                    <option>all</option>
                </select>
                <div class="invalid-feedback">
                    Veuillez sélectionner une catégorie valide.
                </div>
                <form>
                    <div class="table-responsive">
                        <table class="table table-striped table-sm">
                            <thead>
                            <tr>
                                <th scope="col">Référence</th>
                                <th scope="col">Nom</th>
                                <th scope="col">Catégorie</th>
                                <th scope="col">Type de produit</th>
                                <th scope="col">Prix</th>
                                <th scope="col">Description</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td><input name="ref0" type="text" value="AZ-452"></input></td>
                                <td><input name="nom0" type="text" value="One Force Air"></input></td>
                                <td>
                                    <select id="categories" required>
                                        <option>Sport</option>
                                        <option>Lifestyle</option>
                                        <option>Chill</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Veuillez sélectionner une catégorie valide.
                                    </div>
                                </td>
                                <td><input name="cat0" type="text" value="Lifestyle"></input></td>
                                <td><input name="prix0" type="text" value="150"></input></td>
                                <td><textarea name="d0" type="text" placeholder="Le charme continue d'opérer avec la One Force Air. Cette silhouette emblématique du basketball apporte un nouveau souffle à ses éléments les plus remarquables : le cuir impeccable, les couleurs vives et juste ce qu'il faut d'éclat pour vous faire briller."></textarea></td>
                            </tr>
                            <tr>
                                <td><input name="ref0" type="text" value="AZ-452"></input></td>
                                <td><input name="nom0" type="text" value="One Force Air"></input></td>
                                <td>
                                    <select id="categories" required>
                                        <option>Sport</option>
                                        <option>Lifestyle</option>
                                        <option>Chill</option>
                                    </select>
                                    <div class="invalid-feedback">
                                        Veuillez sélectionner une catégorie valide.
                                    </div></td>
                                <td><input name="cat0" type="text" value="Lifestyle"></input></td>
                                <td><input name="prix0" type="text" value="150"></input></td>
                                <td><textarea name="d0" type="text" placeholder="Le charme continue d'opérer avec la One Force Air. Cette silhouette emblématique du basketball apporte un nouveau souffle à ses éléments les plus remarquables : le cuir impeccable, les couleurs vives et juste ce qu'il faut d'éclat pour vous faire briller."></textarea></td>
                            </tr>
                            </tbody>
                        </table>
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
