package DAO;

import com.sun.jdi.request.StepRequest;

public abstract class Cliente {

    private String nome;
    private Byte idade;
    private String email;
    private Long tell;
    private Short cod;

    public Cliente(String nome, Byte idade, String email, String tell) {
        this.nome = nome;
        this.idade = idade;

        while (!validarEmail(email)){
        validarEmail(email);
        if(validarEmail(email)){
            this.email = email;
        }else {
           this.email = null;
            }
        }
        while (validarTelefone(tell) == null) {
            validarTelefone(tell);
            if (validarTelefone(tell) != null) {
                long cell = validarTelefone(tell);
                this.tell = cell;
            }
        }
    }

    public abstract String objetivo();
    //public abstract double calcularDesconto();

    public Boolean validarEmail(String email){
        if(email.contains("@") && email.contains(".com")){
            return true;
        } else {
            System.err.println("Email inválido!");
            return false;
        }
    }
    public Long validarTelefone(String tell){
        tell = tell.replaceAll("[^\\d]" , "");

        if(tell.length() == 11){
            if(tell.charAt(2) == '9'){
                try {
                    long numero = Long.parseLong(tell);
                    return numero;
                } catch (NumberFormatException e){
                    System.err.println("Numero de telefone inválido");
                    return null;
                }
            } else {
                return null;
            }
        } else {
            return null;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Byte getIdade() {
        return idade;
    }

    public void setIdade(Byte idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTell() {
        return tell;
    }

    public void setTell(Long tell) {
        this.tell = tell;
    }

    public Short getCod() {
        return cod;
    }

    public void setCod(Short cod) {
        this.cod = cod;
    }

    @Override
    public String toString(){
        StringBuffer info = new StringBuffer();
        info.append("____________________________"  + "\n");
        info.append("          CLIENTE" +  "\n");
        info.append("____________________________" + "\n");
        info.append("Nome: " + nome + "\n");
        info.append("Idade: " + idade + "\n");
        info.append("Email: " + email + "\n");
        info.append("Telefone: " + tell  + "\n");
        info.append("Código: " + cod  + "\n");

        return info.toString();
    }
}
