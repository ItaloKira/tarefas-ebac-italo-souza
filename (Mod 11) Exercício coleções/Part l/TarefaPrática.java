import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TarefaPrática {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<String> listaDeNomes = new ArrayList<>();

        System.out.println("Digite os nomes dos participantes separados por uma vírgula! ");
        String nomeDigitado = in.next();

        for(String nome : nomeDigitado.split(",")){
            listaDeNomes.add(nome);
        }
        Collections.sort(listaDeNomes);
        System.out.println(listaDeNomes);

    }
}
