<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" type="text/css" href="./css/style.css">
</head>

<body>
    <div id="banniereAccueil">
        <h1 id="titre">Sabiba SportShop</h1>
        <div id="spanAccueil">
            <div class="dropdown">
                <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton1" data-bs-toggle="dropdown" aria-expanded="false">
                    Menu
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
                    <li><a class="dropdown-item" href="categories.jsp">Categories</a></li>
                    <li><a class="dropdown-item" href="produits.jsp">Produits</a></li>
                    <li><a class="dropdown-item" href="about.jsp">A propos</a></li>
                </ul>
            </div>
        </div>

    </div>

    <hr>

    <h1 class="title">Hello World!</h1>

    <br/>

    <div id="logoAccueil">

    </div>

    <a href="hello-servlet">Hello Servlet</a>

    <jsp:include page="footer.jsp"></jsp:include>

    <script src="bootstrap.bundle.js"></script>
</body>
</html>