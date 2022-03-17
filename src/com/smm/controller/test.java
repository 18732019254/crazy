package com.smm.controller;

import com.smm.dao.UserMapper;
import com.smm.entity.User;
import com.smm.service.UserService;
import com.smm.service.UserServiceImpl;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
@Controller
@RequestMapping("con")
public class test {

    @Autowired
    private UserService userService;

    @RequestMapping("ab")
    public ModelAndView insert(User user){
        userService.insert(user);
        List<User> list=userService.selectAll();
        ModelAndView modelAndView=new ModelAndView("qw","list",list);
      return modelAndView;
    }
    @RequestMapping("ac")
    public ModelAndView delete(String xh){
        userService.delete(xh);
        List<User> list=userService.selectAll();
        ModelAndView modelAndView=new ModelAndView("qw","list",list);
        return modelAndView;
    }
    @RequestMapping("ad")
    public ModelAndView update(User user){
        userService.update(user);
        List<User> list=userService.selectAll();
        ModelAndView modelAndView=new ModelAndView("qw","list",list);
        return modelAndView;

    }
    @RequestMapping("ae")
    public ModelAndView selectOne(String xh){
        User user=userService.selectOne(xh);
        ModelAndView modelAndView=new ModelAndView("qe","one",user);
        return modelAndView;
    }
}
