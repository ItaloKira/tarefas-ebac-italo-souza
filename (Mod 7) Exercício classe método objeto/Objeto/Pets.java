public class Pets {
    
//foram criadas quatro propriedades.

    private String nome;
    private int idade;
    private int peso;
    private String raça;

    public String toString() {
        return "nome: " + nome + ", idade: " + idade + ", peso: " + peso + ", raça: " + raça;
    }
// 6 métodos (dois para cada propriedade)

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
public int getIdade() {
    return idade;
}
public void setIdade(int idade) {
    this.idade = idade;
}

public int getPeso() {
    return peso;
}
public void setPeso(int peso) {
    this.peso = peso;
}
public void cadastrarNome(String nome) {
    setNome(nome);
}
public String getRaça() {
    return raça;
}
public void setRaça(String raça) {
    this.raça = raça;
}

}
