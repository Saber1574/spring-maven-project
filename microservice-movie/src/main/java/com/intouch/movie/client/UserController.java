package com.intouch.movie.client;

import com.intouch.movie.domain.User;
import com.intouch.movie.hystrix.UserControllerImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( value ="microservice-movie",fallback= UserControllerImpl.class)
public interface UserController {

    @GetMapping("/user/{id}")
    public User queryOne(@PathVariable Integer id);
}
