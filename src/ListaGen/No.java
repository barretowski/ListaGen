package ListaGen;

public class No {
    protected String info;
    protected Ponteiro lista;

    public No(String info) {
        this.info = info;
    }
    public No(Ponteiro lista){
        this.lista = lista;
    }
    public String getInfo(){
        return info;
    }

}
