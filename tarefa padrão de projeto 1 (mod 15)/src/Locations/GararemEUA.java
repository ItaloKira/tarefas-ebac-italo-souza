package Locations;

import domain.*;

public class GararemEUA extends Garagem {
    @Override
    Veiculo fabricarVeiculo(Veiculo.Tipos tipo) {

if(tipo.equals(Veiculo.Tipos.Carro)){
    return new Carro();
} else if (tipo.equals(Veiculo.Tipos.Moto)){
    return new Moto();
} else if (tipo.equals(Veiculo.Tipos.Barco)) {
    return new Barco();
} else if(tipo.equals(Veiculo.Tipos.Aviao)){
    return new Aviao();
} else{
    return null;
}

    }
}
