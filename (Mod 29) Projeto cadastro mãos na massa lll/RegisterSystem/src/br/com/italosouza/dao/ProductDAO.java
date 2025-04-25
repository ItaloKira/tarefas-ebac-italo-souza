package br.com.italosouza.dao;

import br.com.italosouza.domain.Product;
import org.jetbrains.annotations.NotNull;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/*
* @author Ítalo Souza
* */

public class ProductDAO implements IProductDAO{
    @Override
    public Integer register(Product product) throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLInsert();
            stm = connection.prepareStatement(SQL);
            addParameterInsert(stm, product);
            return stm.executeUpdate();
        } catch (SQLException e){
            throw e;

        } finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer update(Product product) throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLUpdate();
            stm = connection.prepareStatement(SQL);
            addParameterUpdate(stm, product);
            return stm.executeUpdate();

        } catch (SQLException e){
            throw e;
        } finally {
            closeConnection(connection,stm, null);
        }
    }


    @Override
    public Product search(String code) throws Exception {

        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Product product = null;

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLSearch();
            stm = connection.prepareStatement(SQL);
            addParameterSearch(stm, code);
            rs = stm.executeQuery();
            while (rs.next()){
                product = new Product();
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                String cod = rs.getString("code");

                product.setId(id);
                product.setName(name);
                product.setCode(cod);
            }

        }catch (SQLException e){
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }

        return product;
    }

    @Override
    public List<Product> searchAll() throws Exception {
        List<Product> list = new ArrayList<>();

        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Product product = null;

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLSelect();
            stm = connection.prepareStatement(SQL);
           rs = stm.executeQuery();

           while (rs.next()){
               product = new Product();

               Long id = rs.getLong("id");
               String name = rs.getString("name");
               String code = rs.getString("code");

               product.setId(id);
               product.setName(name);
               product.setCode(code);

               list.add(product);
           }
        } catch (SQLException e){
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }
        return list;
    }

    @Override
    public Integer delete(Product product) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection();
            String SQL = getSQLDelete();
            stm = connection.prepareStatement(SQL);
            addParameterDelete(stm, product);
            return stm.executeUpdate();
        } catch (SQLException e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private void addParameterDelete(PreparedStatement stm, Product product) throws SQLException {
        stm.setLong(1, product.getId());
    }

    @NotNull
    private String getSQLDelete() {
        StringBuilder data = new StringBuilder();
        data.append("delete from tb_products_2 ");
        data.append("where id = ?");

        return data.toString();
    }

    private void addParameterUpdate(PreparedStatement stm, Product product) throws SQLException {
        stm.setString(1, product.getName());
        stm.setString(2, product.getCode());
        stm.setLong(3, product.getId());
    }

    @NotNull
    private String getSQLUpdate() {
        StringBuilder data = new StringBuilder();
        data.append("update tb_products_2 set ");
        data.append("set name = ?, code = ? ");
        data.append("where id = ?");

        return data.toString();
    }

    private void addParameterInsert(PreparedStatement stm, Product product) throws SQLException {
        stm.setString(1, product.getName());
        stm.setString(2, product.getCode());
    }

    @NotNull
    private String getSQLInsert() {
        StringBuilder data = new StringBuilder();
        data.append("insert into tb_products_2 (id, name, code) ");
        data.append("values (nextval('sq_id'), ?, ?)");

        return data.toString();
    }

    private void addParameterSearch(PreparedStatement stm, String code) throws SQLException {
        stm.setString(1, code);
    }

    @NotNull
    private String getSQLSearch() {
        StringBuilder data = new StringBuilder();
        data.append("select * from tb_products_2 ");
        data.append("where code = ?");

        return data.toString();
    }

    private String getSQLSelect() {
        StringBuilder data = new StringBuilder();
        data.append("select * from tb_products_2");

        return data.toString();
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) throws SQLException {
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
        if(stm != null && !stm.isClosed()){
            stm.close();
        }
        if(rs != null && !rs.isClosed()){
            rs.close();
        }
    }
}