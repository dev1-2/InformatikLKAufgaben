import java.util.Arrays;

/**
 * Die Klasse SortierenTest demonstriert verschiedene Sortiermethoden für Arrays.
 * Diese Klasse implementiert Übung 6.41 und zeigt den Umgang mit der Arrays-Klasse.
 * 
 * Übung 6.41: Array-Sortierung und Arrays-Klasse
 * 
 * @author Entwickelt für Informatik LK Aufgaben
 * @version 1.0
 */
public class SortierenTest
{
    /**
     * Konstruktor für SortierenTest.
     */
    public SortierenTest()
    {
        // Leerer Konstruktor
    }
    
    /**
     * Übung 6.41: Sortiert ein Array von int-Werten und gibt sie aus.
     * Das Array wird in aufsteigender Reihenfolge (kleinstes Element zuerst) sortiert.
     * 
     * @param zahlen Das zu sortierende Array von int-Werten
     */
    public void sortiereUndAusgeben(int[] zahlen)
    {
        // Überprüfung auf null
        if (zahlen == null) {
            System.out.println("Array ist null - nichts zu sortieren.");
            return;
        }
        
        // Array vor dem Sortieren anzeigen
        System.out.println("Array vor dem Sortieren:");
        arrayAusgeben(zahlen);
        
        // Array sortieren (aufsteigend)
        Arrays.sort(zahlen);
        
        // Array nach dem Sortieren anzeigen
        System.out.println("Array nach dem Sortieren (aufsteigend):");
        arrayAusgeben(zahlen);
    }
    
