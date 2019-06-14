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
 * @Date: 2019/6/10 21 35
 * @Description:
 */
@Component
public class AccessLoginFilter implements GlobalFilter, Ordered {

    private final Logger log = LoggerFactory.getLogger(AccessLoginFilter.class);

    private String loginUrl = "/oauth/login";

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("into AccessLoginFilter");

        ServerHttpRequest request = exchange.getRequest();
        String authentication = request.getHeaders().getFirst(HttpHeaders.AUTHORIZATION);
        String method = request.getMethodValue();
        String url = request.getPath().value().trim();

        log.info("url = {}, method = {}", url, method);

        //登录请求则调用oauth授权服务
        if(loginUrl.equals(url)){
            log.info("AccessLoginFilter go to login");
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
