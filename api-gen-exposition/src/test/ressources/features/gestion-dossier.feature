Feature: Creer un dossier

  Scenario: Creer un dossier avec une description simple

    Given l'utilisateur "Adam" de la filiale de "Paris" veut créer un dossier avec les informations suivantes:
      | description  |
      | Napoléon Bonaparte, né le 15 août 1769 à Ajaccio et mort le 5 mai 1821 sur l'île Sainte-Hélène, est un militaire et homme d'État français, et laisse un heritage|

    When l'utilisateur "Adam" soumet sa demande de création de dossier
    Then le systeme affiche le lien du dossier créé
