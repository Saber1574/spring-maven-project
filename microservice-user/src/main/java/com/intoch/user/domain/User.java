package com.intoch.user.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity//要求底层数据库对应JavaBean建立一张表
@Table(name = "tb_user")//表名是tb_user
public class User implements Serializable {
    @Id//表明id属性对应主键字段
    @GeneratedValue(strategy = GenerationType.IDENTITY)//表明主键字段是逐一递增的
    private Integer id;//用户编号
    private String username;//用户名
    private String password;//用户密码
    private String sex;//用户性别
    private Double money;//用户账户上的存款

    public User(){}

    public User(Integer id, String username, String password, String sex, Double money) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.money = money;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }


}
