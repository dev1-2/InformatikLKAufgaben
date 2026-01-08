/**
 * Die Klasse AlleUebungenTest demonstriert alle implementierten Übungen
 * aus dem Kapitel 6 "Bibliotheksklassen nutzen" des Java-Lehrbuchs.
 * 
 * Diese Klasse führt systematisch alle Übungen aus und zeigt deren Funktionalität.
 * 
 * Umfasst alle Übungen von 6.14 bis 6.41 und die finale Integration.
 * 
 * @author Entwickelt für Informatik LK Aufgaben  
 * @version 1.0
 */
public class AlleUebungenTest
{
    /**
     * Konstruktor für AlleUebungenTest.
     */
    public AlleUebungenTest()
    {
        // Leerer Konstruktor
    }
    
    /**
     * Führt alle implementierten Übungen systematisch aus.
     */
    public void alleUebungenAusfuehren()
    {
        System.out.println("=".repeat(80));
        System.out.println("ALLE ÜBUNGEN AUS 'KUNDENDIENST AUFGABEN.PDF'");
        System.out.println("Kapitel 6: Bibliotheksklassen nutzen");
        System.out.println("=".repeat(80));
        System.out.println();
        
        // Übungen 6.14 - 6.19: Zufallszahlen
        testZufallszahlenUebungen();
        
        // Übung 6.22: Erweiterte Beantworter-Klasse
        testBeantworterUebung();
        
        // Übungen 6.26 - 6.32: HashMap-Übungen
        testMapUebungen();
        
        // Übung 6.33: Stichwort-basierte Antworten
        testStichwortAntworten();
        
        // Übungen 6.34 - 6.41: String-Verarbeitung und Sortierung
        testStringUndSortierUebungen();
        
        // Finale Integration: Vollständiges Kundendienstsystem
        testVollstaendigesSystem();
        
        System.out.println("=".repeat(80));
        System.out.println("ALLE ÜBUNGEN ERFOLGREICH DEMONSTRIERT");
        System.out.println("=".repeat(80));
    }
    
    /**
     * Testet die Zufallszahlen-Übungen (6.14 - 6.19).
     */
    private void testZufallszahlenUebungen()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ ÜBUNGEN 6.14 - 6.19: ZUFALLSZAHLEN GENERIERUNG                           │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        ZufallszahlenTester tester = new ZufallszahlenTester();
        tester.alleMethodenTesten();
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Testet die erweiterte Beantworter-Klasse (Übung 6.22).
     */
    private void testBeantworterUebung()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ ÜBUNG 6.22: ERWEITERTE BEANTWORTER-KLASSE                                 │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        BeantworterErweitert beantworter = new BeantworterErweitert();
        
