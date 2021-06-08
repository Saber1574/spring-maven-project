package com.intoch.user.service;

import com.intoch.user.domain.User;

import java.util.List;

public interface UserService {
    public void add(User user);

    public void modify(User user);

    public void deleteOne(Integer id);

    public User quertOne(Integer id);

    public List<User> listAll();


}
