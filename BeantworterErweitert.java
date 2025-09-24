import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Die Klasse BeantworterErweitert generiert automatische Antworten für das Kundendienstsystem.
 * Diese erweiterte Version implementiert verschiedene Verbesserungen:
 * - Zufällige Auswahl aus mehreren möglichen Antworten
 * - Stichwort-basierte Antworten mit HashMap
 * - Verarbeitung von Wortmengen (HashSet)
 * 
 * Übungen 6.22, 6.33, und finale Integration
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 2.0
 */
public class BeantworterErweitert
{
    private Random zufallsgenerator;
    private ArrayList<String> standardantworten;
    private HashMap<String, String> antwortMap;
    
    /**
     * Konstruktor für BeantworterErweitert.
     * Initialisiert den Zufallsgenerator und füllt die Antwortlisten.
     */
    public BeantworterErweitert()
    {
        zufallsgenerator = new Random();
        standardantworten = new ArrayList<>();
        antwortMap = new HashMap<>();
        
        standardantwortenFuellen();
        stichwortAntwortMapFuellen();
    }
    
    /**
     * Übung 6.22: Füllt die Liste mit Standard-Antworten für zufällige Auswahl.
     */
    private void standardantwortenFuellen()
    {
        standardantworten.add("Das klingt interessant. Erzählen Sie mehr...");
        standardantworten.add("Das klingt seltsam. Können Sie das ausführlicher beschreiben?");
        standardantworten.add("Bisher hat sich noch kein Kunde darüber beschwert.\n" +
                            "Welche Systemkonfiguration haben Sie?");
        standardantworten.add("Da brauche ich etwas ausführlichere Angaben.");
        standardantworten.add("Haben Sie geprüft, ob Sie einen Konflikt mit einer DLL haben?");
        standardantworten.add("Das steht im Handbuch. Haben Sie das Handbuch gelesen?");
        standardantworten.add("Das klingt alles etwas Wischi-Waschi. Haben Sie einen Experten\n" +
                            "in der Nähe, der das besser beschreiben kann?");
        standardantworten.add("Das ist kein Fehler, das ist eine Systemeigenschaft!");
        standardantworten.add("Könnten Sie es anders erklären?");
        standardantworten.add("Haben Sie versucht, die App auf Ihrem Handy auszuführen?");
        standardantworten.add("Hmm, das ist merkwürdig. Haben Sie schon einmal versucht, \n" +
                            "das System neu zu starten?");
        standardantworten.add("Welche Version unserer Software verwenden Sie denn?");
        standardantworten.add("Das könnte ein bekanntes Problem sein. Prüfen Sie mal unser FAQ.");
    }
    
    /**
     * Übung 6.33: Füllt die Map mit Stichwort-Antwort-Zuordnungen.
     */
    private void stichwortAntwortMapFuellen()
    {
        antwortMap.put("langsam", 
            "Ich vermute, dass das mit Ihrer Hardware zu tun hat. Ein Upgrade\n" +
            "für Ihren Prozessor sollte diese Probleme lösen.\n" +
            "Haben Sie ein Problem mit unserer Software?");
        
        antwortMap.put("fehler",
            "Nun ja, jede Software hat Fehler. Aber unsere Entwickler\n" +
            "arbeiten sehr hart daran, diese Fehler zu beheben.\n" +
            "Können Sie das Problem etwas genauer beschreiben?");
        
        antwortMap.put("teuer",
            "Unsere Preise sind absolut angemessen\n" +
            "und wirklich unser Leistungsspektrum wert.");
        
        antwortMap.put("absturz",
            "Das klingt nach einem kritischen Fehler. Bitte senden Sie uns\n" +
            "die Fehlermeldung und Ihre Systemkonfiguration zu.");
        
        antwortMap.put("installation",
            "Haben Sie die Installationsanleitung befolgt? Stellen Sie sicher,\n" +
            "dass Sie Administratorrechte haben.");
        
        antwortMap.put("update",
            "Prüfen Sie, ob Sie die neueste Version haben. Updates beheben\n" +
            "oft bekannte Probleme.");
        
        antwortMap.put("lizenz",
            "Für Lizenzfragen wenden Sie sich bitte an unseren Vertrieb.\n" +
            "Haben Sie Ihre Lizenznummer zur Hand?");
        
        antwortMap.put("dokumentation",
            "Die komplette Dokumentation finden Sie auf unserer Website.\n" +
            "Dort gibt es auch Video-Tutorials.");
        
        antwortMap.put("windows",
            "Welche Windows-Version verwenden Sie? Manche ältere Versionen\n" +
            "werden nicht mehr unterstützt.");
        
        antwortMap.put("mac",
            "Für Mac gibt es eine spezielle Version. Haben Sie diese heruntergeladen?");
        
        antwortMap.put("linux",
            "Linux-Support ist experimentell. Welche Distribution verwenden Sie?");
        
        antwortMap.put("hilfe",
            "Gerne helfen wir Ihnen! Beschreiben Sie das Problem bitte\n" +
            "so genau wie möglich.");
    }
    
    /**
     * Übung 6.22: Generiert eine zufällige Antwort aus den Standard-Antworten.
     * 
     * @return Eine zufällig gewählte Standard-Antwort
     */
    public String generiereZufaelligeAntwort()
    {
        int index = zufallsgenerator.nextInt(standardantworten.size());
        return standardantworten.get(index);
    }
    
