package zhy.aop;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 16:06
 * Describe:
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();

}
