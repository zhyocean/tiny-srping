package zhy.xml;

import org.junit.Assert;
import org.junit.Test;
import zhy.BeanDefinition;
import zhy.io.ResourceLoader;

import java.util.Map;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 15:04
 * Describe:
 */
public class XmlBeanDefinitionReaderTest {

    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tiny-ioc.xml");
        Map<String, BeanDefinition> register = xmlBeanDefinitionReader.getRegistry();
        Assert.assertTrue(register.size() > 0);
    }
}
