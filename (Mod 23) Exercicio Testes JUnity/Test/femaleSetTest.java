import domain.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.AbstractSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class femaleSetTest {
    @Test
    public void femaleSetTest(){
    //criação da coleção que contem todos os usuários
    Set<User> UsersList = new LinkedHashSet<>(User.listUsers());
    
    // filtragem de usuários do gênero feminino para uma nova lista!
    Set<User> femaleList = UsersList.stream().filter(female -> female.getGender().equalsIgnoreCase("feminino"))
            .collect(Collectors.toSet());

    //teste para verificar se todos os usuários são do gênero feminino!
        femaleList.forEach(female -> Assert.assertEquals(female.getGender(), "feminino"));
    }
}