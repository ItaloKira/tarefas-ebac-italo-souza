package factorys;

import Locations.Garagem;
import Locations.GaragemFranca;
import domain.Veiculo;

public class GaragemFrancaFactory implements AbstractFactory{

    private Garagem garagem;

    public GaragemFrancaFactory(){
        garagem = new GaragemFranca();
    }

    @Override
    public Veiculo realizarPedidoVeiculo(Veiculo.Tipos tipo) {
        return garagem.pedirVeiculo(tipo);
    }
}
