package kr.re.kitri.hello.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // 실행때 적용하겠다
@Target(ElementType.METHOD) // 메소드에 적용하겠다
public @interface TokenRequired {

}
