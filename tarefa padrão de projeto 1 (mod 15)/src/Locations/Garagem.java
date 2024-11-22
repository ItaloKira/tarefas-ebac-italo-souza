package Locations;

import domain.Veiculo;

public abstract class Garagem {
    public enum Localidades{
        EUA, BRASIL, FRANCA;
    }
    abstract Veiculo fabricarVeiculo(Veiculo.Tipos tipo);

    public Veiculo pedirVeiculo(Veiculo.Tipos tipo){
        Veiculo veiculo = fabricarVeiculo(tipo);
        System.out.println("*************************");
        System.out.println("Preparando veiculo");
        return veiculo;
    }
}