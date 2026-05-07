package lab10;

public class InvertiStato implements Azione {
    @Override
    public void esegui(DispositivoDomo d) {
        d.setAcceso(!d.isAcceso());
        d.registraAzione("InvertiStato");
    }
}