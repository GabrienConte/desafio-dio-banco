public class contacorrente extends conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("--> Extrato Corrente <--");
        imprimirInfoComum();
    }
}
