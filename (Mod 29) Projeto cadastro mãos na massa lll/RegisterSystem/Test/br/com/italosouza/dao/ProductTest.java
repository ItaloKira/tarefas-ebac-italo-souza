package br.com.italosouza.dao;

import br.com.italosouza.domain.Product;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProductTest {
     ProductDAO dao;
     Product product;

    @Test
    public void registertest() throws Exception{
        dao = new ProductDAO();

        product = new Product();
        product.setName("Processador");
        product.setCode("2020");
        Integer countAdd = dao.register(product);
        Assert.assertTrue(countAdd == 1);
    }

    @Test
    public void SearchTest() throws Exception{
        dao = new ProductDAO();

        product = new Product();
        product.setName("Placa Mãe");
        product.setCode("2023");

        Integer countAdd = dao.register(product);
        Assert.assertTrue(countAdd == 1);

        Product productDB = dao.search(product.getCode());
        Assert.assertNotNull(productDB);
        Assert.assertEquals(productDB.getName(), product.getName());
        Assert.assertEquals(productDB.getCode(), product.getCode());

    }

    @Test
    public void DeleteTest() throws Exception{
    dao = new ProductDAO();

    product = new Product();
    product.setName("Memória Ram");
    product.setCode("2022");

    Integer countAdd = dao.register(product);
    Assert.assertTrue(countAdd == 1);

    Product productDB = dao.search(product.getCode());
    Assert.assertNotNull(productDB);

    Integer countDell = dao.delete(productDB);
    Assert.assertTrue(countDell == 1);

    }

    @Test
    public void SearchAll() throws Exception{
    dao = new ProductDAO();

    product = new Product();
    product.setName("Monitor 4K");
    product.setCode("4000");
    Integer countAdd = dao.register(product);
    Assert.assertTrue(countAdd == 1);

    Product product1 = new Product();
    product1.setName("Cooler");
    product1.setCode("2400");
    Integer countadd2 = dao.register(product1);
    Assert.assertTrue(countadd2 == 1);

    List<Product> listaProd = dao.searchAll();
    Assert.assertTrue(listaProd.size() == 2);

    }

    @Test
    public void UpdateTest() throws Exception {
        dao = new ProductDAO();

        product = new Product();
        product.setName("Placa de Vídeo");
        product.setCode("2025");
        Integer couAdd = dao.register(product);
        Assert.assertTrue(couAdd == 1);

        Product productDB = dao.search(product.getCode());
        Assert.assertNotNull(productDB);
        Assert.assertEquals(productDB.getName(), product.getName());
        Assert.assertEquals(productDB.getCode(), product.getCode());

        productDB.setName("Processador");
        productDB.setCode("2026");
        Integer countupd = dao.update(productDB);
        Assert.assertTrue(countupd == 1);

        Product productDB1 = dao.search(productDB.getCode());
        Assert.assertNotNull(productDB1);

        Product productDB2 = dao.search(productDB.getCode());
        Assert.assertNotNull(productDB2);
        Assert.assertEquals(productDB.getId(), productDB2.getId());
        Assert.assertEquals(productDB.getName(), productDB2.getName());
        Assert.assertEquals(productDB.getCode(), productDB2.getCode());

        List<Product> lista = dao.searchAll();
        for(Product pdt : lista){
            dao.delete(pdt);
        }
    }
}