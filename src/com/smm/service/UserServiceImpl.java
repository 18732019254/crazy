package com.smm.service;

import com.smm.dao.UserMapper;
import com.smm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper mapper;
    @Override
    public int insert(User user) {
        int row=mapper.insert(user);
        mapper.insert(user);
        return row;
    }

    @Override
    public void delete(String xh) {
        mapper.delete(xh);
    }

    @Override
    public void update(User user) {
        mapper.update(user);
    }

    @Override
    public User selectOne(String xh) {
       User user=mapper.selectOne(xh);
       return user;
    }

    @Override
    public List<User> selectAll() {
        List<User> list=mapper.selectAll();
        return list;
    }
}
