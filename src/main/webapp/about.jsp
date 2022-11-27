<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>A Propos - Sadida</title>
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
        <div class="position-relative overflow-hidden p-3 p-md-5 m-md-3 text-center bg-light">
            <div class="col-md-5 p-lg-5 mx-auto my-5">
                <h1 class="display-4 fw-normal">A Propos de nous</h1>
                <p class="lead fw-normal">Tout ce que nous faisons est ancré dans le sport. Le sport joue un rôle de plus en plus important dans la vie d'un nombre croissant de personnes, sur et en dehors du terrain de jeu. Il est au cœur de chaque culture et de chaque société et est essentiel à notre santé et à notre bonheur.</p>
                <a class="btn btn-outline-secondary" href="./index.jsp">Jump in</a>
            </div>

            <hr />

            <div class="product-device pt-4 pb-3 shadow-sm d-none d-md-block">
                <h2>NOTRE BUT</h2>
                <img class="align-items-center col-md-1 pb-4 img-responsive" src="./Pictures/notreBut.png" alt="notreBut" >
                <p>Notre objectif, <i>"grâce au sport, nous avons le pouvoir de changer des vies"</i>, guide la manière dont nous gérons notre entreprise, dont nous travaillons avec nos partenaires, dont nous créons nos produits et dont nous nous engageons auprès de nos consommateurs. Nous nous efforcerons toujours de repousser les limites des possibilités humaines, d'inclure et d'unir les gens dans le sport, et de créer un monde plus durable.  </p>
            </div>
            <div class="product-device pt-4 pb-3 product-device-2 shadow-sm d-none d-md-block">
                <h2>NOTRE MISSION</h2>
                <img class="align-items-center col-md-1 pb-4 img-responsive" src="./Pictures/nosMissions.png" alt="nosMissions" >
                <p>Les athlètes ne se contentent pas de la moyenne. Et nous non plus. Nous avons une mission claire : Être la meilleure marque de sport au monde. Chaque jour, nous nous rendons au travail pour créer et vendre les meilleurs produits sportifs au monde, et pour offrir le meilleur service et la meilleure expérience aux consommateurs - et tout cela de manière durable. Nous sommes les meilleurs lorsque nous sommes le leader crédible, inclusif et durable de notre secteur.</p>
            </div>
            <div class="product-device pt-4  product-device-2 shadow-sm d-none d-md-block">
                <h2>NOTRE ATTITUDE</h2>
                <img class="align-items-center col-md-1 pb-4 img-responsive" src="./Pictures/notreAttitude.png" alt="notreAttitude" >
                <p>Chez Sadida, nous sommes des optimistes rebelles motivés par l'action, avec le désir de façonner ensemble un avenir meilleur. Nous voyons le monde du sport et de la culture avec des possibilités là où d'autres ne voient que l'impossible. <i>"L'impossible n'est rien"</i> n'est pas un slogan pour nous. En étant optimistes et en connaissant le pouvoir du sport, nous voyons des possibilités infinies d'appliquer ce pouvoir et de faire avancer les gens par l'action.</p>
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
