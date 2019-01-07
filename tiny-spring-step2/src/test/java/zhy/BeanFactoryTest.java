package zhy;

import org.junit.Test;
import zhy.factory.AutowireBeanFactory;
import zhy.factory.BeanFactory;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 14:43
 * Describe:
 */
public class BeanFactoryTest {

    @Test
    public void test(){

        //1.初始化BeanFactory
        BeanFactory beanFactory = new AutowireBeanFactory();

        //2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("zhy.HelloService");
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //3.获得Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
