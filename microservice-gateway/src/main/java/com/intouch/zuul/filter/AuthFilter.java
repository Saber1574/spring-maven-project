package com.intouch.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  针对用户实施Token检查
 *  （1）符合
 * */
public class AuthFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() throws ZuulException {

        RequestContext context=RequestContext.getCurrentContext();
        HttpServletRequest request=context.getRequest();
        HttpServletResponse response=context.getResponse();

        String token=request.getParameter("token");

        if (!"admin".equals(token)){
            context.setSendZuulResponse(false);

            response.setStatus(401);//表示请求用户缺乏必要的权限，因此受到限制
        }
        return null;
    }
}
