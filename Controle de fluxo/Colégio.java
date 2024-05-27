import java.util.Scanner;
public class Colégio{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        int bimestre1;
        int bimestre2;
        int bimestre3;
        int bimestre4;
        
        System.out.println("Qual foi a nota do 1° Bimestre? ");
        bimestre1 = scanner.nextInt();

        System.out.println("Qual foi a nota do 2° Bimestre? ");
        bimestre2 = scanner.nextInt();

        System.out.println("Qual foi a nota do 3° Bimestre? ");
        bimestre3 = scanner.nextInt();

        System.out.println("Qual foi a nota do 4° Bimestre? ");
        bimestre4 = scanner.nextInt();

        int notaMédia = bimestre1 + bimestre2 + bimestre3 + bimestre4 / 4;

        System.out.println("A média das notas dos alunos é: " + notaMédia);

        if(notaMédia >= 7) {
            System.out.println("Parabéns!!! Este aluno está aprovado por média.");
        } else if(notaMédia >= 5){
            System.err.println("Este aluno não foi aprovado, portanto está de recuperação.");
        } else if(notaMédia <= 5) {
            System.err.println("Este aluno está reprovado!");
        }
        scanner.close();
    }

}