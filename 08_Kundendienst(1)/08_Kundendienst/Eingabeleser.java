import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * ein Eingabeleser liest eingetippten Text von der Konsole.
 * 
 * Class Eingabeleser reads typed text input from the standard text terminal. The text
 * typed by a user is then chopped into words, and a set of words is provided.
 * 
 */
public class Eingabeleser
{
    private BufferedReader reader;

    /**
     * Erzeuge einen neuen Eingabeleser der Text von der Konsole
     * einliest.
     */
    public Eingabeleser()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));;
    }

    /**
     * Lies eine Zeile von der Konsole und liefere sie als Ergebnis.
     *
     * @return  Eine Textzeile, die vom Benutzer eingetippt wurde.
     */
    public String gibEingabe() 
    {
        System.out.print("> ");   // Eingabebereitschaft anzeigen
        String eingabezeile = eingabezeileEinlesen();

        return eingabezeile;
    }

    /**
     * Lies eine Eingabezeile und liefere sie als String-Ergebnis.
     *
     * @return  Einen String, der die Eingabezeile enthaelt, oder 
     *           einen leeren String im Falle eines Fehlers.
     */
    private String eingabezeileEinlesen()
    {
        String zeile = "";

        try {
            zeile = reader.readLine();
        }
        catch(java.io.IOException exc) {
            System.out.println ("Beim Einlesen ist ein Fehler aufgetreten: " + exc.getMessage());
        }
        return zeile;
    }
}
