package TestClase;

public class Persoana {
    private int varsta;
    private String nume;
    private String prenume;
    private String sex;
    private String CNP;

    Persoana() {
        varsta=20;
        prenume="unknown";
        nume="necunoscut";
        sex=null;
        CNP=null;

    }
    Persoana(int varsta, String nume){
        this.varsta=varsta;
        this.nume=nume;
        this.sex=null;

    }

    Persoana(int varsta, String nume, String prenume, String sex){
        this.varsta=varsta;
        this.nume=nume;
        this.prenume=prenume;
        this.sex=sex;
    }

    public void sayHello() {
        System.out.println("Hello World from Persoana");
    }

    public String toString () {
        return "Aceasta persoana este " + this.nume + " si are varsta de " + this.varsta + " ani";
    }





}
