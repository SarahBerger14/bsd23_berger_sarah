# Exercise5

## Wieso werden Logging Bibliotheken verwendet
Durch die Möglichkeit zur Dokumentation können wir nachvollziehen, was gerade passiert 
(zum Beispiel in dieser Übung mit Debugging, wo man sehen konnte, welche Rechenart mit 
welchen Zahlen durchgeführt wurde) und Fehler können besser nachverfolgt werden (Error). 
Es gibt noch einige andere Möglichkeiten der Dokumentation außer diesen beiden.
Die Protokollierung geht so sehr einfach und gut.

## Welche Loglevel gibt es in Log4J und was hat es damit auf sich?
- ALL – alles loggen
- DEBUG – für debuggen
- ERROR – es gibt einen fehler in der anwendung (keine größeren auswirkungen)
- FATAL – es gibt einen fehler, der dramatisch ist. Die Anwendung kann nicht mehr fortfahren
- INFO – gibt informationen
- TRACE – eine detaillierte Debug-Nachricht.
- WARN – etwas kann zu einem fehler führen
- OFF – es wird nichts geloggt

## Welche Konfigurationsmöglichkeiten bietet Log4j?
- XML
- JSON
- YAML
- Andere Eigenschaften formate

Quelle: [Log4j2 Tutorial 1](http://makeseleniumeasy.com/2021/03/11/log4j2-tutorial-1-introduction-to-apache-log4j2/)