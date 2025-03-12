/**
 * 
 */
package br.com.italosouza;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.italosouza.dao.ClienteDaoMock;
import br.com.italosouza.dao.IClienteDAO;
import br.com.italosouza.domain.Cliente;
import br.com.italosouza.exceptions.TipoChaveNaoEncontradaException;
import br.com.italosouza.services.ClienteService;
import br.com.italosouza.services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		cliente = new Cliente();
		cliente.setCpf(65894321582L);
		cliente.setNome("Ítalo");
		cliente.setCidade("PVH");
		cliente.setEnd("castanheira");
		cliente.setEstado("RO");
		cliente.setNumero(20);
		cliente.setTel(69999999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente() throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.cadastrar(cliente);
		
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Ítalo Souza");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Ítalo Souza", cliente.getNome());
	}
}
