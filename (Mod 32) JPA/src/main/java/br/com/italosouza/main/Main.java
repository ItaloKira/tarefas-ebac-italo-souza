package br.com.italosouza.main;

import br.com.italosouza.domain.Products;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class Main {

    public static void main(String[] args){

        Products product1 = new Products();
        product1.setName("MotherBoard");
        product1.setQty(100);

        Products product2 = new Products();
        product2.setName("Memory");
        product2.setQty(120);

        Products product3 = new Products();
        product3.setName("Processor");
        product3.setQty(80);

        EntityManagerFactory EMF = Persistence.createEntityManagerFactory("exemplo");
        EntityManager EM = EMF.createEntityManager();

        EM.getTransaction().begin();

        EM.persist(product1);
        EM.persist(product2);
        EM.persist(product3);

        EM.getTransaction().commit();

        System.out.println("finish");
    }
}
