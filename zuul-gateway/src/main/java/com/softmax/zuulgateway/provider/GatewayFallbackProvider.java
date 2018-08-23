package com.softmax.zuulgateway.provider;

import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Zuul 回退处理类
 *
 * @author Jarvis
 * @date 2018/7/13
 */
@Component
public class GatewayFallbackProvider implements FallbackProvider {
    /**
     * 指定熔断器功能应用于哪些路由的服务
     * 如果需要所有的路由服务都加熔断功能，需要在getRoute()方法上返回”*“的匹配符
     *
     * @return
     */
    @Override
    public String getRoute() {
        return "user-service";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.SERVICE_UNAVAILABLE;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return this.getStatusCode().value();
            }

            @Override
            public String getStatusText() throws IOException {
                return "service unavailable";
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                //也可以随意写自己想返回的内容
                return new ByteArrayInputStream(getStatusText().getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
                return headers;
            }
        };
    }
}
