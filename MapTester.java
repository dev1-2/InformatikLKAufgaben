import java.util.HashMap;
import java.util.Map;

/**
 * Die Klasse MapTester dient zur Erkundung und zum Testen von HashMap-Funktionalitäten.
 * Diese Klasse implementiert verschiedene Übungen zum Umgang mit Maps.
 * 
 * Übungen 6.26 - 6.32: HashMap und Map-Operationen
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 1.0
 */
public class MapTester
{
    private HashMap<String, String> kontakte;
    private HashMap<String, Integer> notenzaehlung;
    
    /**
     * Konstruktor für MapTester.
     * Initialisiert die HashMap-Instanzen.
     */
    public MapTester()
    {
        kontakte = new HashMap<>();
        notenzaehlung = new HashMap<>();
        
        // Beispieldaten für Kontakte hinzufügen
        kontakteInitialisieren();
        
        // Beispieldaten für Notenzählung hinzufügen
        notenzaehlungInitialisieren();
    }
    
    /**
     * Übung 6.26: Initialisiert die Kontaktliste mit Beispieldaten.
     */
    private void kontakteInitialisieren()
    {
        kontakte.put("Günter Schmid", "(8531) 392 4587");
        kontakte.put("Harald Lorant", "(089) 7386 6632");
        kontakte.put("Werner Jauch", "(830) 4532 7761");
        kontakte.put("Anna Müller", "(089) 1234 5678");
        kontakte.put("Peter Schmidt", "(040) 9876 5432");
    }
    
    /**
     * Übung 6.27: Initialisiert die Notenzählung mit Beispieldaten.
     */
    private void notenzaehlungInitialisieren()
    {
        notenzaehlung.put("sehr gut", 5);
        notenzaehlung.put("gut", 8);
        notenzaehlung.put("befriedigend", 12);
        notenzaehlung.put("ausreichend", 7);
        notenzaehlung.put("mangelhaft", 2);
        notenzaehlung.put("ungenügend", 1);
    }
    
    /**
     * Übung 6.28: Gibt die Anzahl der Einträge in der Kontaktliste aus.
     */
    public void anzahlKontakteAusgeben()
    {
        System.out.println("Anzahl der Kontakte: " + kontakte.size());
    }
    
    /**
     * Übung 6.29: Sucht eine Telefonnummer anhand des Namens.
     * 
     * @param name Der Name der gesuchten Person
     */
    public void telefonnummerSuchen(String name)
    {
        String nummer = kontakte.get(name);
        if (nummer != null) {
            System.out.println("Telefonnummer von " + name + ": " + nummer);
        } else {
            System.out.println("Kein Kontakt gefunden für: " + name);
        }
    }
    
    /**
     * Übung 6.30: Fügt einen neuen Kontakt hinzu.
     * 
     * @param name Der Name der Person
     * @param telefonnummer Die Telefonnummer der Person
     */
    public void kontaktHinzufuegen(String name, String telefonnummer)
    {
        kontakte.put(name, telefonnummer);
        System.out.println("Kontakt hinzugefügt: " + name + " -> " + telefonnummer);
    }
    
    /**
     * Übung 6.31: Ändert die Telefonnummer eines bestehenden Kontakts.
     * 
     * @param name Der Name der Person
     * @param neueTelefonnummer Die neue Telefonnummer
     */
    public void telefonnummerAendern(String name, String neueTelefonnummer)
    {
        if (kontakte.containsKey(name)) {
            String alteTelefonnummer = kontakte.put(name, neueTelefonnummer);
            System.out.println("Telefonnummer von " + name + " geändert:");
            System.out.println("  Alt: " + alteTelefonnummer);
            System.out.println("  Neu: " + neueTelefonnummer);
        } else {
            System.out.println("Kontakt nicht gefunden: " + name);
        }
    }
    
    /**
     * Übung 6.32: Entfernt einen Kontakt aus der Liste.
     * 
     * @param name Der Name der zu entfernenden Person
     */
    public void kontaktEntfernen(String name)
    {
        String entfernteTelefonnummer = kontakte.remove(name);
        if (entfernteTelefonnummer != null) {
            System.out.println("Kontakt entfernt: " + name + " (" + entfernteTelefonnummer + ")");
        } else {
            System.out.println("Kontakt nicht gefunden: " + name);
        }
    }
    
