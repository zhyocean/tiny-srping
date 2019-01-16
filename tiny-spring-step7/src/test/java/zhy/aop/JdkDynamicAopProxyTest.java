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
        //1.���ñ��������(Joinpoint)
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloService, HelloService.class);
        advisedSupport.setTargetSource(targetSource);

        //����������(Advice)
        TimerInterceptor timerInterceptor = new TimerInterceptor();
        advisedSupport.setMethodInterceptor(timerInterceptor);

        //3.��������(Proxy)
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloService helloService1Proxy = (HelloService) jdkDynamicAopProxy.getProxy();


        //4.����AOP�ĵ���
        helloService1Proxy.helloWorld();
    }

}
