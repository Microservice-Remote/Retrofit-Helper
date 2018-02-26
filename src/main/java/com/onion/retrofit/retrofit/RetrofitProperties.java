package com.onion.retrofit.retrofit;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by zhangqi on 2018/2/26.
 */
@ConfigurationProperties(prefix = "spring.retrofit")
public class RetrofitProperties {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
