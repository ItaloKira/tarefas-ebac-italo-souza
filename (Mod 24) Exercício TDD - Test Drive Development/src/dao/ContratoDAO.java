package dao;

import domain.User;

public class ContratoDAO implements IContratoDAO{
    @Override
    public void salvar() {
        throw new UnsupportedOperationException("não funciona com o banco de dados");
    }

    @Override
    public User buscar(User user) {
        return user;
    }

    @Override
    public User excluir(User user) {
        return user;
    }

    @Override
    public User atualizar(User user) {
        return user;
    }

}
