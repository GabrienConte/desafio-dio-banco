import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<cliente> clientes = Arrays.asList(new cliente("Gabriel"),
                new cliente("Gideon"),
                new cliente("Bernardo"),
                new cliente("Marcia"));

        List<conta> contas = Arrays.asList(new contapoupanca(clientes.get(0)),
                new contacorrente(clientes.get(0) ),
                new contapoupanca(clientes.get(1)),
                new contacorrente(clientes.get(2)),
                new contapoupanca(clientes.get(3)));

        contas.get(0).depositar(500);
        contas.get(1).depositar(600);
        contas.get(2).depositar(50);
        contas.get(3).depositar(200);
        contas.get(4).depositar(300);

        contas.get(0).sacar(100);
        contas.get(1).sacar(50);
        contas.get(2).sacar(10);
        contas.get(3).sacar(20);
        contas.get(4).sacar(77);

        contas.get(2).transferir(10, contas.get(1));

        for (conta c: contas) {
            c.imprimirExtrato();
        }

        banco banco = new banco("Banco do Brasil", contas);

        banco.exibirLista();
    }
}
