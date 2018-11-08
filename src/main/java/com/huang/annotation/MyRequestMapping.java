package com.huang.annotation;

import java.lang.annotation.*;

/**
 * @Auther: pc.huang
 * @Date: 2018/7/19 14:44
 * @Description:
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    String value() default "";
}
