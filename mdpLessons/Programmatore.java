public class Programmatore {
    private String nome;
    private String cognome;
    private String azienda;
    private String linguaggi;

    public Programmatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.azienda = "";
        this.linguaggi = "";
    }
    
    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public void addLinguaggio(String linguaggio) {
        if (this.linguaggi.isEmpty()) {
            this.linguaggi = linguaggio;
        } else {
            this.linguaggi += " " + linguaggio;
        }
    }

    public String getNome() {
        return this.nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public String getAzienda() {
        return this.azienda;
    }

    public String getLinguaggi() {
        return this.linguaggi;
    }

    public static void main(String[] args) {
        Programmatore p1 = new Programmatore ("Bjarne", "Stroustrup");
        Programmatore p2 = new Programmatore ("Brian", "Kernighan");
        Programmatore p3 = new Programmatore ("James", "Gosling");

        p1.addLinguaggio("C");
        p1.addLinguaggio("C++");
        p1.setAzienda("Morgan Stanley");

        p2.addLinguaggio("C");
        p2.addLinguaggio("Javascript");
        
        p3.addLinguaggio("Java");
        p3.addLinguaggio("Python");

        System.out.println(p1.getAzienda());
        System.out.println(p2.getLinguaggi());
    }
}
