package br.com.italoSouza;
import dao.ContratoDAO;
import dao.IContratoDAO;
import domain.User;
import mock.ContratoDAOMock;
import org.junit.Assert;
import org.junit.Test;
import service.ContratoService;
import service.IContratoService;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        IContratoDAO dao = new ContratoDAOMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ErroBancoDeDados(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();

        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest(){
        IContratoDAO dao = new ContratoDAO();
        User user = new User();

        dao.buscar(user);
        IContratoService service = new ContratoService(dao);

        Assert.assertEquals(user, dao.buscar(user));
    }

    @Test
    public void excluirTest(){

        IContratoDAO dao = new ContratoDAO();
        User user = new User();
        IContratoService service = new ContratoService(dao);

        dao.excluir(user);
        Assert.assertEquals(user, dao.excluir(user));
    }

    @Test
    public void atualizar(){
        IContratoDAO dao = new ContratoDAO();
        IContratoService service = new ContratoService(dao);

        User user = new User();
        User userTest = service.atualizar(user);

        Assert.assertEquals(user, userTest);
    }
}
