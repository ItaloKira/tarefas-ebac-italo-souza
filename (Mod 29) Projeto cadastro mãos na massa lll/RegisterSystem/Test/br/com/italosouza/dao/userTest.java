package br.com.italosouza.dao;

import br.com.italosouza.domain.User;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLException;
import java.util.List;

public class userTest {

    UserDAO dao;
    User user;

    @Test
    public void registerTest() throws Exception{
         dao = new UserDAO();
         user = new User();

        user.setName("Ítalo Kira");
        user.setCode("2121");

        Integer count = dao.register(user);

        Assert.assertEquals(1, (int) count);

        User userBD = dao.search("2121");
        Assert.assertNotNull(userBD);
        Assert.assertEquals(userBD.getName(), user.getName());
        Assert.assertEquals(userBD.getCode(), user.getCode());

        Integer countdel = dao.delete(userBD);
        Assert.assertTrue(countdel == 1);

    }

    @Test
    public void SearcTest() throws Exception{
        dao = new UserDAO();
        user = new User();

        user.setName("Joel Miller");
        user.setCode("2020");
        Integer count = dao.register(user);
        Assert.assertTrue(count == 1);

        User userDB = dao.search(user.getCode());
        Assert.assertNotNull(userDB);
        Assert.assertEquals(userDB.getName(), user.getName());
        Assert.assertEquals(userDB.getCode(), user.getCode());

        Integer countDel = dao.delete(user);
        Assert.assertTrue(countDel == 1);


    }

    @Test
    public void deleteTest() throws Exception {

        dao = new UserDAO();
        user = new User();

        user.setName("Jorge Henrrique");
        user.setCode("2021");

        Integer countReg = dao.register(user);
        Assert.assertTrue(countReg == 1);

        User userDB = dao.search(user.getCode());
        Assert.assertEquals(user.getName(), userDB.getName());
        Assert.assertEquals(user.getCode(), userDB.getCode());

        Integer countDel = dao.delete(userDB);
        Assert.assertTrue(countDel == 1);

    }
    @Test
    public void searchAllTest() throws Exception {
         dao = new UserDAO();

         user = new User();
         user.setName("Micael Schumacher");
         user.setCode("2005");
        Integer countAdd1 = dao.register(user);
        Assert.assertTrue(countAdd1 == 1);

         User user1 = new User();
         user1.setName("Sebastian Vettel");
         user1.setCode("2013");
         Integer countAdd2 = dao.register(user1);
         Assert.assertTrue(countAdd2 == 1);

        List<User> list = dao.searchAll();
        Assert.assertNotNull(list);
        Assert.assertEquals(2, list.size());

        int countDel = 0;
        for(User use : list){
            dao.delete(use);
            countDel++;
        }
        Assert.assertEquals(list.size(), countDel);

        list = dao.searchAll();
        Assert.assertEquals(list.size(), 0);

    }
    @Test
    public void updateTest() throws Exception{
        dao = new UserDAO();

        user = new User();
        user.setName("Alain Prost");
        user.setCode("1989");
        Integer countAdd = dao.register(user);
        Assert.assertTrue(countAdd == 1);

        User userDB = dao.search(user.getCode());
        Assert.assertNotNull(userDB);
        Assert.assertEquals(user.getName(), userDB.getName());
        Assert.assertEquals(user.getCode(), userDB.getCode());

        userDB.setName("Ayrton Senna");
        userDB.setCode("1991");
        Integer counUpd = dao.update(userDB);
        Assert.assertTrue(counUpd == 1);

        User userDB1 = dao.search(userDB.getCode());
        Assert.assertNotNull(userDB1);

        User userDB2 = dao.search(userDB1.getCode());
        Assert.assertNotNull(userDB2);
        Assert.assertEquals(userDB.getId(), userDB2.getId());
        Assert.assertEquals(userDB.getName(), userDB2.getName());
        Assert.assertEquals(userDB.getCode(), userDB2.getCode());

        List<User> list = dao.searchAll();
        for(User use : list){
            dao.delete(use);
        }
    }
}