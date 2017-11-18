package com.infoshareacademy.searchengine;

import com.infoshareacademy.searchengine.dao.UsersRepositoryDao;
import com.infoshareacademy.searchengine.dao.UsersRepositoryDaoBean;
import com.infoshareacademy.searchengine.domain.User;


public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello world");

        UsersRepositoryDao usersRepositoryDao = new UsersRepositoryDaoBean();
//        System.out.println(usersRepositoryDao.getUserById(1).getName());

        for (User user : usersRepositoryDao.getUsersList()) {
            System.out.println(user.getLogin() + ": " +
                    user.getName() + " " +
                    user.getSurname() + " " +
                    user.getAge());
        }

        System.out.println();

        System.out.println(usersRepositoryDao.getUserByLogin("ano").getName());
        System.out.println(usersRepositoryDao.getUserById(2).getName());
//        System.out.println(usersRepositoryDao.addUser(););

        User myUser = new User();
        myUser.setName("Kuba");
        myUser.setSurname("Jarzembek");
        myUser.setAge(24);
        myUser.setLogin("bomba");
        myUser.setId(4);

        System.out.println();
        usersRepositoryDao.addUser(myUser);

        for (User user : usersRepositoryDao.getUsersList()) {
            System.out.println(user.getLogin() + ": " +
                    user.getName() + " " +
                    user.getSurname() + " " +
                    user.getAge());
        }
    }
}
