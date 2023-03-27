package ch12.sec12;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";	// value 속성: 선의 종류
	int number() default 15;	// number 속성: 출력 횟수
}
