package com.huang.annotation;

import java.lang.annotation.*;

/**
 * @Auther: pc.huang
 * @Date: 2018/7/19 14:32
 * @Description: controller注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {
    String value() default "";
}
