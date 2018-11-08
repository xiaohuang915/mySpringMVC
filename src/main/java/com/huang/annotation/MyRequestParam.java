package com.huang.annotation;

import java.lang.annotation.*;

/**
 * @Auther: pc.huang
 * @Date: 2018/7/19 14:45
 * @Description:
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    String value();
}
