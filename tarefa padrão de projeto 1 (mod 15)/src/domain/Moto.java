package domain;

public class Moto extends Veiculo{
    public Moto(){
        modelo = "XRE";
        ano = 2023;
        cor = "preto";
        detalhesAdicionais.add("escapamento alterado");
        detalhesAdicionais.add("pneus alterados");
    }
}
