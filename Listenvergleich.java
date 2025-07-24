package Listenvergleich;
import java.util.ArrayList;// Importierung der Klasse zur Erschaffung von ArrayLists
import java.util.LinkedList;// Importierung der Klasse zur Erschaffung von LinkedLists

public class Listenvergleich{
    public static void main(String[] args){
        int Groesse = 1000000;// Größe der Linked und ArrayList
        ArrayList<Integer> ArrayList = new ArrayList<>(Groesse);// Erschaffung einer ArrayList mit der angegebenen Größe
        LinkedList<Integer> LinkedList = new LinkedList<>();// Erschaffung einer LinkedList mit der angegebenen Größe
        int Iterationen = 10;// Anzahl der Iterationen für die Messung der Laufzeit
        long Gesamtzeit_ArrayList = 0;// Variable für die Gesamtzeit der ArrayList
        long Gesamtzeit_LinkedList = 0;// Variable für die Gesamtzeit der LinkedList
        for (int i = 0; i < Groesse; i++) {// Schleife zum Hinzufügen der Elemente zeitgleich in ArrayList und LinkedList
           
           long Startzeit = System.nanoTime();// Abruf der aktuellen Zeit in Nanosekunden als Startzeit für LinkedList
            LinkedList.add(i);// Hinzufügen von Elementen zur LinkedList
            Gesamtzeit_LinkedList += System.nanoTime() - Startzeit;// Addieren der Zeit des aktuellen Durchlaufes zur Gesamtzeit der LinkedList
            Startzeit = System.nanoTime();// Abruf der aktuellen Zeit in Nanosekunden als Startzeit für ArrayList
            ArrayList.add(i);// Hinzufügen von Elementen zur ArrayList
            Gesamtzeit_ArrayList += System.nanoTime() - Startzeit;// Addieren der Zeit des aktuellen Durchlaufes zur Gesamtzeit der ArrayList

        }
        System.out.println("ArrayList: " + Gesamtzeit_ArrayList + " ns");// Ausgabe der Gesamtzeit der ArrayList in Nanosekunden
        System.out.println("LinkedList: " + Gesamtzeit_LinkedList + " ns");// Ausgabe der Gesamtzeit der LinkedList in Nanosekunden
    }
}
