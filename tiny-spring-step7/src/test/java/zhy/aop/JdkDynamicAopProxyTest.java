package zhy.aop;

import org.junit.Test;
import zhy.HelloService;
import zhy.context.ApplicationContext;
import zhy.context.ClassPathXmlApplicationContext;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 14:22
 * Describe:
 */
public class JdkDynamicAopProxyTest {

    @Test
    public void testInterceptor() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tiny-ioc.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
//        helloService.helloWorld();

        //---------helloService with AOP
        //1.设置被代理对象(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloService, HelloService.class);
        advisedSupport.setTargetSource(targetSource);

        //设置拦截器(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        //3.创建代理(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloService helloService1Proxy = (HelloService) jdkDynamicAopProxy.getProxy();


        //4.基于AOP的调用
        helloService1Proxy.helloWorld();
    }

}
