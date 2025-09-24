import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

/**
 * Die Klasse EingabeleserErweitert liest Text von der Konsole und kann ihn in Wörter zerlegen.
 * Diese erweiterte Version implementiert die String-Tokenization mit HashSet.
 * 
 * Basiert auf den ursprünglichen Eingabeleser, erweitert um:
 * - Zerlegung von Eingaben in Wortmengen (HashSet)
 * - Verschiedene Tokenization-Optionen
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 2.0
 */
public class EingabeleserErweitert
{
    private Scanner scanner;
    
    /**
     * Konstruktor für EingabeleserErweitert.
     * Initialisiert den Scanner für Konsoleneingaben.
     */
    public EingabeleserErweitert()
    {
        scanner = new Scanner(System.in);
    }
    
    /**
     * Ursprüngliche Version: Liest eine Zeile von der Konsole ein.
     * 
     * @return Eine Textzeile, die vom Benutzer eingegeben wurde
     */
    public String gibEingabe()
    {
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim();
        return eingabezeile;
    }
    
    /**
     * Erweiterte Version aus dem Lehrbuch: Liest Eingabe und zerlegt sie in Wörter.
     * Die Eingabe wird normalisiert (trim, toLowerCase) und an Leerzeichen getrennt.
     * 
     * @return Ein HashSet mit den einzelnen Wörtern der Eingabe
     */
    public HashSet<String> gibEingabeAlsWoerter()
    {
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        // String an Leerzeichen trennen
        String[] wortArray = eingabezeile.split(" ");
        
        // Wörter aus dem Array in das HashSet kopieren
        HashSet<String> woerter = new HashSet<>();
        for (String wort : wortArray) {
            if (!wort.trim().isEmpty()) { // Leere Strings ausschließen
                woerter.add(wort.trim());
            }
        }
        
        return woerter;
    }
    
    /**
     * Alternative Implementierung mit Arrays.asList (aus Fußnote im Lehrbuch).
     * Elegantere, aber fortgeschrittenere Lösung.
     * 
     * @return Ein HashSet mit den einzelnen Wörtern der Eingabe
     */
    public HashSet<String> gibEingabeAlsWoerterElegant()
    {
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        String[] wortArray = eingabezeile.split(" ");
        
        // Elegante Lösung mit Arrays.asList
        HashSet<String> woerter = new HashSet<>(Arrays.asList(wortArray));
        
        // Leere Strings entfernen
        woerter.remove("");
        
        return woerter;
    }
    
    /**
     * Erweiterte Tokenization: Trennt an Leerzeichen UND Tabulatoren.
     * Übung 6.36: Trennung an verschiedenen Whitespace-Zeichen.
     * 
     * @return Ein HashSet mit den einzelnen Wörtern der Eingabe
     */
    public HashSet<String> gibEingabeMitTabTrennung()
    {
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        // Trennung an Leerzeichen ODER Tabulatoren (Regex: \s+ = ein oder mehr Whitespace-Zeichen)
        String[] wortArray = eingabezeile.split("\\s+");
        
        HashSet<String> woerter = new HashSet<>();
        for (String wort : wortArray) {
            if (!wort.trim().isEmpty()) {
                woerter.add(wort.trim());
            }
        }
        
        return woerter;
    }
    
