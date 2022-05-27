public abstract class conta implements Iconta {

    private static int SEQUENCIAL = 1;
    private static final int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected cliente cliente;

    protected String tipoConta;
    public enum tiposConta {
        CONTAPOUPANCA("Conta Poupança"), CONTACORRENTE("Conta Corrente");

        private final String text;
        tiposConta(final String text){
            this.text = text;
        }
        @Override
        public String toString(){
            return text;
        }
    }

    public conta(cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    protected void imprimirInfoComum(){
        System.out.printf("Nome Cliente: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public cliente getCliente() {
        return cliente;
    }

    public String getTipoConta() {
        return tipoConta;
    }
}
