package com.imooc.bilibili.domain.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author Shangchen Yao
 * @date 2023/6/8 21:21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
@Component
public @interface ApiLimitedRole {

    String[] limitedRoleCodeList() default {};
}
