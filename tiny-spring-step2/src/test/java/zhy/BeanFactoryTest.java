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

        //1.��ʼ��BeanFactory
        BeanFactory beanFactory = new AutowireBeanFactory();

        //2.ע��Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("zhy.HelloService");
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //3.���Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
