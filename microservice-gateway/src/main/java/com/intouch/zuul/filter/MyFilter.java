package com.intouch.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

/**
 *
 * */
public class MyFilter extends ZuulFilter {

    //过滤器的类型（“前置”，“路由”，“错误”，“后置”）
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;//前置过滤器
    }

    //过滤器执行的顺序，数值越大，优先级越低
    @Override
    public int filterOrder() {
        return 2;
    }

    //设置当前过滤器是否生效
    @Override
    public boolean shouldFilter() {
        return false;
    }

    //过滤器正真执行的逻辑代码
    @Override
    public Object run() throws ZuulException {
        System.out.println("正在执行MyFilter1");
        return null;
    }
}
