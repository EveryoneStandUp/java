package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {

}

@MyAnnotation03
class MyClass03 {
	
	@MyAnnotation03
	String field;
	
	@MyAnnotation03
	MyClass03(){
		
	}
	
	@MyAnnotation03
	void method1() {
		
	}
}

//@Target(ElementType.TYPE) // class or interface에만 붙일수있음
//@Target(ElementType.METHOD) // 메소드에만
//@Target(ElementType.FIELD) // 필드에만
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}