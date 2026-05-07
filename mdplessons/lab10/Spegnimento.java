package lab10;

public class Spegnimento implements Azione {
    @Override
    public void esegui(DispositivoDomo d) {
        d.setAcceso(!d.isAcceso());
        d.registraAzione("Spegnimento");
    }
}