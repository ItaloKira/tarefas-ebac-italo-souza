public abstract class Pessoa {

    private String nome;

    private String sobreNome;

    private int id;

    public Pessoa (String Nome, String sobreNome, int id){
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
