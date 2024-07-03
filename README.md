# Aufgabe ORM

Autor: [Timo](https://github.com/Txpert)

Aufgabe: Erstelle ein Spring Boot Projekt mit Customer, Address und Order Entitäten

## Anforderungen:

1. **Projektkonfiguration:**
Erstelle ein neues Spring Boot Projekt mit den Abhängigkeiten Spring Web , Spring
Data JPA und H2 Database

2. **Datenbank-Konfiguration:**
Konfiguriere die Datenbankverbindung in der application.properties Datei.
Verwende dabei die relevanten Parameter für URL, Benutzername, Passwort und
Dialekt der Datenbank. (Martin's Datei)

3. **Entitäten:**
Erstelle drei Entitäten: Customer, Address und Order .
Definiere eine One-to-One Beziehung zwischen Customer und Address , da jeder
Kunde genau eine Adresse hat.
Definiere eine One-to-Many Beziehung zwischen Customer und Order , da jeder
Kunde mehrere Bestellungen haben kann.

4. **Repository-Interfaces:**
Erstelle Repository-Interfaces für Customer , Address und Order , die von
JpaRepository erben, um CRUD-Operationen zu ermöglichen.

5. **Service-Schicht:**
Implementiere eine Service-Schicht, die folgende Methoden beinhaltet:
Eine Methode zum Erstellen eines neuen Customer mit einer Address .
Eine Methode zum Erstellen einer neuen Order für einen bestehenden
Customer.
Methoden zum Abrufen aller Customer Objekte, einschließlich der verknüpften
Address und Order Objekte.

6. **Controller-Schicht:**
Implementiere eine Controller-Schicht, die folgende Endpunkte bereitstellt:
Einen POST-Endpunkt zum Erstellen eines neuen Customer mit einer
Address .
Einen POST-Endpunkt zum Erstellen einer neuen Order für einen bestehenden
Customer .
Einen GET-Endpunkt zum Abrufen aller Customer Objekte mit den verknüpften
Address und Order Objekten.

7. **Datenbankoperationen:**
Stelle sicher, dass die Anwendung beim Start Daten in die Datenbank einfügt und
dass diese Daten über die GET-Endpunkte abgerufen werden können.

8. **Testing:**
Verwende ein Tool wie Postman, um die API-Endpunkte zu testen.
Sende eine POST-Anfrage, um einen Customer mit Address zu erstellen.
Sende eine POST-Anfrage, um eine Order für einen bestehenden Customer zu
erstellen.
Sende eine GET-Anfrage, um alle Customer Objekte abzurufen und die korrekten
Datenstrukturen zu überprüfen.

## Zusätzliche Hinweise:

**Datenvalidierung:** Stelle sicher, dass die Eingabedaten für die Erstellung von Customer, Address und Order Objekten valide sind.

**Konsolenausgaben (optional):** Verwende Konsolenausgaben in der Service-Schicht, um
zu überprüfen, ob die Daten korrekt gespeichert und abgerufen werden.