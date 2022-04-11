public class EVL<T>{
    Listenelement first = null;   //Zeige auf das erste Element.

    class Listenelement{
        T data;
        Listenelement next = null; //Zeige auf das naechste Element.

        Listenelement(T data){
            this.data = data;
        }
    }

}
