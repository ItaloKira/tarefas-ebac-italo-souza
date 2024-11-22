import domain.Veiculo;
import factorys.AbstractFactory;
import factorys.GaragemBrasilFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Concessionaria {
    public static void main(String[] args) {
        AbstractFactory factory = new GaragemBrasilFactory();
        Veiculo carro =  factory.realizarPedidoVeiculo(Veiculo.Tipos.Carro);
        System.out.println(carro);
    }
}