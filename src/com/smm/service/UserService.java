package com.smm.service;

import com.smm.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public int insert(User user);
    public void delete(String xh);
    public void update(User user);
    public User selectOne(String xh);
    public List<User> selectAll();
}
