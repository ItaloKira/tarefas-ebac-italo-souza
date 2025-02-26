package mock;

import dao.IContratoDAO;
import domain.User;

public class ContratoDAOMock implements IContratoDAO {
    @Override
    public void salvar() {

    }

    @Override
    public User buscar(User user) {
        return null;
    }

    @Override
    public User excluir(User user) {
        return null;
    }

    @Override
    public User atualizar(User user) {
        return null;
    }
}
