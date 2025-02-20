package domain;

import DAO.Veiculo;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, String cor, short ano, boolean novo, short quilometragem) {
        super(marca, modelo, cor, ano, novo, quilometragem);
    }
}
