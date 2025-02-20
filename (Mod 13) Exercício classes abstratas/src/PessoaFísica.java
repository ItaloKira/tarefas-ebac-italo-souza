public class PessoaFísica extends Pessoa{

    private long cpf;

    private String LocalDeTrabalho;

    private String função;

    public PessoaFísica(String nome, String sobreNome, int id, long cpf, String localDeTrabalho, String função){
        super(nome, sobreNome, id);
        this.cpf = cpf;
        this.LocalDeTrabalho = localDeTrabalho;
        this.função = função;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getLocalDeTrabalho() {
        return LocalDeTrabalho;
    }

    public void setLocalDeTrabalho(String localDeTrabalho) {
        LocalDeTrabalho = localDeTrabalho;
    }

    public String getFunção() {
        return função;
    }

    public void setFunção(String função) {
        this.função = função;
    }
}
