package domain;

import javax.swing.*;
import java.awt.*;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

public class User {
    private short id;
    private String name;
    private byte age;
    private String gender;
    private boolean activeUser;

    public User(String name, byte age, String gender, boolean activeUser) {
        Random idGeneration = new Random();
        short min = 10000;
        short max = 32767;

        this.id = (short) (idGeneration.nextInt((max - min + 1)) + min);
        this.name = name;
        this.age = age;
        this.gender = gender.toLowerCase();
        this.activeUser = activeUser;
    }

    public short getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isActiveUser() {
        return activeUser;
    }

    public void setActiveUser(boolean activeUser) {
        this.activeUser = activeUser;
    }

    public String toString(){
        StringBuffer dados = new StringBuffer();

        dados.append("-------------------------------------" + "\n");
        dados.append("              USER ID: " + id + "\n");
        dados.append("-------------------------------------" + "\n");
        dados.append("Name: " + name + "\n");
        dados.append("Age: " + age + "\n");
        dados.append("Gender: " +gender + "\n");

        if(activeUser){
            dados.append("Activity status: Active" + "\n");
        }
        else {
            dados.append("Activity status: Inactive" + "\n");
        }
        JOptionPane.showMessageDialog(null, dados.toString());
        return dados.toString();
    }

    public static Set<User> listUsers(){
        Set<User> Users = new LinkedHashSet<>();

        Users.add(new User("Carlos Ortiz", (byte) 32,"Masculino", true ));
        Users.add(new User("Marina Senna", (byte) 22, "Feminino", false));
        Users.add(new User("Eduardo Martins", (byte) 27, "Masculino", false));
        Users.add(new User("Jorge Lacerda", (byte) 34, "Masculino", true));
        Users.add(new User("Betina Torres", (byte) 29, "Feminino", true));
        Users.add(new User("Maria Eduarda", (byte) 21, "Feminino", true));
        Users.add(new User("Krauser Diniz", (byte) 41, "Masculino",false));
        Users.add(new User("Clara Diaz", (byte) 52, "Feminino",true));

        return Users;
    }
}
