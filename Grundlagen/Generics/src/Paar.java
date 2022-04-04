public class Paar<E,Z>{
    private E e;
    private Z z;

    public Paar(E e,Z z){
        this.e = e;
        this.z = z;
    }

    //Returns the first komponent.
    public E getErstens(){
        return this.e;
    }

    //Returns the second komponent.
    public Z getZweitens(){
        return this.z;
    }

    //Setting the value for the first komponent.
    public E setErstens(E e){
        E value = this.e;
        this.e = e;
        return value; //Returning the old values.
    }

    //Setting the value for the second komponent.
    public Z setZweitens(Z z){
        Z value = this.z;
        this.z = z;
        return value; //Returning the old values.
    }

    //Sets the values for the both komponents.
    public void setBeide(E e,Z z){
        this.e = e;
        this.z = z;
    }

    //Checks whether each komponents matches with the komponents of p.
    public boolean equals(Paar<E,Z>p){
        return p.e == this.e && p.z == this.z;
    }

    //Returns the pair as "(e,z)".
    public String toString(){
        return "(" + this.e + "," + this.z + ")";
    }
}