        // Kurze Demonstration der wichtigsten Funktionen
        System.out.println("Demonstration der zufälligen Antwort-Generierung:");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". " + beantworter.generiereZufaelligeAntwort());
        }
        System.out.println();
        
        System.out.println("Für vollständige Tests siehe BeantworterErweitert.alleFunktionenTesten()");
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Testet die HashMap-Übungen (6.26 - 6.32).
     */
    private void testMapUebungen()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ ÜBUNGEN 6.26 - 6.32: HASHMAP UND ABBILDUNGEN                             │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        MapTester tester = new MapTester();
        tester.alleFunktionenTesten();
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Testet die Stichwort-basierten Antworten (Übung 6.33).
     */
    private void testStichwortAntworten()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ ÜBUNG 6.33: STICHWORT-BASIERTE ANTWORTEN                                  │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        BeantworterErweitert beantworter = new BeantworterErweitert();
        
        System.out.println("Test mit verschiedenen Stichwörtern:");
        String[] testwoerter = {"langsam", "fehler", "teuer", "hilfe", "unbekannt"};
        
        for (String wort : testwoerter) {
            System.out.println("Eingabe: '" + wort + "'");
            System.out.println("Antwort: " + beantworter.generiereAntwort(wort));
            System.out.println();
        }
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Testet String-Verarbeitung und Sortier-Übungen (6.34 - 6.41).
     */
    private void testStringUndSortierUebungen()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ ÜBUNGEN 6.34 - 6.41: STRING-VERARBEITUNG & SORTIERUNG                    │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        // HashSet vs ArrayList (Übung 6.34)
        System.out.println("=== Übung 6.34: HashSet vs ArrayList ===");
        System.out.println("HashSet: Keine Duplikate, keine Reihenfolge-Garantie");
        System.out.println("ArrayList: Duplikate erlaubt, Reihenfolge erhalten");
        System.out.println("Demonstration siehe EingabeleserErweitert.demonstriereHashSetVsArrayList()");
        System.out.println();
        
        // Sortier-Tests (Übung 6.41)
        System.out.println("=== Übung 6.41: Array-Sortierung ===");
        SortierenTest sortierTest = new SortierenTest();
        
        // Kurze Demonstration
        int[] testArray = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Beispiel-Sortierung:");
        sortierTest.sortiereUndAusgeben(testArray);
        System.out.println();
        
        System.out.println("Für vollständige Tests siehe SortierenTest.alleFunktionenTesten()");
        System.out.println();
        
        System.out.println("=== String-Tokenization (Übungen 6.35-6.40) ===");
        System.out.println("Implementiert in EingabeleserErweitert:");
        System.out.println("- split() mit verschiedenen Trennzeichen");
        System.out.println("- Behandlung von mehrfachen Leerzeichen");
        System.out.println("- HashSet für einzigartige Wörter");
        System.out.println("Siehe EingabeleserErweitert.alleFunktionenTesten() für interaktive Tests");
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Testet das vollständige integrierte Kundendienstsystem.
     */
    private void testVollstaendigesSystem()
    {
        System.out.println("┌" + "─".repeat(78) + "┐");
        System.out.println("│ FINALE INTEGRATION: VOLLSTÄNDIGES KUNDENDIENSTSYSTEM                      │");
        System.out.println("└" + "─".repeat(78) + "┘");
        System.out.println();
        
        System.out.println("Das vollständige System integriert alle Übungen:");
        System.out.println("✓ Zufällige Antwort-Generierung (Übungen 6.14-6.19, 6.22)");
        System.out.println("✓ HashMap für Stichwort-Zuordnungen (Übungen 6.26-6.33)");
        System.out.println("✓ HashSet für Wort-Tokenization (Übungen 6.34-6.41)");
        System.out.println("✓ String-Verarbeitung und -bereinigung");
        System.out.println("✓ Intelligente Eingabe-Analyse");
        System.out.println();
        
        System.out.println("Demo-Modus des vollständigen Systems:");
        KundendienstsystemVollstaendig system = new KundendienstsystemVollstaendig();
        system.startenMitModus("demo");
        
        System.out.println("\n" + "─".repeat(80) + "\n");
    }
    
    /**
     * Gibt eine Übersicht über alle implementierten Klassen aus.
     */
    public void klassenUebersichtAusgeben()
    {
        System.out.println("=".repeat(80));
        System.out.println("ÜBERSICHT DER IMPLEMENTIERTEN KLASSEN");
        System.out.println("=".repeat(80));
        System.out.println();
        
        System.out.println("┌─ HAUPTKLASSEN ────────────────────────────────────────────────────┐");
        System.out.println("│                                                                    │");
        System.out.println("│ 1. ZufallszahlenTester                                            │");
        System.out.println("│    - Übungen 6.14-6.19: Zufallszahlengenerierung                 │");
        System.out.println("│    - Random-Klasse, verschiedene Bereiche, Würfeln               │");
        System.out.println("│                                                                    │");
        System.out.println("│ 2. MapTester                                                       │");
        System.out.println("│    - Übungen 6.26-6.32: HashMap-Operationen                      │");
        System.out.println("│    - Kontaktliste, Notenzählung, CRUD-Operationen                │");
        System.out.println("│                                                                    │");
        System.out.println("│ 3. BeantworterErweitert                                           │");
        System.out.println("│    - Übungen 6.22, 6.33: Intelligente Antwortgenerierung        │");
        System.out.println("│    - Zufällige Auswahl, Stichwort-Zuordnung, HashSet-Support     │");
        System.out.println("│                                                                    │");
        System.out.println("│ 4. EingabeleserErweitert                                          │");
        System.out.println("│    - Übungen 6.34-6.40: String-Tokenization                      │");
        System.out.println("│    - HashSet vs ArrayList, split()-Methode, Bereinigung          │");
        System.out.println("│                                                                    │");
        System.out.println("│ 5. SortierenTest                                                   │");
        System.out.println("│    - Übung 6.41: Array-Sortierung mit Arrays-Klasse              │");
        System.out.println("│    - sort(), binarySearch(), equals(), fill()                     │");
        System.out.println("│                                                                    │");
        System.out.println("│ 6. KundendienstsystemVollstaendig                                 │");
        System.out.println("│    - Finale Integration aller Übungen                            │");
        System.out.println("│    - Vollständiges, funktionsfähiges Kundendienstsystem          │");
        System.out.println("│                                                                    │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();
        
        System.out.println("┌─ TESTKLASSEN ─────────────────────────────────────────────────────┐");
        System.out.println("│                                                                    │");
        System.out.println("│ 7. AlleUebungenTest                                               │");
        System.out.println("│    - Systematische Demonstration aller Übungen                   │");
        System.out.println("│    - Zentrale Testausführung und Dokumentation                   │");
        System.out.println("│                                                                    │");
        System.out.println("└────────────────────────────────────────────────────────────────────┘");
        System.out.println();
        
        System.out.println("ANWENDUNG:");
        System.out.println("- Jede Klasse kann einzeln getestet werden (alleFunktionenTesten())");
        System.out.println("- AlleUebungenTest.alleUebungenAusfuehren() für komplette Demo");
        System.out.println("- KundendienstsystemVollstaendig.main() für interaktives System");
        System.out.println();
    }
    
    /**
     * Hauptmethode zum Ausführen aller Tests.
     * 
     * @param args Kommandozeilenargumente
     */
    public static void main(String[] args)
    {
        AlleUebungenTest test = new AlleUebungenTest();
        
        if (args.length > 0 && args[0].equals("overview")) {
            test.klassenUebersichtAusgeben();
        } else {
            test.alleUebungenAusfuehren();
        }
    }
}