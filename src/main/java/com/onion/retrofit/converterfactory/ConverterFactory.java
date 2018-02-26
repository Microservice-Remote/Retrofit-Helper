package com.onion.retrofit.converterfactory;

import retrofit2.Converter;

/**
 * Created by zhangqi on 2018/2/26.
 */
public interface ConverterFactory {

     static Converter.Factory getFactory(){
         return null;
     }

}
