import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Usuários{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

        boolean controle;
        do{
            controle = true;
            System.out.println("Digite seu nome e gênero(separe-os por vírgula)");
            String resposta = scanner.nextLine();
            String[] separação = resposta.split(",");

            String nome = separação[0].trim();
            String genero = separação[1].trim();

            List<String> listaMasculina = new ArrayList<>();
            List<String> listaFeminina = new ArrayList<>();

            if(genero.contains("M")){
                listaMasculina.add(nome);
            } else if(genero.contains("F")){
                listaFeminina.add(nome);
            } else{
                System.err.println("Delimitador não identificado, ou informações inválidas.");
            }
            Collections.sort(listaFeminina);
            Collections.sort(listaMasculina);

            System.out.println("Deseja adicionar mais alguém?");
            String and = scanner.nextLine();
            if(and.contains("Sim")){
                controle = true;
            } else if(and.contains("N")){
                System.out.print("Então isso é tudo ^^");
                controle = false;
                break;
            }
            System.out.println(listaFeminina);
            System.out.println(listaMasculina);
        }while(controle);
        scanner.close();
    }
}