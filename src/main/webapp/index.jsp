<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="style.css" rel="stylesheet" type="text/css">
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<header>
    <div class="flexitude">
        <div>
            <img src="../Images/LogoPizzeria120.png" alt="logo" height="120" width="120">
        </div>
        <div class="boutonHeader">
            <nav>
                <th>
                    <a href="Index.php"><input type="button" value="Accueil" style= "width:150px; height:50px"></a>
                    <a href="produits.php?cat=Pizza"><input type="button" value="Pizza" style= "width:150px; height:50px"></a>
                    <a href="produits.php?cat=Panini"><input type="button" value="Panini" style= "width:150px; height:50px"></a>
                    <a href="produits.php?cat=Boisson"><input type="button" value="Boisson" style= "width:150px; height:50px"></a>
                    <a href="Page_Contact.php"><input type="button" value="Contact" style= "width:150px; height:50px"></a>
                </th>
            </nav>
        </div>
        <div>
            <a href="Page_Connexion.php"><input type="button" value="Connexion" style= "width:150px; height:50px" class="PosConnexion"></a>
        </div>
        <div>
            <a href="Panier.php"><input type="button" value="Panier" style= "width:150px; height:50px" class="PosPanier"></a>
        </div>
    </div>
</header>

<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>