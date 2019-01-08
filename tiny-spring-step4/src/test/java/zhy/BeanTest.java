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
        //1.��tiny-ioc.xml�ж�ȡBean
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tiny-ioc.xml");

        //2.����BeanFactory��ע���xml�ж�����Bean
        BeanFactory beanFactory = new AutowireBeanFactory();
        for (Map.Entry<String, BeanDefinition> m : xmlBeanDefinitionReader.getRegistry().entrySet()){
            beanFactory.registerBeanDefinition(m.getKey(), m.getValue());
        }

        //5.��ȡBean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloWorld();
    }

}
