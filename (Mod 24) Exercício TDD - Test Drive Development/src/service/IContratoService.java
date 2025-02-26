package service;

import domain.User;

public interface IContratoService {

     String salvar();

     User buscar(User user);

     User excluir(User user);

     User atualizar(User user);

}
