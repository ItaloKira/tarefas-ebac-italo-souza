public class PessoaJurídica extends Pessoa{

    private long CNPJ;

    private String NomeDaEmpresa;

    private String Domínio;

    public PessoaJurídica(String nome, String sobreNome, int id, long CNPJ, String NomeDaEmpresa, String Domínio){
        super(nome, sobreNome, id);
        this.CNPJ = CNPJ;
        this. NomeDaEmpresa = NomeDaEmpresa;
        this.Domínio = Domínio;
    }

    public long getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(long CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeDaEmpresa() {
        return NomeDaEmpresa;
    }

    public void setNomeDaEmpresa(String nomeDaEmpresa) {
        NomeDaEmpresa = nomeDaEmpresa;
    }

    public String getDomínio() {
        return Domínio;
    }

    public void setDomínio(String domínio) {
        Domínio = domínio;
    }
}
