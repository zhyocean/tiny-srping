package zhy.aop;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 16:13
 * Describe:
 */
public interface ClassFilter {

    boolean matches(Class targetClass);

}
