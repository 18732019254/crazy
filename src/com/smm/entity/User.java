package com.smm.entity;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String xh;
    private Integer id;
    private Integer bj;
    private Integer age;
    private String name;
    private String sex;
    private Integer soccer;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBj() {
        return bj;
    }

    public void setBj(Integer bj) {
        this.bj = bj;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getSoccer() {
        return soccer;
    }

    public void setSoccer(Integer soccer) {
        this.soccer = soccer;
    }
}
