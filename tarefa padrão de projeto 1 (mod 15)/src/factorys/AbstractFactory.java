package factorys;

import domain.Veiculo;

public interface AbstractFactory {
    public Veiculo realizarPedidoVeiculo(Veiculo.Tipos tipo);
}
