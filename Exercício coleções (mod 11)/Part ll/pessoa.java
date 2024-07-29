import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class pessoa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        boolean controle;
        do{
        controle = true;

        System.out.println("Digite seu nome e seu gênero (Separe-os por vírgula) ");
        String nomeEGênero = scanner.nextLine();

        String[] separação = nomeEGênero.split(",");

        String nome = separação[0];
        String genero = separação[1];

        List<String> listaMasculina = new ArrayList<>();
        List<String> listaFeminina = new ArrayList<>();

        if(genero.toLowerCase().contains("M")){
            listaMasculina.add(genero);
        }
        if(genero.toLowerCase().contains("F")){
            listaFeminina.add(genero);
        }
        Collection.sort(listaFeminina);
        Collection.sort(listaMasculina);

        System.out.println("Nome: " + nome + " - " + "Genero: " + genero);

        System.out.println("Deseja adicionar mais alguma coisa?");
        String respostas = scanner.nextLine();
        if(respostas.toLowerCase().contains("sim")){
            controle = true;
        } else{
            controle = false;
            System.out.println("Então seu nome é: " + nome + " e seu gênero é: " + genero + "!");
            System.err.println("Isso é tudo! ^^");
        }
    } while(controle);
    
    System.out.println(listaMasculina, listaFeminina);
scanner.close();
    }
}