    /**
     * Übung 6.37: Trennt Strings an Doppelpunkten.
     * 
     * @return Ein HashSet mit den an Doppelpunkten getrennten Teilen
     */
    public HashSet<String> gibEingabeMitDoppelpunktTrennung()
    {
        System.out.print("Eingabe (getrennt durch :): ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        // Trennung an Doppelpunkten
        String[] teileArray = eingabezeile.split(":");
        
        HashSet<String> teile = new HashSet<>();
        for (String teil : teileArray) {
            if (!teil.trim().isEmpty()) {
                teile.add(teil.trim());
            }
        }
        
        return teile;
    }
    
    /**
     * Erweiterte Tokenization mit Interpunktion entfernen.
     * Entfernt häufige Satzzeichen vor der Wort-Trennung.
     * 
     * @return Ein HashSet mit bereinigten Wörtern
     */
    public HashSet<String> gibEingabeBereinigt()
    {
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        
        // Interpunktion entfernen (außer Bindestriche innerhalb von Wörtern)
        eingabezeile = eingabezeile.replaceAll("[,.!?;:\"'()\\[\\]{}]", "");
        
        // An Whitespace trennen
        String[] wortArray = eingabezeile.split("\\s+");
        
        HashSet<String> woerter = new HashSet<>();
        for (String wort : wortArray) {
            if (!wort.trim().isEmpty()) {
                woerter.add(wort.trim());
            }
        }
        
        return woerter;
    }
    
    /**
     * Zeigt die Unterschiede zwischen HashSet und ArrayList Verhalten.
     * Übung 6.38: Vergleich HashSet vs ArrayList.
     */
    public void demonstriereHashSetVsArrayList()
    {
        System.out.println("=== HashSet vs ArrayList Demonstration ===");
        System.out.println("Geben Sie einen Satz mit wiederholten Wörtern ein:");
        System.out.println("(z.B. 'das ist ein test das ist nur ein test')");
        
        System.out.print("> ");
        String eingabezeile = scanner.nextLine().trim().toLowerCase();
        String[] wortArray = eingabezeile.split("\\s+");
        
        // Mit HashSet (keine Duplikate, keine Reihenfolge)
        HashSet<String> woerterSet = new HashSet<>(Arrays.asList(wortArray));
        
        // Mit ArrayList (Duplikate erlaubt, Reihenfolge erhalten)
        java.util.ArrayList<String> woerterListe = new java.util.ArrayList<>(Arrays.asList(wortArray));
        
        System.out.println("\nErgebnis mit ArrayList (Duplikate + Reihenfolge):");
        System.out.println("Anzahl: " + woerterListe.size());
        System.out.println("Inhalt: " + woerterListe);
        
        System.out.println("\nErgebnis mit HashSet (keine Duplikate, keine Reihenfolge-Garantie):");
        System.out.println("Anzahl: " + woerterSet.size());
        System.out.println("Inhalt: " + woerterSet);
        
        System.out.println("\nUnterschied:");
        System.out.println("- ArrayList behält alle Wörter und deren Reihenfolge");
        System.out.println("- HashSet eliminiert Duplikate automatisch");
        System.out.println();
    }
    
    /**
     * Test für mehrere aufeinanderfolgende Leerzeichen (Übung 6.39).
     */
    public void testeMehrfacheLeerzeichen()
    {
        System.out.println("=== Test: Mehrere Leerzeichen ===");
        System.out.println("Geben Sie Text mit mehreren Leerzeichen ein:");
        System.out.println("(z.B. 'ein    test    mit     vielen    leerzeichen')");
        
        HashSet<String> woerter = gibEingabeAlsWoerter();
        
        System.out.println("Erkannte Wörter:");
        for (String wort : woerter) {
            System.out.println("- '" + wort + "'");
        }
        System.out.println("Anzahl: " + woerter.size());
        
        System.out.println("\nErgebnis: Mehrere Leerzeichen werden korrekt behandelt.");
        System.out.println("Die split()-Methode mit ' ' erstellt leere Strings zwischen");
        System.out.println("mehreren Leerzeichen, aber diese werden herausgefiltert.");
        System.out.println();
    }
    
    /**
     * Schließt den Scanner (wichtig für saubere Ressourcenverwaltung).
     */
    public void schliessen()
    {
        if (scanner != null) {
            scanner.close();
        }
    }
    
    /**
     * Demonstriert alle Funktionalitäten des erweiterten Eingabelesers.
     */
    public void alleFunktionenTesten()
    {
        System.out.println("=== EingabeleserErweitert Test ===\n");
        
        try {
            // Test 1: Einfache String-Eingabe
            System.out.println("1. Einfache String-Eingabe:");
            System.out.println("Geben Sie einen Satz ein:");
            String eingabe = gibEingabe();
            System.out.println("Sie haben eingegeben: '" + eingabe + "'");
            System.out.println();
            
            // Test 2: Wort-Tokenization
            System.out.println("2. Wort-Tokenization:");
            System.out.println("Geben Sie einen Satz ein (wird in Wörter zerlegt):");
            HashSet<String> woerter = gibEingabeAlsWoerter();
            System.out.println("Erkannte Wörter: " + woerter);
            System.out.println("Anzahl verschiedener Wörter: " + woerter.size());
            System.out.println();
            
            // Test 3: Erweiterte Whitespace-Behandlung
            System.out.println("3. Erweiterte Whitespace-Behandlung:");
            System.out.println("Geben Sie Text mit Tabs und Leerzeichen ein:");
            HashSet<String> woerterWhitespace = gibEingabeMitTabTrennung();
            System.out.println("Erkannte Wörter: " + woerterWhitespace);
            System.out.println();
            
            // Test 4: Doppelpunkt-Trennung
            System.out.println("4. Doppelpunkt-Trennung:");
            HashSet<String> teile = gibEingabeMitDoppelpunktTrennung();
            System.out.println("Erkannte Teile: " + teile);
            System.out.println();
            
            // Test 5: Bereinigte Eingabe
            System.out.println("5. Bereinigte Eingabe (Interpunktion entfernt):");
            System.out.println("Geben Sie einen Satz mit Satzzeichen ein:");
            HashSet<String> woerterBereinigt = gibEingabeBereinigt();
            System.out.println("Bereinigte Wörter: " + woerterBereinigt);
            System.out.println();
            
            // Test 6: HashSet vs ArrayList
            demonstriereHashSetVsArrayList();
            
            // Test 7: Mehrfache Leerzeichen
            testeMehrfacheLeerzeichen();
            
            System.out.println("=== EingabeleserErweitert Test abgeschlossen ===");
            
        } catch (Exception e) {
            System.err.println("Fehler beim Testen: " + e.getMessage());
        }
    }
}