package lab10;

public class DispositivoDomo {
    private String nome;
    private boolean acceso;
    private String[] storicoAzioni;
    private int conteggioAzioni;

    public DispositivoDomo(String nome) {
        this.nome = nome;
        this.acceso = false;
        this.storicoAzioni = new String[10];
        this.conteggioAzioni = 0;
    }

    public String getNome() { return nome; }
    public boolean isAcceso() { return acceso; }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public void registraAzione(String nomeAzione) {
        if (conteggioAzioni < storicoAzioni.length) {
            storicoAzioni[conteggioAzioni] = nomeAzione;
            conteggioAzioni++;
        }
    }

    public void stampaStorico() {
        System.out.println("Storico di " + nome + ":");
        for (int i = 0; i < conteggioAzioni; i++) {
            System.out.println("- " + storicoAzioni[i]);
        }
    }
}