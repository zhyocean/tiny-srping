package zhy.factory;

import zhy.BeanDefinition;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 13:59
 * Describe:
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();

    private final List<String> beanDefinitionNames = new ArrayList<String>();

    @Override
    public Object getBean(String beanName) throws Exception {
        BeanDefinition beanDefinition = map.get(beanName);
        if(beanDefinition == null){
            throw new IllegalArgumentException("No bean named " + beanName + " is defined");
        }
        Object bean = beanDefinition.getBean();
        if(bean == null){
            bean = doCreateBean(beanDefinition);
        }
        return bean;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        map.put(beanName, beanDefinition);
        beanDefinitionNames.add(beanName);
    }

    public void preInstantiateSingletons() throws Exception {
        for (Iterator it = this.beanDefinitionNames.iterator(); it.hasNext();) {
            String beanName = (String) it.next();
            getBean(beanName);
        }
    }

    /**
     * ≥ı ºªØBean
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition) throws Exception;
}
