package dao;

import domain.User;

public interface IContratoDAO {

    //TODO buscar, excluir, atualizar

    void salvar();

    public User buscar(User user);

    public User excluir(User user);

    public User atualizar(User user);
}
