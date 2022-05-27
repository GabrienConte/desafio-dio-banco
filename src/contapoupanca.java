public class contapoupanca extends  conta {

    public contapoupanca(cliente cliente) {
        super(cliente);
        this.tipoConta = tiposConta.CONTAPOUPANCA.toString();
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--> Extrato Conta Poupança <--");
        imprimirInfoComum();
    }
}
