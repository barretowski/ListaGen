package ListaGen;

public class ListaGen {
    private char terminal;
    private No no;

    public ListaGen(){}
    public ListaGen(char terminal, No no) {
        this.terminal = terminal;
        this.no = no;
    }

    public ListaGen criaAt(String info){
        ListaGen lg = new ListaGen();
        lg.terminal = 1;
        lg.no.info = info;

        return lg;
    }

    public ListaGen cons(Ponteiro H,  Ponteiro T){
        ListaGen lg = new ListaGen();
        lg.terminal = 0;
        lg.no.lista.setCauda(T);
        lg.no.lista.setCabeca(H);
        return lg;
    }

    public void manipular(String texto){

    }
}
