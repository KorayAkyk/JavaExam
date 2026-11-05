# JavaExam

Exercice d'examen de Java : gestion d'un hôtel avec Hibernate et une base MySQL.

## Ce que ça fait

- quatre entités : `Hotel`, `Chambre` (numéro, superficie, type, étage, hôtel), `Directeur` et `Salarie` (nom, prénom, salaire, directeur) ;
- une classe de service par entité (`HotelService`, `ChambreService`, `DirecteurService`, `SalarieService`) avec création, suppression, mise à jour, recherche par identifiant et liste complète ;
- `main.java` crée un directeur et des salariés, puis affiche le plus gros salaire.

## Technologies

Java 16, Maven, Hibernate, MySQL.

## Ce qu'il faut

JDK 16 ou plus récent, Maven et un serveur MySQL local avec une base nommée `examenjava` (réglages dans `src/main/resources/hibernate.cfg.xml`).

## Etat

Ce dépôt est une version de l'exercice (voir aussi Examen-Java et Examen-Java2021). Son `pom.xml` ne déclare pas encore la dépendance Hibernate, et `main.java` n'est pas terminé (variable `directeur1` non déclarée, imports depuis le mauvais paquet) : le projet ne se compile pas tel quel.

## Organisation

Le code est dans `src/main/java/korayakyurek/` : `Model/` (entités), `Service/` (accès aux données), `HibernateUtil.java`, `connexion.java` et `main.java`.
