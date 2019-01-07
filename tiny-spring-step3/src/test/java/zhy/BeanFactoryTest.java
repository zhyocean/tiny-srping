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
        //1.����BeanFactory
        BeanFactory beanFactory = new AutowireBeanFactory();

        //2.����Bean
        BeanDefinition beanDefinition = new BeanDefinition();
        beanDefinition.setBeanClassName("zhy.HelloService");

        //3.����Bean����
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addProperty(new PropertyValue("text", "Hello World!"));
        beanDefinition.setPropertyValues(propertyValues);

        //4.ע��Bean
        beanFactory.registerBeanDefinition("helloService", beanDefinition);

        //5.��ȡBean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
