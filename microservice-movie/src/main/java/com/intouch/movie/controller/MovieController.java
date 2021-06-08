package com.intouch.movie.controller;


import com.intouch.movie.client.UserController;
import com.intouch.movie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private UserController userController;

    @GetMapping("/order")
    public String oderTicket(@RequestParam("userId") Integer id){
        User user=userController.queryOne(id);
        return user+"购票成功";
    }
}
