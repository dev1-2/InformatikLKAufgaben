import java.util.HashSet;

/**
 * Die Klasse KundendienstsystemVollstaendig implementiert ein vollständiges System
 * für den technischen Kundendienst mit allen Verbesserungen aus dem Lehrbuch.
 * 
 * Diese Version integriert:
 * - EingabeleserErweitert für Wort-Tokenization
 * - BeantworterErweitert für intelligente Antworten
 * - Alle Funktionalitäten aus den Übungen
 * 
 * Finale Integration aller Übungen aus Kapitel 6
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 3.0
 */
public class KundendienstsystemVollstaendig
{
    private EingabeleserErweitert leser;
    private BeantworterErweitert beantworter;
    
    /**
     * Konstruktor für KundendienstsystemVollstaendig.
     * Erzeugt die notwendigen Komponenten.
     */
    public KundendienstsystemVollstaendig()
    {
        leser = new EingabeleserErweitert();
        beantworter = new BeantworterErweitert();
    }
    
    /**
     * Startet das vollständige Kundendienstsystem.
     * Implementiert die finale Version mit Wort-basierter Analyse.
     */
    public void starten()
    {
        boolean fertig = false;
        
        willkommenstextAusgeben();
        
        while (!fertig) {
            // Eingabe als Wortmenge einlesen
            HashSet<String> eingabe = leser.gibEingabeAlsWoerter();
            
            // Auf Beendigung prüfen (ade, ade, tschüss, quit, exit)
            if (eingabe.contains("ade") || eingabe.contains("tschüss") || 
                eingabe.contains("quit") || eingabe.contains("exit") || 
                eingabe.contains("beenden")) {
                fertig = true;
            } else {
                // Antwort basierend auf der Wortmenge generieren
                String antwort = beantworter.generiereAntwort(eingabe);
                System.out.println(antwort);
                System.out.println();
            }
        }
        
        abschiedstextAusgeben();
    }
    
    /**
     * Startet eine vereinfachte Version mit String-basierter Eingabe.
     * Für Rückwärtskompatibilität und Demonstrationszwecke.
     */
    public void startenEinfach()
    {
        boolean fertig = false;
        
        willkommenstextAusgeben();
        
        while (!fertig) {
            // Eingabe als String einlesen
            String eingabe = leser.gibEingabe();
            
            // Eingabe normalisieren
            eingabe = eingabe.trim().toLowerCase();
            
            // Auf Beendigung prüfen
            if (eingabe.startsWith("ade") || eingabe.equals("quit") || 
                eingabe.equals("exit") || eingabe.equals("beenden")) {
                fertig = true;
            } else {
                // Antwort basierend auf einzelnem String generieren
                String antwort = beantworter.generiereAntwort(eingabe);
                System.out.println(antwort);
                System.out.println();
            }
        }
        
        abschiedstextAusgeben();
    }
    
    /**
     * Gibt den Willkommenstext auf der Konsole aus.
     */
    private void willkommenstextAusgeben()
    {
        System.out.println("==============================================");
        System.out.println("Willkommen beim technischen Kundendienst");
        System.out.println("der Firma SeltsamSoft GmbH");
        System.out.println("==============================================");
        System.out.println();
        System.out.println("Bitte schildern Sie uns Ihr Problem.");
        System.out.println("Wir werden Sie bestmöglich unterstützen.");
        System.out.println();
        System.out.println("Bekannte Stichwörter:");
        beantworter.alleStichwoerterAusgeben();
        System.out.println("Bitte tippen Sie 'ade', 'tschüss', 'quit' oder 'beenden',");
        System.out.println("um unser System zu verlassen.");
        System.out.println();
    }
    
    /**
     * Gibt den Abschiedstext auf der Konsole aus.
     */
    private void abschiedstextAusgeben()
    {
        System.out.println();
        System.out.println("==============================================");
        System.out.println("Vielen Dank für das Gespräch!");
        System.out.println("Ihr SeltsamSoft Kundendienst-Team");
        System.out.println("==============================================");
        
        // Statistiken anzeigen
        beantworter.statistikAusgeben();
        
        // Ressourcen aufräumen
        leser.schliessen();
    }
    
    /**
     * Erweiterte Startmethode mit verschiedenen Modi.
     * 
     * @param modus Der gewünschte Modus ("vollstaendig", "einfach", "demo")
     */
    public void startenMitModus(String modus)
    {
        System.out.println("Starte Kundendienstsystem im Modus: " + modus);
        System.out.println();
        
        switch (modus.toLowerCase()) {
            case "vollstaendig":
            case "full":
                starten();
                break;
                
            case "einfach":
            case "simple":
                startenEinfach();
                break;
                
            case "demo":
                demonstrieren();
                break;
                
            default:
                System.out.println("Unbekannter Modus. Verwende Standard-Modus.");
                starten();
                break;
        }
    }
    
    /**
     * Demonstriert das System mit vordefinierten Eingaben.
     */
    private void demonstrieren()
    {
        System.out.println("=== Demonstration des Kundendienstsystems ===");
        System.out.println();
        
        willkommenstextAusgeben();
        
        String[] testEingaben = {
            "Das Programm ist sehr langsam",
            "Ich habe einen Fehler gefunden",
            "Die Software ist zu teuer",
            "Hilfe, das Programm stürzt ab",
            "Brauche Hilfe bei der Installation",
            "Gibt es ein Update?",
            "Wo finde ich die Dokumentation?",
            "Das läuft unter Windows nicht",
            "Ich brauche Hilfe",
            "Das verstehe ich nicht"
        };
        
        for (String testEingabe : testEingaben) {
            System.out.println("> " + testEingabe);
            
            // Eingabe in Wörter zerlegen (simuliert)
            HashSet<String> woerter = new HashSet<>();
            String[] wortArray = testEingabe.toLowerCase().split("\\s+");
            for (String wort : wortArray) {
                woerter.add(wort.replaceAll("[,.!?;:\"'()\\[\\]{}]", ""));
            }
            
            String antwort = beantworter.generiereAntwort(woerter);
            System.out.println(antwort);
            System.out.println();
            
            // Kurze Pause für bessere Lesbarkeit
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // Ignorieren
            }
        }
        
        System.out.println("> ade");
        abschiedstextAusgeben();
    }
    
    /**
     * Hauptmethode zum Testen des vollständigen Systems.
     * 
     * @param args Kommandozeilenargumente (optional: Modus)
     */
    public static void main(String[] args)
    {
        KundendienstsystemVollstaendig system = new KundendienstsystemVollstaendig();
        
        if (args.length > 0) {
            system.startenMitModus(args[0]);
        } else {
            // Standard: Interaktiver Vollmodus
            system.starten();
        }
    }
    
    /**
     * Testet alle Komponenten des Systems.
     */
    public void komponentenTesten()
    {
        System.out.println("=== Test aller Komponenten ===\n");
        
        System.out.println("1. Test BeantworterErweitert:");
        beantworter.alleFunktionenTesten();
        System.out.println();
        
        System.out.println("2. Test EingabeleserErweitert:");
        System.out.println("(Eingabetests werden übersprungen in automatischem Test)");
        System.out.println();
        
        System.out.println("3. Demo des integrierten Systems:");
        demonstrieren();
    }
}