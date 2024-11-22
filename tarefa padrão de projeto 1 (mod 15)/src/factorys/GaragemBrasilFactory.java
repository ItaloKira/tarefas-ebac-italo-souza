package factorys;

import Locations.Garagem;
import Locations.GaragemBrasil;
import domain.Veiculo;

public class GaragemBrasilFactory implements AbstractFactory{
    private Garagem garagem;

    public GaragemBrasilFactory(){
        garagem = new GaragemBrasil();
    }
    @Override
    public Veiculo realizarPedidoVeiculo(Veiculo.Tipos tipo) {
        return garagem.pedirVeiculo(tipo);
    }
}
