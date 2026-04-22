package lab08;

public class AI implements Parlante {
    String name_software;

    public AI(String name_software) {
        this.name_software = name_software;
    }

    public void parla() {
        System.out.println("Sono il software " + name_software);
    }
}