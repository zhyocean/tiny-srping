package zhy;

import org.junit.Test;
import zhy.factory.AutowireBeanFactory;
import zhy.factory.BeanFactory;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 15:29
 * Describe:
 */
public class BeanFactoryTest {

    @Test
    public void test() throws ClassNotFoundException {
        //1.创建BeanFactory
        BeanFactory beanFactory = new AutowireBeanFactory();

        //2.定义Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("zhy.HelloService");

        //3.设置Bean属性
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addProperty(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        //4.注册Bean
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //5.获取Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
