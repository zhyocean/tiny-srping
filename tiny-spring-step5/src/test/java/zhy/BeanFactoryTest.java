package zhy;

import org.junit.Test;
import zhy.factory.AbstractBeanFactory;
import zhy.factory.AutowireBeanFactory;
import zhy.factory.BeanFactory;
import zhy.io.ResourceLoader;
import zhy.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author: zhangocean
 * @Date: 2019/1/10 20:48
 * Describe:
 */
public class BeanFactoryTest {

    @Test
    public void test() throws Exception {
        //1.�������ļ��м���Bean
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tiny-ioc.xml");

        //2.����BeanFactory��ע��Bean
        AbstractBeanFactory beanFactory = new AutowireBeanFactory();
        for(Map.Entry<String, BeanDefinition> e : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(e.getKey(), e.getValue());
        }

//        beanFactory.preInstantiateSingletons();

        //3.���Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
