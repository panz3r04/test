/**
 * Created by Panzerek on 2016-12-05.
 */
public class pieter {
    private String imie;
    private String nazwisko;

    public pieter(String name, String surname){
        this.imie = name;
        this.nazwisko = surname;
    }

    public String credentials(){
        return imie + " " + nazwisko;
    }
}
