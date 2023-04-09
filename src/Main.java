import ListaGen.ListaGen;

public class Main {
    public static void main(String[] args) {
        ListaGen lg = new ListaGen();
        String resp = Entrada.leString("Informe a lista gen que deseja criar \n Exemplo:  [aaa, [bbb, ccc], ddd, [eee, [ ], fff]]\n");

        lg.manipular(resp);
    }
}