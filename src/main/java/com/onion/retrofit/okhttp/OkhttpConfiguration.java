package com.onion.retrofit.okhttp;

import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * Created by zhangqi on 2018/2/26.
 */
@Configuration
@EnableConfigurationProperties(OkhttpProperties.class)
public class OkhttpConfiguration {

    private Logger mLogger = LoggerFactory.getLogger(OkhttpConfiguration.class.getName());

    private final OkhttpProperties mOkhttpProperties;

    public OkhttpConfiguration(OkhttpProperties okhttpProperties){
        mOkhttpProperties = okhttpProperties;
    }

    @Bean
    @ConditionalOnMissingBean(OkHttpClient.class)
    public OkHttpClient okhttpClient(){

        OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
                .readTimeout(mOkhttpProperties.getReadTimeOut(), TimeUnit.MILLISECONDS)
                .connectTimeout(mOkhttpProperties.getConnTimeOut(),TimeUnit.MILLISECONDS)
                .writeTimeout(mOkhttpProperties.getWriteTimeOut(),TimeUnit.MILLISECONDS)
                .build();
        return okHttpClient;
    }
}
