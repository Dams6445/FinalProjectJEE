# Projet de developpement web JEE

Notre site est un site de vente en ligne de la marque Sadida, nous avons principalement géré la partie admnistrateur (impossible d'acheter), de ce fait nous n'avons pas jugé utile de créer des profils clients et admninistrateur ayant des droits sur la gestion du site.


## Authors

- [@BAULU  Evan BAUDOIN Cyril BRIOL--DUHALDE Damien](https://github.com/Dams6445/FinalProjectJEE)

## Emplacement du code source

Le code source se situe dans la branche springJEE du projet, nous n'avons pas réussis à le mettre dans la branche master pour des raisons d'historiques différents.

## Fonctionnement de la base de données
Pour le fonctionnement de la base de données, il faut mettre son identifiant et mot de passe SQL dans le fichier : "/src/main/resources/application.properties".
```java
spring.datasource.username= "IdentifiantSQL"
spring.datasource.password= "MotDePasseSQL"
```
Il faut ensuite créer une database nommé "jee" sur SQL, lancer l'application va ensuite créer automatiquement les bases et les liens entre elles.

## Utilisation d'images

Toutes les images qui sont utilisées pour le fonctionnement de l'application doivent être contenues dans le dossier "/src/main/resources/static/pictures" dans le format PNG ou JPG.

## Fonctionnalité d'ajout   

[Ajout de Catégorie](./readme/Ajouter_Categorie.webm)   
[Ajout de Produit](./readme/Ajouter_Produit.webm)          
[Ajout de Promotion](./readme/Ajouter_Promotion.webm)   

Vidéo explicative pour montrer comment ajouter une entité 
(catégorie, produit ou promotion) à la base de données.

## Fonctionnalité de suppression

[Supprimer une Catégorie](./readme/Supprimer_Categorie.webm)   
[Supprimer un Produit](./readme/Supprimer_Produit.webm)          
[Supprimer une Promotion](./readme/Supprimer_Promotion.webm)   

Vidéo explicative pour montrer comment supprimer une entité 
(catégorie, produit ou promotion) à la base de données.

## Fonctionnalité de mise à jour

[Modifier une Catégorie](./readme/Modifier_Categorie.webm)   
[Modifier un Produit](./readme/Modifier_Produit.webm)          
[Modifier une Promotion](./readme/Modifier_Promotion.webm) 

Vidéo explicative pour montrer comment mettre à jour une entité
 (catégorie, produit ou promotion) à la base de données.

## Affichage des données

[Données](./readme/Afficher_Donnees.webm)

Vidéo explicative pour montrer comment afficher toute les entités de la base de données.

## Rechercher des éléments

[Rechercher](./readme/Recherche_Entité.webm)

Vidéo explicative pour montrer comment rechercher une ou plusieurs entités par un de 
ses attributs.

## Rechercher des éléments par catégorie

[Rechercher avec un lien](./readme/Recherche_Par_Lien.webm)

Vidéo explicative pour montrer comment rechercher une ou plusieurs entités en fonction
 de son lien avec une autre table.

## Autres fonctionnalitées

Dans la barre de navigation situé a gauche de l'écran il est possible d'aller 
dans "Gestion" puis "Gestion des données" afin d'accéder à des pages tel  que ajouter, 
supprimer et mise à jour qui vous renveront vers une page ou il sera possible de choisir 
par exemple pour ajouter si vous voulez ajouter une catégorie ou un produit ou une 
promotion.

[Ajouter](./readme/ajouter.png) 
[Supprimer](./readme/supprimer.png) 
[Modifier](./readme/modifier.png) 


