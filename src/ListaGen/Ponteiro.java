package ListaGen;

public class Ponteiro extends No{
    private Ponteiro cauda;

    public Ponteiro(Ponteiro cabeca, Ponteiro cauda) {
        super(cabeca);
        this.cauda = cauda;
    }
    public Ponteiro getCauda() {
        return cauda;
    }

    public void setCauda(Ponteiro cauda) {
        this.cauda = cauda;
    }

    public void setCabeca(Ponteiro cabeca) {
        this.setCabeca(cabeca);
    }
}
