# README DU TP2 ET 4
Lien du github: https://github.com/SurprisedBark12/TP2

#Partie 1:
---
## Etape 5:
- Web: permet de créer des applications en MVC (Model View COntroller)
- JPA: Java Persistance API. La base/fondation de Hibernate
- Hibernate: ORM (Object Relationnal Mapping) permettant de lier une base de données relationelle à de l'orienté objet
- H2: un système de gestion de base de données (SGBD)
- DevTools: des outils utilses pour la programmation permettant par exemple le relancement automatique de la compilation si le projet est modifié
- Thymeleaf: permet de créer la création de templates HTML et de pouvoir les travailler avec des objets JAVA
---

##Etape 13:
1. Avec @GetMapping("/greeting").
2. Avec return "greeting";
3. Le nom est envoyé par la méthode GET et donc se retrouve dans l'URL en passant par la clé "name".
---

##Etape 17:

- On retrouve la classe Adresss sous forme de table dans l'interface H2.

---
##Etape 18:

- @Entity permet de faire apparaitre la nouvelle table car Hibernate est informé que c'est une base de données et donc une table.

---
##Etape 20:

- Oui on voit tout le contenu de data.sql si on fait **SELECT * FROM address;**.

---
##Etape 23:

- @Autowired sert à injecter des dépendances.
---

##Etape 30:

- Il faut télécharger Bootstrap "minifié" via [Bootstrap](https://getbootstrap.com/docs/3.3/getting-started/) et ensuite le rajouter manuellement au projet.

---
---

#Partie 2:

##Etape 6:

- Oui, il faut crééer un compte pour obtenir une clé API MeteoConcept car celle-ci sera utilisée durant toutes les requêtes.
- On appelle l'url de MeteoConcept: > https://api.meteo-concept.com/api/
- On utilise la méthode GET imposée par l'API MeteoConcept.
- Les paramètres d'appel sont à la suite de l'URL. Plusieurs paramètres à la suite sont séparés d'un "&".
- Un fichier JSON est retourné, donc pour afficher la température du lieu visé par les coordonnées GPS, on va chercher l'attribut observation.temperature.value.
- On fait la même chose pour la prévision de météo du lieu visé par les coordonnées GPS mais avec l'attribut forecast.weather.
