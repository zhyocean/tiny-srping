package zhy.aop;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 16:10
 * Describe:
 */
public interface PointcutAdvisor extends Advisor{

    Pointcut getPointcut();

}
