package com.intoch.user.service;

import com.intoch.user.dao.UserDao;
import com.intoch.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void modify(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteOne(Integer id) {
        userDao.deleteById(id);
    }

    @Override
    public User quertOne(Integer id) {
        User user=userDao.findById(id).get();
        return user;
    }

    @Override
    public List<User> listAll() {
        List<User> userList=userDao.findAll();
        return userList;
    }
}
