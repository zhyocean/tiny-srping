package zhy.factory;

import zhy.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 13:59
 * Describe:
 */
public abstract class AbstractBeanFactory implements BeanFactory{

    private Map<String, BeanDefinition> map = new ConcurrentHashMap<String, BeanDefinition>();

    @Override
    public Object getBean(String beanName) {
        return map.get(beanName).getBean();
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = doCreateBean(beanName, beanDefinition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        beanDefinition.setBean(bean);
        map.put(beanName, beanDefinition);
    }

    /**
     * ≥ı ºªØBean
     */
    protected abstract Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws Exception;
}
