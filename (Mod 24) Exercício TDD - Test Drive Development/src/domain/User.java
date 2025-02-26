package domain;

import java.util.HashMap;
import java.util.Map;

public class User {
    private static short id;
    private String nome;
    private String cpf;

    public User(short id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public User() {
    }

    public static short getId() {
        return id;
    }

    public void setId(short id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "User {" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    public static class BancoDeDados{
        private User user;

        public static void listaUsuários(){
            Map<Short, User> UsuariosCadastrados = new HashMap<>();
        }
    }

}

