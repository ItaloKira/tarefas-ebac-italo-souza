package OBJ;

import Anotation.Tabela;


public class Pessoa {

    private String nome;
    private byte idade;

    @Tabela(value = "Exemplo de Anotation")
    public Pessoa() {
    }

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }
}
