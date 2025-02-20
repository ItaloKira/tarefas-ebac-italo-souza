package domain;

public class Aviao extends Veiculo {
    public Aviao(){
        modelo = "phenon 100";
        ano = 2017;
        cor = "cinza";
        detalhesAdicionais.add("Piloto incluso");
        detalhesAdicionais.add("verificação em dia");
    }
}