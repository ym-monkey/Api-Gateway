package bat.ke.qq.com.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 
 * 告诉我们的API网关这个方法需要往外爆露出去
 * 
 * @author 源码学院-monkey
 *
 */
@Target({ ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface APIMapping {
    String value();
    boolean useLogin() default false;
}
