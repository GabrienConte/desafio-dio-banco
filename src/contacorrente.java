public class contacorrente extends conta{

    public contacorrente(cliente cliente) {
        super(cliente);
        this.tipoConta = tiposConta.CONTACORRENTE.toString();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--> Extrato Corrente <--");
        imprimirInfoComum();
    }
}
