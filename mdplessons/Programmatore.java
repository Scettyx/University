public class Programmatore {
    private String nome, cognome, azienda, linguaggi;

    public Programmatore(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        azienda = "";
        linguaggi = "";
    }
    
    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public void addLinguaggio(String linguaggio) {
        if (linguaggi.isEmpty()) {
            linguaggi = linguaggio;
        } else {
            linguaggi += " " + linguaggio;
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getAzienda() {
        return azienda;
    }

    public String getLinguaggi() {
        return linguaggi;
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
