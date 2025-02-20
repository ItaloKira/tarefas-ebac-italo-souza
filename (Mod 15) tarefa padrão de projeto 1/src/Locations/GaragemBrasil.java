package Locations;

import domain.*;

public class GaragemBrasil extends Garagem {
    @Override
    Veiculo fabricarVeiculo(Veiculo.Tipos tipo) {
        switch (tipo){
            case Carro:
                return new Carro();
            case Moto:
                new Moto();
            case Barco:
                new Barco();
            case Aviao:
                new Aviao();
            default:
                System.err.println("Veiculo não identificado");
                return null;
        }
    }
}
