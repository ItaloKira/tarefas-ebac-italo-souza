import DAO.Cliente;
import DAO.Veiculo;
import domain.Carro;
import domain.ClienteVip;

import java.util.HashMap;
import java.util.Map;


public class Main{

    //método auxiliar com parâmetros genericois pra adicionar os objetos ao map.
    public static <A extends Cliente, K extends Veiculo> void Adicionar(Map<A, K> map, A cliente ,K veiculo){
        map.put(cliente, veiculo);
    }

    public static void main(String[] args) {

        //lista que recebe os tipos genéricos que estendes classes específicas.
        Map<Cliente, Veiculo> garagem = new HashMap<>();

        // Objetos do tipo Carro
        Veiculo carro1 = new Carro("lamborguini", "Aventador SVJ", "Roxo", (short) 2019, false, (short) 20.000f);
        Veiculo carro2 = new Carro("maclarem", "P1", "branco", (short) 2022, false, (short) 25.000f);
        Veiculo carro3 = new Carro("ferrari", "la ferrari", "vermelho", (short) 2024, true, (short) 0f);
E
        // Objetos do tipo Cliente
        Cliente patron1 = new ClienteVip("Ítalo Souza", (byte)21, "kirananno12@gmail.com", "(69) 9 9999-9999");
        Cliente patron2 = new ClienteVip("Jorge Henrrique Lacerda", (byte) 18, "jorginhodastorres21@gmail.com", "(99) 9 8888-8888");
        Cliente patron3 = new ClienteVip("Kaylany Raimundo", (byte) 19, "nanycalabresa1212@gmail.com", "(99)9 7777-7777");


        Adicionar(garagem, patron1, carro1);
        Adicionar(garagem, patron2, carro3);
        Adicionar(garagem, patron3, carro2);

        // preenchendo os parâmetros na hora da adição
        Adicionar(garagem,
                new ClienteVip("Arthur Morgan", (byte) 25, "cavalobranco332@gmail.com", "(69) 9 8181-9898"),
                new Carro("Lamborghini", "Aventador Revuelto", "branco", (short) 2024, true, (short) 0));

        for(Map.Entry<Cliente, Veiculo> entrada : garagem.entrySet()){
            System.out.println("Cliente: " + entrada.getKey() + "Veículo: " + entrada.getValue());
        }


    }
}