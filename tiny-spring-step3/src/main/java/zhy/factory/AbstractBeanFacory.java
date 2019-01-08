package zhy.factory;

import zhy.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 15:22
 * Describe:
 */
public abstract class AbstractBeanFacory implements BeanFactory{

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    @Override
    public Object getBean(String beanName) {
        return beanDefinitionMap.get(beanName).getBean();
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        Object bean = doCreateBean(beanDefinition);
        beanDefinition.setBean(bean);
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    /**
     * 初始化Bean
     * 通过beanDefinition中的getBeanClass反射创建一个Bean
     * 通过beanDefinition中的propertyValues为该Bean进行属性注入
     */
    protected abstract Object doCreateBean(BeanDefinition beanDefinition);
}
