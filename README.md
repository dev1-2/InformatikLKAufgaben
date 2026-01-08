# Kundendienst Aufgaben - Komplette Lösungen

Dieses Repository enthält vollständige Java-Implementierungen aller Aufgaben aus "Kundendienst Aufgaben.pdf" - Kapitel 6: "Bibliotheksklassen nutzen" des Java-Lehrbuchs.

## 📋 Übersicht der implementierten Klassen

### 🎲 ZufallszahlenTester (Übungen 6.14-6.19)
**Funktionalitäten:**
- Generierung einzelner und mehrerer Zufallszahlen
- Würfel-Simulation (1-6)
- Zufällige Antwortgenerierung ("ja", "nein", "vielleicht")
- ArrayList-basierte erweiterte Antworten
- Zufallszahlen in benutzerdefinierten Bereichen (min-max)

**Ausführung:**
```bash
java TestRunner ZufallszahlenTester
```

### 🗺️ MapTester (Übungen 6.26-6.32)
**Funktionalitäten:**
- HashMap-Operationen (put, get, remove, containsKey, containsValue)
- Kontaktlisten-Verwaltung
- Notenzählung mit automatischer Aktualisierung
- CRUD-Operationen für Schlüssel-Wert-Paare

**Ausführung:**
```bash
java TestRunner MapTester
```

### 💬 BeantworterErweitert (Übungen 6.22, 6.33)
**Funktionalitäten:**
- Zufällige Antwortauswahl aus ArrayList
- Stichwort-basierte Antwortgenerierung mit HashMap
- Unterstützung für HashSet-Eingaben (Wortmengen)
- Über 12 vordefinierte Stichwort-Antwort-Zuordnungen
- Fallback auf Standard-Antworten

**Ausführung:**
```bash
java TestRunner BeantworterErweitert
```

### 📝 EingabeleserErweitert (Übungen 6.34-6.40)
**Funktionalitäten:**
- String-Tokenization mit split()-Methode
- HashSet vs ArrayList Vergleiche
- Verschiedene Trennzeichen (Leerzeichen, Tabs, Doppelpunkt)
- Interpunktions-Bereinigung
- Behandlung mehrfacher Leerzeichen
- Demonstrationen der Unterschiede zwischen Sammlungstypen

### 📊 SortierenTest (Übung 6.41)
**Funktionalitäten:**
- Array-Sortierung mit Arrays.sort()
- Binäre Suche mit Arrays.binarySearch()
- Array-Vergleiche mit Arrays.equals()
- Array-Füllen mit Arrays.fill()
- Sortierung ohne Original zu ändern
- Validierung der Sortierung

**Ausführung:**
```bash
java TestRunner SortierenTest
```

### 🖥️ KundendienstsystemVollstaendig (Finale Integration)
**Funktionalitäten:**
- Vollständige Integration aller Übungen
- Wort-basierte Eingabeanalyse
- Intelligente Antwortgenerierung
- Mehrere Betriebsmodi (vollständig, einfach, demo)
- Interaktiver und automatischer Modus

**Ausführung:**
```bash
# Interaktiver Modus
java KundendienstsystemVollstaendig

# Demo-Modus (automatisch)
java TestRunner KundendienstsystemDemo

# Mit spezifischem Modus
java KundendienstsystemVollstaendig demo
java KundendienstsystemVollstaendig einfach
java KundendienstsystemVollstaendig vollstaendig
```

### 🧪 AlleUebungenTest (Zentrale Testklasse)
**Funktionalitäten:**
- Systematische Demonstration aller Übungen
- Übersicht aller implementierten Klassen
- Strukturierte Präsentation der Ergebnisse

**Ausführung:**
```bash
# Alle Übungen ausführen
java AlleUebungenTest

# Nur Übersicht anzeigen
java AlleUebungenTest overview
```

## 🚀 Schnellstart

### Kompilierung
```bash
javac *.java
```

### Alle Tests ausführen
```bash
java AlleUebungenTest
```

### Einzelne Klassen testen
```bash
java TestRunner ZufallszahlenTester
java TestRunner MapTester  
java TestRunner SortierenTest
java TestRunner BeantworterErweitert
java TestRunner KundendienstsystemDemo
```

### Interaktives Kundendienstsystem
```bash
java KundendienstsystemVollstaendig
```

## 📚 Übungen-Mapping

