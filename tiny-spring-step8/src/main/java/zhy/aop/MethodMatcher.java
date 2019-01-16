package zhy.aop;

import java.lang.reflect.Method;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 16:09
 * Describe:
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);

}
