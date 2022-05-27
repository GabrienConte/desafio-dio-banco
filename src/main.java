public class main {
    public static void main(String[] args) {
        conta cc = new contacorrente();
        conta poupanca = new contapoupanca();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
