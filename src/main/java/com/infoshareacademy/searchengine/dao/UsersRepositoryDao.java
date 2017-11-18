package com.infoshareacademy.searchengine.dao;

import com.infoshareacademy.searchengine.domain.User;

import javax.ejb.Local;
import java.util.List;

@Local
public interface UsersRepositoryDao {

    public void addUser(User user);
    public User getUserById(int id);
    public User getUserByLogin(String login);
    public List<User> getUsersList();
}
