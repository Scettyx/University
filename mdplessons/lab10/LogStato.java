package lab10;

public class LogStato implements Azione {
    @Override
    public void esegui(DispositivoDomo d) {
        String stato = d.isAcceso() ? "Acceso" : "Spento";
        System.out.println("LOG -> Dispositivo: " + d.getNome() + " | Stato: " + stato);
        d.registraAzione("LogStato");
    }
}