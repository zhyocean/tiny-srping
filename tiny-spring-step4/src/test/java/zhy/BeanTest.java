package zhy;

import org.junit.Test;
import zhy.factory.AutowireBeanFactory;
import zhy.factory.BeanFactory;
import zhy.io.ResourceLoader;
import zhy.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:13
 * Describe:
 */
public class BeanTest {

    @Test
    public void test() throws Exception {
        //1.从tiny-ioc.xml中读取Bean
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tiny-ioc.xml");

        //2.创建BeanFactory并注册从xml中读到的Bean
        BeanFactory beanFactory = new AutowireBeanFactory();
        for (Map.Entry<String, BeanDefinition> m : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(m.getKey(), m.getValue());
        }

        //5.获取Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
