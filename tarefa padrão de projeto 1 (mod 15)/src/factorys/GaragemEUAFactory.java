package factorys;

import Locations.Garagem;
import Locations.GararemEUA;
import domain.Veiculo;

public class GaragemEUAFactory implements AbstractFactory{
    private Garagem garagem;

    public GaragemEUAFactory(){
        garagem = new GararemEUA();
    }

    @Override
    public Veiculo realizarPedidoVeiculo(Veiculo.Tipos tipo) {
        return garagem.pedirVeiculo(tipo);
    }
}
