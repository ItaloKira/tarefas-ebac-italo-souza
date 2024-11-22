package domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {

    public enum Tipos{
        Carro, Moto, Barco, Aviao;
    }
        String modelo;
        String cor;
        short ano;
        List<String> detalhesAdicionais = new ArrayList<>();

//    public Veiculo(String modelo, String cor, short ano, List<String> detalhesAdicionais) {
//        this.modelo = modelo;
//        this.cor = cor;
//        this.ano = ano;
//        this.detalhesAdicionais = detalhesAdicionais;
//    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public void setDetalhesAdicionais(List<String> detalhesAdicionais) {
        this.detalhesAdicionais = detalhesAdicionais;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public short getAno() {
        return ano;
    }

    public List<String> getDetalhesAdicionais() {
        return detalhesAdicionais;
    }
}
