package Locations;

import domain.*;

public class GaragemFranca extends Garagem {


    @Override
    Veiculo fabricarVeiculo(Veiculo.Tipos tipo) {
        switch (tipo){
            case Carro:
                return new Carro();

            case Moto:
                return new Moto();

            case Barco:
                return new Barco();

            case Aviao:
                return new Aviao();

            default:
                System.err.println("Veiculo não identificado");
                return null;

        }
    }
}
