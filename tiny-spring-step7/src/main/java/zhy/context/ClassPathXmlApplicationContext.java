package zhy.context;

import zhy.beans.BeanDefinition;
import zhy.beans.factory.AbstractBeanFactory;
import zhy.beans.factory.AutowireBeanFactory;
import zhy.beans.io.ResourceLoader;
import zhy.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * @author: zhangocean
 * @Date: 2019/1/13 17:05
 * Describe:
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    public void refresh() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for(Map.Entry<String, BeanDefinition> e : xmlBeanDefinitionReader.getRegistry().entrySet()){
            this.beanFactory.registerBeanDefinition(e.getKey(), e.getValue());
        }
    }

}
