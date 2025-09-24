import java.util.Random;
import java.util.ArrayList;

/**
 * Die Klasse ZufallszahlenTester dient zum Testen der Zufallszahlen-Generierung.
 * Diese Klasse implementiert verschiedene Methoden zur Erzeugung von Zufallszahlen
 * mit unterschiedlichen Eigenschaften.
 * 
 * Übungen 6.14 - 6.19: Verschiedene Methoden zur Zufallszahlengenerierung
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 1.0
 */
public class ZufallszahlenTester
{
    private Random zufallsgenerator;
    
    /**
     * Konstruktor für ZufallszahlenTester.
     * Erzeugt eine Instanz der Random-Klasse für Zufallszahlen.
     */
    public ZufallszahlenTester()
    {
        zufallsgenerator = new Random();
    }
    
    /**
     * Übung 6.14: Gibt eine einzelne Zufallszahl aus.
     */
    public void eineZufallszahlAusgeben()
    {
        int zufallszahl = zufallsgenerator.nextInt();
        System.out.println("Zufallszahl: " + zufallszahl);
    }
    
    /**
     * Übung 6.14: Gibt eine bestimmte Anzahl von Zufallszahlen aus.
     * 
     * @param anzahl Die Anzahl der zu generierenden Zufallszahlen
     */
    public void zufallszahlenAusgeben(int anzahl)
    {
        System.out.println(anzahl + " Zufallszahlen:");
        for (int i = 0; i < anzahl; i++) {
            int zufallszahl = zufallsgenerator.nextInt();
            System.out.println((i + 1) + ". " + zufallszahl);
        }
    }
    
    /**
     * Übung 6.15: Simuliert das Würfeln mit einem sechsseitigen Würfel.
     * Liefert Werte von 1 bis 6 (inklusive).
     * 
     * @return Eine Zufallszahl zwischen 1 und 6
     */
    public int wuerfeln()
    {
        return zufallsgenerator.nextInt(6) + 1;
    }
    
    /**
     * Übung 6.16: Gibt zufällig eine der Antworten "ja", "nein" oder "vielleicht" zurück.
     * 
     * @return Eine der drei möglichen Antworten
     */
    public String gibAntwort()
    {
        int zufallswahl = zufallsgenerator.nextInt(3);
        
        switch (zufallswahl) {
            case 0:
                return "ja";
            case 1:
                return "nein";
            case 2:
                return "vielleicht";
            default:
                return "ja"; // Fallback, sollte nie erreicht werden
        }
    }
    
    /**
     * Übung 6.17: Erweiterte Version von gibAntwort mit ArrayList.
     * Wählt zufällig eine Antwort aus einer beliebigen Anzahl von Antworten.
     * 
     * @return Eine zufällig gewählte Antwort aus der Liste
     */
    public String gibAntwortErweitert()
    {
        ArrayList<String> antworten = new ArrayList<>();
        antworten.add("ja");
        antworten.add("nein");
        antworten.add("vielleicht");
        antworten.add("auf jeden Fall");
        antworten.add("niemals");
        antworten.add("könnte sein");
        antworten.add("wahrscheinlich");
        antworten.add("eher nicht");
        
        int index = zufallsgenerator.nextInt(antworten.size());
        return antworten.get(index);
    }
    
    /**
     * Übung 6.18: Liefert eine Zufallszahl zwischen 1 und max (inklusive).
     * 
     * @param max Die obere Grenze (inklusive)
     * @return Eine Zufallszahl zwischen 1 und max
     */
    public int zufallszahlBisMax(int max)
    {
        return zufallsgenerator.nextInt(max) + 1;
    }
    
    /**
     * Übung 6.19: Liefert eine Zufallszahl zwischen min und max (beide inklusive).
     * 
     * @param min Die untere Grenze (inklusive)
     * @param max Die obere Grenze (inklusive)
     * @return Eine Zufallszahl zwischen min und max
     */
    public int zufallszahlBereich(int min, int max)
    {
        if (min > max) {
            throw new IllegalArgumentException("min darf nicht größer als max sein");
        }
        
        int bereich = max - min + 1;
        return zufallsgenerator.nextInt(bereich) + min;
    }
    
    /**
     * Übung 6.19: Überarbeitete Version von zufallszahlBisMax, die nun 
     * zufallszahlBereich verwendet.
     * 
     * @param max Die obere Grenze (inklusive)
     * @return Eine Zufallszahl zwischen 1 und max
     */
    public int zufallszahlBisMaxNeu(int max)
    {
        return zufallszahlBereich(1, max);
    }
    
    /**
     * Testmethode zur Demonstration aller implementierten Funktionen.
     */
    public void alleMethodenTesten()
    {
        System.out.println("=== ZufallszahlenTester Demonstration ===\n");
        
        // Test: Eine Zufallszahl ausgeben
        System.out.println("1. Eine einzelne Zufallszahl:");
        eineZufallszahlAusgeben();
        System.out.println();
        
        // Test: Mehrere Zufallszahlen
        System.out.println("2. Fünf Zufallszahlen:");
        zufallszahlenAusgeben(5);
        System.out.println();
        
        // Test: Würfeln
        System.out.println("3. Würfeln (10 mal):");
        for (int i = 0; i < 10; i++) {
            System.out.println("Wurf " + (i + 1) + ": " + wuerfeln());
        }
        System.out.println();
        
        // Test: Einfache Antworten
        System.out.println("4. Einfache ja/nein/vielleicht Antworten (5 mal):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Antwort " + (i + 1) + ": " + gibAntwort());
        }
        System.out.println();
        
        // Test: Erweiterte Antworten
        System.out.println("5. Erweiterte Antworten (5 mal):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Antwort " + (i + 1) + ": " + gibAntwortErweitert());
        }
        System.out.println();
        
        // Test: Zahlen bis Max
        System.out.println("6. Zufallszahlen von 1 bis 10 (5 mal):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Zahl " + (i + 1) + ": " + zufallszahlBisMax(10));
        }
        System.out.println();
        
        // Test: Zahlen in Bereich
        System.out.println("7. Zufallszahlen zwischen 50 und 100 (5 mal):");
        for (int i = 0; i < 5; i++) {
            System.out.println("Zahl " + (i + 1) + ": " + zufallszahlBereich(50, 100));
        }
        System.out.println();
        
        System.out.println("=== Test abgeschlossen ===");
    }
}