    /**
     * Gibt alle Kontakte aus der Kontaktliste aus.
     */
    public void alleKontakteAusgeben()
    {
        System.out.println("=== Alle Kontakte ===");
        if (kontakte.isEmpty()) {
            System.out.println("Keine Kontakte vorhanden.");
        } else {
            for (Map.Entry<String, String> eintrag : kontakte.entrySet()) {
                System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
            }
        }
        System.out.println("Anzahl Kontakte: " + kontakte.size());
        System.out.println();
    }
    
    /**
     * Gibt die Notenzählung aus.
     */
    public void notenzaehlungAusgeben()
    {
        System.out.println("=== Notenzählung ===");
        for (Map.Entry<String, Integer> eintrag : notenzaehlung.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue() + " mal");
        }
        System.out.println();
    }
    
    /**
     * Erhöht die Zählung für eine bestimmte Note.
     * 
     * @param note Die Note, deren Zählung erhöht werden soll
     */
    public void noteHinzufuegen(String note)
    {
        Integer aktuelleZaehlung = notenzaehlung.get(note);
        if (aktuelleZaehlung != null) {
            notenzaehlung.put(note, aktuelleZaehlung + 1);
            System.out.println("Zählung für '" + note + "' erhöht auf: " + notenzaehlung.get(note));
        } else {
            notenzaehlung.put(note, 1);
            System.out.println("Neue Note '" + note + "' hinzugefügt mit Zählung: 1");
        }
    }
    
    /**
     * Überprüft, ob ein bestimmter Kontakt existiert.
     * 
     * @param name Der zu suchende Name
     * @return true, wenn der Kontakt existiert, false sonst
     */
    public boolean kontaktExistiert(String name)
    {
        return kontakte.containsKey(name);
    }
    
    /**
     * Überprüft, ob eine bestimmte Telefonnummer existiert.
     * 
     * @param telefonnummer Die zu suchende Telefonnummer
     * @return true, wenn die Telefonnummer existiert, false sonst
     */
    public boolean telefonnummerExistiert(String telefonnummer)
    {
        return kontakte.containsValue(telefonnummer);
    }
    
    /**
     * Demonstration aller HashMap-Funktionalitäten.
     */
    public void alleFunktionenTesten()
    {
        System.out.println("=== MapTester Demonstration ===\n");
        
        // Anfangszustand anzeigen
        alleKontakteAusgeben();
        notenzaehlungAusgeben();
        
        // Anzahl der Kontakte anzeigen
        anzahlKontakteAusgeben();
        System.out.println();
        
        // Telefonnummer suchen
        telefonnummerSuchen("Harald Lorant");
        telefonnummerSuchen("Max Mustermann");
        System.out.println();
        
        // Neuen Kontakt hinzufügen
        kontaktHinzufuegen("Lisa Weber", "(030) 1111 2222");
        System.out.println();
        
        // Telefonnummer ändern
        telefonnummerAendern("Werner Jauch", "(830) 9999 8888");
        telefonnummerAendern("Nicht Vorhanden", "(123) 456 789");
        System.out.println();
        
        // Kontakt entfernen
        kontaktEntfernen("Günter Schmid");
        kontaktEntfernen("Nicht Vorhanden");
        System.out.println();
        
        // Finaler Zustand
        alleKontakteAusgeben();
        
        // Test mit Notenzählung
        System.out.println("=== Notenzählung Test ===");
        noteHinzufuegen("sehr gut");
        noteHinzufuegen("sehr gut");
        noteHinzufuegen("hervorragend");
        notenzaehlungAusgeben();
        
        // Existenz-Tests
        System.out.println("=== Existenz-Tests ===");
        System.out.println("Harald Lorant existiert: " + kontaktExistiert("Harald Lorant"));
        System.out.println("Max Mustermann existiert: " + kontaktExistiert("Max Mustermann"));
        System.out.println("Telefonnummer '(030) 1111 2222' existiert: " + telefonnummerExistiert("(030) 1111 2222"));
        System.out.println("Telefonnummer '(999) 999 9999' existiert: " + telefonnummerExistiert("(999) 999 9999"));
        
        System.out.println("\n=== MapTester Test abgeschlossen ===");
    }
}