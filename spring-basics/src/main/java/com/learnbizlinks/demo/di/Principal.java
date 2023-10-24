package com.learnbizlinks.demo.di;

public class Principal {
    public static void main(String[] args) {
        UserDao userDao = new UserDao(Application.INSTANCE.dataSource());
        User user1 = userDao.findById(123);
        User user2 = userDao.findByFirstName("Jorge");
    }
}
