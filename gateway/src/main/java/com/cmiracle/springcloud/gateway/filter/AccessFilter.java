package com.cmiracle.springcloud.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/15 18 27
 * @Description:
 */
@Component
public class AccessFilter implements GlobalFilter, Ordered {

    private final static String X_CLIENT_TOKEN_USER = "x-client-token-user";
    private final static String X_CLIENT_TOKEN = "x-client-token";

    //白名单

    //黑名单

    //登录名单

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {




        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
