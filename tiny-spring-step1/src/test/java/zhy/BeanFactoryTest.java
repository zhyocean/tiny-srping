package zhy;

import org.junit.Test;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 10:57
 * Describe:
 */
public class BeanFactoryTest {

    @Test
    public void buildBeanFactory(){

        //1.初始化BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.注入Bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //3.获取Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();

    }

}
