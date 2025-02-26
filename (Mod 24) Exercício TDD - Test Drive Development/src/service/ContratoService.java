package service;

import dao.IContratoDAO;
import domain.User;

public class ContratoService implements IContratoService{

    private IContratoDAO contratoDAO;

    public ContratoService(IContratoDAO dao) {
        this.contratoDAO = dao;
    }

    @Override
    public String salvar() {
        contratoDAO.salvar();
        return "Sucesso" ;
    }

    @Override
    public User buscar(User user) {

        return contratoDAO.buscar(user);
    }

    @Override
    public User excluir(User user) {
        return contratoDAO.excluir(user);
    }

    @Override
    public User atualizar(User user) {

        return contratoDAO.atualizar(user);
    }

}
