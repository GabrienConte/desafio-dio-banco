import java.util.List;
import java.util.stream.Collectors;

public class banco {

    private String nome;
    private List<conta> contas;

    public banco(String nome, List<conta> contas) {
        this.nome = nome;
        this.contas = contas;
    }

    public List<conta> ordenarLista(List<conta> contas){
        return contas.stream().sorted((c1,c2) ->
                        c1.cliente.getNome()
                        .compareTo(c2.cliente.getNome()))
                        .collect(Collectors.toList());
    }
    public void exibirLista(){
        List<conta> contasOrdenadas = ordenarLista(this.contas);

        System.out.printf("---Clientes Banco: %s---",this.nome);
        for (conta conta: contasOrdenadas ) {
            System.out.printf("\nNome Cliente: %s%n",conta.cliente.getNome());
            System.out.printf("Id: %d%n",conta.cliente.getId());
            System.out.printf("Número Conta: %d%n",conta.getNumero());
            System.out.printf("Tipo Conta: %s%n",conta.getTipoConta());
            System.out.printf("-------------------------");
        }

    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
