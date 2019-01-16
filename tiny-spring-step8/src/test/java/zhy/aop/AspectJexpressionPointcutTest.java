package zhy.aop;

import org.junit.Assert;
import org.junit.Test;
import zhy.HelloService;
import zhy.HelloServiceImpl;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 16:29
 * Describe:
 */
public class AspectJexpressionPointcutTest {

    @Test
    public void testClassFilter(){
        String expression = "execution(* zhy.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloService.class);
        Assert.assertTrue(matches);
    }

    @Test
    public void testMethodInterceptor() throws Exception {
        String expression = "execution(* zhy.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getMethodMatcher().matches(HelloServiceImpl.class.getDeclaredMethod("helloWorld"),HelloServiceImpl.class);
        Assert.assertTrue(matches);
    }
}
