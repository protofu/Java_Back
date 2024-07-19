package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// 적용 가능한 범위(class, field, method)를 설정
@Target({ ElementType.METHOD, ElementType.FIELD })
// 유지 정책
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String value();
	String prop1();
	int prop2() default 1;
}
