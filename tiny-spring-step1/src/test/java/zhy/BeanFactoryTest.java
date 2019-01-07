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

        //1.��ʼ��BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        //2.ע��Bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //3.��ȡBean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();

    }

}
