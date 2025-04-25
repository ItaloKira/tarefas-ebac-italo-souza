package br.com.italosouza.dao;

import br.com.italosouza.domain.User;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserDAO implements IUserDAO{

    @Override
    public Integer register(User user) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            addParameterInsert(stm, user);
            return stm.executeUpdate();
        } catch (Exception e){
            throw e;
        }
        finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer update(User user) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = getsqlUpdate();
            stm = connection.prepareStatement(sql);
            addParameterUpdate(stm, user);
            return stm.executeUpdate();
        } catch (SQLException e) {
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public User search(String code) throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        User user = null;

        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSQLSearch();
            stm = connection.prepareStatement(sql);
            addparameterSelect(stm, code);
            rs = stm.executeQuery();

            if(rs.next()){
                 user = new User();
                 Long id = rs.getLong("id");
                 String name = rs.getString("name");
                 String cd = rs.getString("code");

                 user.setId(id);
                 user.setName(name);
                 user.setCode(cd);
            }
        } catch (SQLException e){
        throw e;
        }
        finally {
            closeConnection(connection, stm, rs);
        }

        return user;
    }

    @Override
    public List<User> searchAll() throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;
        User user = null;
        ResultSet rs = null;
        List<User> users = new ArrayList<>();

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLSelectAll();
            stm = connection.prepareStatement(SQL);
            rs = stm.executeQuery();

            while (rs.next()) {
                user = new User();

                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String cd = rs.getString("code");

                user.setId(id);
                user.setName(name);
                user.setCode(cd);

                users.add(user);
            }

        } catch (SQLException e) {
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return users;
    }

    @Override
    public Integer delete(User user) throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSQLDelete();
            stm = connection.prepareStatement(sql);
            addParameterDelete(stm, user);
            return stm.executeUpdate();
        } catch (SQLException e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @NotNull
    private String getSQLSelectAll() {
        StringBuilder data = new StringBuilder();
        data.append("SELECT * FROM tb_user_2");

        return data.toString();
    }

    private void addParameterDelete(PreparedStatement stm, User user) throws SQLException {
        stm.setString(1, user.getCode());
    }

    @NotNull
    private String getSQLDelete() {
        StringBuilder data = new StringBuilder();
        data.append("DELETE FROM tb_user_2 ");
        data.append("WHERE code = ?");
        return data.toString();
    }

    @NotNull
    private String getSqlInsert(){
        StringBuilder data = new StringBuilder();
        data.append("insert into tb_user_2 (id, name, code) ");
        data.append("values (nextval('SQ_USER_2'), ?, ?)");

        return data.toString();
    }

    private void addParameterInsert(PreparedStatement stm, User user) throws SQLException{
        stm.setString(1, user.getName());
        stm.setString(2, user.getCode());
    }

    @NotNull
    private String getsqlUpdate(){
        StringBuilder data = new StringBuilder();
        data.append("UPDATE tb_user_2 ");
        data.append("SET name = ?, code = ? ");
        data.append("WHERE id = ?");

        return data.toString();
    }
    private void addParameterUpdate(PreparedStatement stm, User user) throws SQLException{
    stm.setString(1, user.getName());
    stm.setString(2, user.getCode());
    stm.setLong(3, user.getId());
    }

    @NotNull
    private String getSQLSearch() {
    StringBuilder data = new StringBuilder();
    data.append("SELECT * FROM tb_user_2 ");
    data.append("WHERE code = ?");
    return data.toString();
    }

    private void addparameterSelect(PreparedStatement stm, String code) throws SQLException {
        stm.setString(1, code);
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }

            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }

        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
