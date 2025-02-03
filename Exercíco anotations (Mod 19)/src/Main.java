import Anotation.Tabela;
import OBJ.Pessoa;

import javax.xml.transform.Source;

public class Main {
    public static void main(String[] args) {
    try {
        Class<?> classe = Class.forName("Pessoa");

        if(classe.isAnnotationPresent(Tabela.class));

        Tabela tabela = classe.getAnnotation(Tabela.class);

        System.out.println("Valor da anotação: " + tabela.value());
    }
    catch (ClassNotFoundException e){
        e.printStackTrace();
    }

    }
}