    /**
     * Wählt zufällig eine Standard-Antwort aus (interne Hilfsmethode).
     * 
     * @return Eine zufällig gewählte Standard-Antwort
     */
    private String standardantwortAuswaehlen()
    {
        return generiereZufaelligeAntwort();
    }
    
    /**
     * Übung 6.33: Generiert eine Antwort basierend auf einem einzelnen Wort.
     * 
     * @param wort Das zu analysierende Wort
     * @return Eine passende Antwort oder eine Standard-Antwort
     */
    public String generiereAntwort(String wort)
    {
        // Wort normalisieren (kleinschreiben und Whitespace entfernen)
        String normalisiertesWort = wort.trim().toLowerCase();
        
        String antwort = antwortMap.get(normalisiertesWort);
        if (antwort != null) {
            return antwort;
        } else {
            // Wenn das Stichwort nicht erkannt wurde, Standard-Antwort wählen
            return standardantwortAuswaehlen();
        }
    }
    
    /**
     * Finale Version: Generiert eine Antwort basierend auf einer Menge von Wörtern.
     * Durchsucht alle Wörter nach bekannten Stichwörtern.
     * 
     * @param woerter Die zu analysierende Wortmenge
     * @return Eine passende Antwort oder eine Standard-Antwort
     */
    public String generiereAntwort(HashSet<String> woerter)
    {
        // Über alle Wörter iterieren
        for (String wort : woerter) {
            String antwort = antwortMap.get(wort);
            if (antwort != null) {
                // Erstes erkanntes Stichwort verwendet
                return antwort;
            }
        }
        
        // Wenn kein Stichwort erkannt wurde, Standard-Antwort wählen
        return standardantwortAuswaehlen();
    }
    
    /**
     * Fügt ein neues Stichwort-Antwort-Paar hinzu.
     * 
     * @param stichwort Das neue Stichwort
     * @param antwort Die zugehörige Antwort
     */
    public void stichwortHinzufuegen(String stichwort, String antwort)
    {
        antwortMap.put(stichwort.toLowerCase(), antwort);
    }
    
    /**
     * Fügt eine neue Standard-Antwort hinzu.
     * 
     * @param antwort Die neue Standard-Antwort
     */
    public void standardantwortHinzufuegen(String antwort)
    {
        standardantworten.add(antwort);
    }
    
    /**
     * Gibt alle bekannten Stichwörter aus.
     */
    public void alleStichwoerterAusgeben()
    {
        System.out.println("=== Bekannte Stichwörter ===");
        for (String stichwort : antwortMap.keySet()) {
            System.out.println("- " + stichwort);
        }
        System.out.println("Anzahl: " + antwortMap.size());
        System.out.println();
    }
    
    /**
     * Gibt Statistiken über die Antworten aus.
     */
    public void statistikAusgeben()
    {
        System.out.println("=== Beantworter Statistik ===");
        System.out.println("Standard-Antworten: " + standardantworten.size());
        System.out.println("Stichwort-Antworten: " + antwortMap.size());
        System.out.println();
    }
    
    /**
     * Testet alle Funktionalitäten des erweiterten Beantworters.
     */
    public void alleFunktionenTesten()
    {
        System.out.println("=== BeantworterErweitert Test ===\n");
        
        statistikAusgeben();
        alleStichwoerterAusgeben();
        
        // Test mit zufälligen Antworten
        System.out.println("=== Test: Zufällige Standard-Antworten ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + ". " + generiereZufaelligeAntwort());
            System.out.println();
        }
        
        // Test mit einzelnen Wörtern
        System.out.println("=== Test: Stichwort-basierte Antworten ===");
        String[] testwoerter = {"langsam", "fehler", "teuer", "unbekannt", "absturz"};
        
        for (String wort : testwoerter) {
            System.out.println("Eingabe: '" + wort + "'");
            System.out.println("Antwort: " + generiereAntwort(wort));
            System.out.println();
        }
        
        // Test mit Wortmengen
        System.out.println("=== Test: Wortmengen-basierte Antworten ===");
        
        HashSet<String> testmenge1 = new HashSet<>();
        testmenge1.add("das");
        testmenge1.add("programm");
        testmenge1.add("ist");
        testmenge1.add("sehr");
        testmenge1.add("langsam");
        
        System.out.println("Eingabe: " + testmenge1);
        System.out.println("Antwort: " + generiereAntwort(testmenge1));
        System.out.println();
        
        HashSet<String> testmenge2 = new HashSet<>();
        testmenge2.add("ich");
        testmenge2.add("brauche");
        testmenge2.add("hilfe");
        testmenge2.add("bitte");
        
        System.out.println("Eingabe: " + testmenge2);
        System.out.println("Antwort: " + generiereAntwort(testmenge2));
        System.out.println();
        
        HashSet<String> testmenge3 = new HashSet<>();
        testmenge3.add("hallo");
        testmenge3.add("welt");
        testmenge3.add("test");
        
        System.out.println("Eingabe: " + testmenge3);
        System.out.println("Antwort: " + generiereAntwort(testmenge3));
        System.out.println();
        
        System.out.println("=== BeantworterErweitert Test abgeschlossen ===");
    }
}