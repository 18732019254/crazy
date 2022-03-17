package com.smm.dao;

import com.smm.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserMapper {
    public int insert(User user);
    public void delete(String xh);
    public void update(User user);
    public User selectOne(String xh);
    public List<User> selectAll();
}
