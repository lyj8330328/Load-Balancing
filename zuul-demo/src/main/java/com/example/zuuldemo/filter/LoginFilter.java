package com.example.zuuldemo.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Author: 98050
 * Time: 2018-08-01 22:09
 * Feature:
 */
@Component
public class LoginFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 2;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //获取请求参数中的token
        RequestContext ctx=RequestContext.getCurrentContext();
        HttpServletRequest req = ctx.getRequest();

        //获取参数
        String token=req.getParameter("token");
        if(StringUtils.isEmpty(token)){
            //未授权登录，拒绝访问，返回401
            ctx.setResponseStatusCode(401);
            //不在继续相应路由
            ctx.setSendZuulResponse(false);
        }

        return null;
    }
}
