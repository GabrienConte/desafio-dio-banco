public class contapoupanca extends  conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("--> Extrato Conta Poupança <--");
        imprimirInfoComum();
    }
}
