package com.intouch.movie.hystrix;

import com.intouch.movie.client.UserController;
import com.intouch.movie.domain.User;
import org.springframework.stereotype.Component;


@Component
public class UserControllerImpl implements UserController {

    @Override
    public User queryOne(Integer id) {
        System.out.println("执行了熔断器，说明调用用户微服务时发生了熔断...");
        return null;
    }
}
