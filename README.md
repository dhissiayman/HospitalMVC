# 📋 Gestion des Patients - Application Web JEE

## 🧾 Description du projet

Cette application Web est développée en Java EE à l’aide de **Spring MVC**, **Thymeleaf** et **Spring Data JPA**. Elle a pour but de permettre une **gestion simple et efficace des patients** dans un environnement médical ou administratif.

## 🛠️ Technologies utilisées

- Java 11+
- Spring Boot
- Spring MVC
- Spring Data JPA
- Thymeleaf
- Hibernate (via JPA)
- MySQL (ou H2 pour le développement)
- Bootstrap 5

## ✅ Fonctionnalités principales

### 🔍 Affichage des patients
Liste paginée de tous les patients dans une interface web. Présentation des informations telles que le nom, la date de naissance, etc.

### 📄 Pagination
Affichage paginé des résultats pour améliorer la lisibilité et les performances.

### 🔎 Recherche de patients
Champ de recherche pour filtrer les patients par nom.

### ❌ Suppression
Suppression possible des patients depuis l’interface, avec une confirmation avant validation.

## 🎯 Améliorations possibles

- Ajout de la création et modification des patients.
- Intégration d’un système d’authentification.
- Création d'une API REST.
- Intégration de notifications utilisateur (succès, erreur...).
- Utilisation de Spring Security pour gérer les rôles et permissions.

## 🚀 Démarrage rapide

1. Cloner le projet
2. Configurer la base de données (MySQL ou H2)
3. Lancer l'application avec Spring Boot
4. Accéder à l’interface via : `http://localhost:8080/patients`

