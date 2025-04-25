package br.com.italosouza.dao;

import br.com.italosouza.domain.User;

import java.util.List;

public interface IUserDAO {

    public Integer register(User user) throws Exception;

    public Integer update(User user) throws Exception;

    public User search(String code) throws Exception;

    public List<User> searchAll() throws Exception;

    public Integer delete(User user) throws Exception;
}
