/**
 * 
 */
package br.com.italosouza.dao;

import br.com.italosouza.dao.generic.IGenericDAO;
import br.com.italosouza.domain.Venda;
import br.com.italosouza.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