| Übung | Beschreibung | Implementierung |
|-------|-------------|-----------------|
| 6.14 | Zufallszahl-Generator erstellen | `ZufallszahlenTester.eineZufallszahlAusgeben()` |
| 6.15 | Würfel-Methode (1-6) | `ZufallszahlenTester.wuerfeln()` |
| 6.16 | "ja/nein/vielleicht" Antworten | `ZufallszahlenTester.gibAntwort()` |
| 6.17 | ArrayList-basierte Antworten | `ZufallszahlenTester.gibAntwortErweitert()` |
| 6.18 | Zufallszahl 1 bis max | `ZufallszahlenTester.zufallszahlBisMax()` |
| 6.19 | Zufallszahl min bis max | `ZufallszahlenTester.zufallszahlBereich()` |
| 6.22 | Erweiterte Beantworter-Klasse | `BeantworterErweitert` komplett |
| 6.26-6.32 | HashMap-Übungen | `MapTester` komplett |
| 6.33 | Stichwort-basierte Antworten | `BeantworterErweitert.generiereAntwort()` |
| 6.34 | HashSet vs ArrayList | `EingabeleserErweitert.demonstriereHashSetVsArrayList()` |
| 6.35-6.40 | String-Tokenization | `EingabeleserErweitert` verschiedene Methoden |
| 6.41 | Array-Sortierung | `SortierenTest` komplett |

## 🎯 Besondere Features

### ✨ Intelligente Stichwort-Erkennung
Das System erkennt folgende Stichwörter und gibt passende Antworten:
- `langsam` → Hardware-/Performance-Tipps
- `fehler` → Entwickler-Feedback und Problembeschreibung
- `teuer` → Preis-Rechtfertigung  
- `absturz` → Kritischer Fehler-Support
- `installation` → Installations-Hilfe
- `update` → Version-Checking
- `hilfe` → Allgemeine Unterstützung
- `windows`, `mac`, `linux` → Plattform-spezifische Hilfe
- `dokumentation` → Verweis auf Ressourcen
- `lizenz` → Vertriebskontakt

### 🛠️ Erweiterte String-Verarbeitung
- Automatische Normalisierung (toLowerCase, trim)
- Interpunktions-Bereinigung
- Mehrfach-Leerzeichen-Behandlung
- Flexible Trennzeichen (Leerzeichen, Tabs, Doppelpunkt)
- HashSet für einzigartige Wörter

### 📈 Robuste Array-Operationen
- Null-Sicherheit
- Edge-Cases (leere Arrays, Ein-Element-Arrays)
- Originalschutz beim Sortieren
- Umfassende Validierung

### 🔄 Verschiedene Betriebsmodi
- **Vollständig**: Wort-basierte Analyse mit HashSet
- **Einfach**: String-basierte Verarbeitung (Rückwärtskompatibilität)
- **Demo**: Automatische Demonstration mit vordefinierten Eingaben

## 🎓 Lernziele erreicht

Diese Implementierung demonstriert erfolgreich:

✅ **Bibliotheksklassen verstehen und nutzen**
- `java.util.Random` für Zufallsgenerierung
- `java.util.ArrayList` für dynamische Listen
- `java.util.HashMap` für Schlüssel-Wert-Zuordnungen
- `java.util.HashSet` für einzigartige Sammlungen
- `java.util.Arrays` für Array-Operationen

✅ **Objektorientierte Programmierung**
- Klassen-Design mit klarer Verantwortungstrennung
- Konstruktoren und Methoden-Überladung
- Kapselung mit private/public Modifikatoren
- Wiederverwendbare, modulare Komponenten

✅ **String-Verarbeitung und Tokenization**
- `split()` Methode mit verschiedenen Patterns
- `trim()`, `toLowerCase()` für Normalisierung
- Regular Expressions für erweiterte Trennung
- Unterschiede zwischen Sammlungstypen verstehen

✅ **Algorithmen und Datenstrukturen**
- Sortier-Algorithmen (Arrays.sort)
- Binäre Suche (Arrays.binarySearch)
- Hash-basierte Datenstrukturen
- Performance-Unterschiede zwischen Sammlungstypen

✅ **Softwareentwicklung Best Practices**
- Umfassende Dokumentation
- Systematische Tests
- Error Handling
- Code-Modularisierung

## 📄 Dateistruktur

```
├── ZufallszahlenTester.java          # Übungen 6.14-6.19
├── MapTester.java                    # Übungen 6.26-6.32  
├── BeantworterErweitert.java         # Übungen 6.22, 6.33
├── EingabeleserErweitert.java        # Übungen 6.34-6.40
├── SortierenTest.java                # Übung 6.41
├── KundendienstsystemVollstaendig.java # Finale Integration
├── AlleUebungenTest.java             # Zentrale Testklasse
├── TestRunner.java                   # Hilfstool für Einzeltests
├── README.md                         # Diese Dokumentation
└── .gitignore                        # Git-Ausschlüsse
```

## 🏆 Fazit

Diese Implementierung bietet eine vollständige, praxistaugliche Lösung aller Übungen aus dem Kundendienst-Kapitel. Jede Klasse kann eigenständig verwendet werden und demonstriert spezifische Aspekte der Java-Bibliotheksklassen. Das finale integrierte System zeigt, wie alle Komponenten zusammenarbeiten, um ein funktionsfähiges Kundendienstsystem zu erstellen.

Die Lösung ist sowohl lehrreich für das Verständnis der Java-Standardbibliothek als auch praktisch als Basis für erweiterte Projekte.