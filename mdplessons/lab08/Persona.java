package lab08;

public class Persona implements Parlante {
    String name;

    public Persona(String name) {
        this.name = name;
    }
    
    public void parla() {
        System.out.println("Ciao sono " + name);
    }
}