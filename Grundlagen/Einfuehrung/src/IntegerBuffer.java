public interface IntegerBuffer {
    public void push(Integer i); //Speichert ein Objekt im Speicher.
    public Integer pop();        //Liefert ein Objekt vom Speicher zurueck.
    public int size();           //Gibt die Anzahl von Objekten zurueck.
    public int capacity();       //Gibt die Groesse des Speichers zurueck.
}
