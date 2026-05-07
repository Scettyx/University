package lab10;

public class Accensione implements Azione {
    @Override
    public void esegui (DispositivoDomo d) {
        d.setAcceso(true);
        d.registraAzione("Accensione");
    }
}