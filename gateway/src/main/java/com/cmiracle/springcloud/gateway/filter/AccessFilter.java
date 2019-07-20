package com.cmiracle.springcloud.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
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

    private final Logger log = LoggerFactory.getLogger(AccessFilter.class);

    private final static String X_CLIENT_TOKEN_USER = "x-client-token-user";
    private final static String X_CLIENT_TOKEN = "x-client-token";

//    private AuthService authService;

    //白名单

    //黑名单

    //登录名单

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest();
        String authentication = request.getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
        String method = request.getMethodValue();
        String url = request.getPath().value();
        log.debug("url:{},method:{},headers:{}", url, method, request.getHeaders());


        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
