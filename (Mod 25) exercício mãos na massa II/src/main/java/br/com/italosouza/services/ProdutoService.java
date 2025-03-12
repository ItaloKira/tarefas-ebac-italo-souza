/**
 * 
 */
package br.com.italosouza.services;

import br.com.italosouza.dao.IProdutoDAO;
import br.com.italosouza.domain.Produto;
import br.com.italosouza.services.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
	}
}
