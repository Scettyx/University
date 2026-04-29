package lab09;

public class Studente implements Comparable<Studente> {
    private String nome;
    private String cognome;
    private double media;

    public Studente(String nome, String cognome, double media) {
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public double getMedia() {
        return media;
    }
    
    @Override
    public String toString() {
        return "Studente [" + nome + " " + cognome + " - Media: " + media + "]";
    }

    @Override
    public int compareTo(Studente altro) {
        int confrontoMedia = Double.compare(altro.media, this.media);

        if (confrontoMedia != 0) {
            return confrontoMedia;
        }

        int confrontoCognome = this.cognome.compareTo(altro.cognome);

        if (confrontoCognome != 0) {
            return confrontoCognome;
        }

        return this.nome.compareTo(altro.nome);
    }
}