package br.com.italosouza.dao;

import br.com.italosouza.domain.Product;
import br.com.italosouza.domain.User;

import java.util.List;

public interface IProductDAO {

    public Integer register(Product product) throws Exception;

    public Integer update(Product product) throws Exception;

    public Product search (String code) throws Exception;

    public List<Product> searchAll() throws Exception;

    public Integer delete(Product product) throws Exception;
}
