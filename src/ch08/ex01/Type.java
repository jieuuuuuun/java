package ch08.ex01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE)
public @interface Type {
	String name();
	int value();
}

@Retention(RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
@interface Field {
	int value();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.CONSTRUCTOR)
@interface Constructor {
	int value() default 0;
}

@Target(ElementType.METHOD)
@interface Method {
	
}

@Target(ElementType.PARAMETER)
@interface Param {
	
}

@Target(ElementType.LOCAL_VARIABLE)
@Annotation
@interface Local {
	
}

@Target(ElementType.ANNOTATION_TYPE)
@interface Annotation {
	
}

@Target({ElementType.TYPE, ElementType.FIELD})
@interface Universal {
	
}

	
//어노테이션 만드는 문법 TYPE어노테이션은 클래스에서 쓸 수 있다.
//속성도 추가할 수 있다.
//속성타입만 정한다.