    /**
     * Hilfsmethode: Gibt ein int-Array formatiert auf der Konsole aus.
     * 
     * @param zahlen Das auszugebende Array
     */
    private void arrayAusgeben(int[] zahlen)
    {
        if (zahlen.length == 0) {
            System.out.println("Array ist leer.");
            return;
        }
        
        System.out.print("[ ");
        for (int i = 0; i < zahlen.length; i++) {
            System.out.print(zahlen[i]);
            if (i < zahlen.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        System.out.println("Anzahl Elemente: " + zahlen.length);
    }
    
    /**
     * Erweiterte Version: Sortiert ein Array ohne das Original zu verändern.
     * 
     * @param zahlen Das ursprüngliche Array
     * @return Ein neues sortiertes Array
     */
    public int[] sortiereKopie(int[] zahlen)
    {
        if (zahlen == null) {
            return null;
        }
        
        // Kopie des Arrays erstellen
        int[] kopie = Arrays.copyOf(zahlen, zahlen.length);
        
        // Kopie sortieren
        Arrays.sort(kopie);
        
        return kopie;
    }
    
    /**
     * Überprüft, ob ein Array sortiert ist.
     * 
     * @param zahlen Das zu überprüfende Array
     * @return true, wenn das Array aufsteigend sortiert ist
     */
    public boolean istSortiert(int[] zahlen)
    {
        if (zahlen == null || zahlen.length <= 1) {
            return true;
        }
        
        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < zahlen[i-1]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Sucht einen Wert in einem sortierten Array (binäre Suche).
     * 
     * @param sortierteZahlen Das sortierte Array
     * @param suchWert Der gesuchte Wert
     * @return Der Index des gefundenen Werts, oder -1 wenn nicht gefunden
     */
    public int binaereSuche(int[] sortierteZahlen, int suchWert)
    {
        if (sortierteZahlen == null) {
            return -1;
        }
        
        return Arrays.binarySearch(sortierteZahlen, suchWert);
    }
    
    /**
     * Vergleicht zwei Arrays auf Gleichheit.
     * 
     * @param array1 Das erste Array
     * @param array2 Das zweite Array
     * @return true, wenn die Arrays gleich sind
     */
    public boolean arraysGleich(int[] array1, int[] array2)
    {
        return Arrays.equals(array1, array2);
    }
    
    /**
     * Füllt ein Array mit einem bestimmten Wert.
     * 
     * @param zahlen Das zu füllende Array
     * @param wert Der Wert, mit dem gefüllt werden soll
     */
    public void arrayFuellen(int[] zahlen, int wert)
    {
        if (zahlen != null) {
            Arrays.fill(zahlen, wert);
        }
    }
    
    /**
     * Erstellt ein Array aus einer Reihe von Werten.
     * 
     * @param werte Die Werte für das Array
     * @return Ein neues Array mit den angegebenen Werten
     */
    public int[] erstelleArray(int... werte)
    {
        return werte.clone();
    }
    
    /**
     * Demonstriert alle Sortierfunktionalitäten.
     */
    public void alleFunktionenTesten()
    {
        System.out.println("=== SortierenTest Demonstration ===\n");
        
        // Test 1: Grundlegendes Sortieren
        System.out.println("1. Grundlegendes Sortieren:");
        int[] testArray1 = {64, 34, 25, 12, 22, 11, 90};
        sortiereUndAusgeben(testArray1);
        System.out.println();
        
        // Test 2: Bereits sortiertes Array
        System.out.println("2. Bereits sortiertes Array:");
        int[] testArray2 = {1, 2, 3, 4, 5};
        sortiereUndAusgeben(testArray2);
        System.out.println();
        
        // Test 3: Umgekehrt sortiertes Array
        System.out.println("3. Umgekehrt sortiertes Array:");
        int[] testArray3 = {10, 8, 6, 4, 2, 0};
        sortiereUndAusgeben(testArray3);
        System.out.println();
        
        // Test 4: Array mit doppelten Werten
        System.out.println("4. Array mit doppelten Werten:");
        int[] testArray4 = {5, 2, 8, 2, 9, 1, 5, 5};
        sortiereUndAusgeben(testArray4);
        System.out.println();
        
        // Test 5: Sortieren ohne Original zu ändern
        System.out.println("5. Sortieren ohne Original zu ändern:");
        int[] original = {9, 3, 7, 1, 5};
        System.out.println("Original vor Sortierung:");
        arrayAusgeben(original);
        
        int[] sortiert = sortiereKopie(original);
        System.out.println("Sortierte Kopie:");
        arrayAusgeben(sortiert);
        
        System.out.println("Original nach Sortierung (unverändert):");
        arrayAusgeben(original);
        System.out.println();
        
        // Test 6: Sortierung überprüfen
        System.out.println("6. Sortierung überprüfen:");
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 1, 3, 2, 4};
        
        System.out.print("Array [1, 2, 3, 4, 5] ist sortiert: ");
        System.out.println(istSortiert(array1));
        
        System.out.print("Array [5, 1, 3, 2, 4] ist sortiert: ");
        System.out.println(istSortiert(array2));
        System.out.println();
        
        // Test 7: Binäre Suche
        System.out.println("7. Binäre Suche in sortiertem Array:");
        int[] sortierteZahlen = {1, 3, 5, 7, 9, 11, 13, 15};
        System.out.println("Sortiertes Array:");
        arrayAusgeben(sortierteZahlen);
        
        int[] suchWerte = {7, 4, 1, 15, 20};
        for (int suchWert : suchWerte) {
            int index = binaereSuche(sortierteZahlen, suchWert);
            if (index >= 0) {
                System.out.println("Wert " + suchWert + " gefunden an Index " + index);
            } else {
                System.out.println("Wert " + suchWert + " nicht gefunden");
            }
        }
        System.out.println();
        
        // Test 8: Arrays vergleichen
        System.out.println("8. Arrays vergleichen:");
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = {1, 2, 3, 4, 5};
        int[] arrayC = {5, 4, 3, 2, 1};
        
        System.out.println("ArrayA gleich ArrayB: " + arraysGleich(arrayA, arrayB));
        System.out.println("ArrayA gleich ArrayC: " + arraysGleich(arrayA, arrayC));
        System.out.println();
        
        // Test 9: Array füllen
        System.out.println("9. Array mit Wert füllen:");
        int[] fuellArray = new int[8];
        System.out.println("Leeres Array:");
        arrayAusgeben(fuellArray);
        
        arrayFuellen(fuellArray, 42);
        System.out.println("Mit 42 gefülltes Array:");
        arrayAusgeben(fuellArray);
        System.out.println();
        
        // Test 10: Spezialfälle
        System.out.println("10. Spezialfälle:");
        
        // Leeres Array
        int[] leeresArray = {};
        System.out.println("Leeres Array sortieren:");
        sortiereUndAusgeben(leeresArray);
        
        // Ein-Element Array
        int[] einElementArray = {42};
        System.out.println("Ein-Element Array sortieren:");
        sortiereUndAusgeben(einElementArray);
        
        // Null Array
        System.out.println("Null Array sortieren:");
        sortiereUndAusgeben(null);
        
        System.out.println("\n=== SortierenTest abgeschlossen ===");
    }
}