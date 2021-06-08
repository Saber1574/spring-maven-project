package com.intoch.user.controller;

import com.intoch.user.domain.User;
import com.intoch.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //根据id查询单个用户的请求
    @GetMapping("/{id}")
    public User getOne(@PathVariable Integer id){
        User user=userService.quertOne(id);
        return user;
        //System.out.println("执行了熔断器，说明了发生了熔断");
        //return null;//返回值是null，代表用户微服模块
    }

    //查询所有用户
    @GetMapping
    public List<User> findAll(){
        List<User> userList=userService.listAll();
        return userList;
    }

    //添加一名用户
    @PostMapping
    public String addUser(@RequestBody User user){
        userService.add(user);
        return "成功添加一名用户";
    }

    //修改一名用户
    @PutMapping("/{id}")
    public String modifyInfo(@RequestBody User user,@PathVariable Integer id){
        //设置id
        user.setId(id);
        userService.modify(user);
        return "成功修改一名用户";
    }

    //删除一名用户
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteOne(id);
        return "成功删除一名用户";
    }
}