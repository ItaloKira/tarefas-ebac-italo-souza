import domain.User;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Set<User> usuariosCadastrados = new LinkedHashSet<>(User.listUsers());

        Set<User> UsersFemales = usuariosCadastrados.stream()
                .filter(userFemale -> userFemale.getGender().equalsIgnoreCase("feminino"))

                .collect(Collectors.toSet());

        UsersFemales.forEach(user -> System.out.println(user.toString()));
    }
}