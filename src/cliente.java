public class cliente {

    private static int ID_CLIENTE = 1;
    private int id;
    private String nome;

    public cliente(String nome) {
        this.id = ID_CLIENTE++;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
