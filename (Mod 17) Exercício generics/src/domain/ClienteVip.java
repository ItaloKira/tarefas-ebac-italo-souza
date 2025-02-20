package domain;

import DAO.Cliente;
import DAO.Veiculo;

import java.util.Map;

public class ClienteVip extends Cliente {
    public ClienteVip(String nome, Byte idade, String email, String tell) {
        super(nome, idade, email, tell);
    }

    @Override
    public String objetivo() {
        return "Adiquirir dois veículos";
    }


}
