package zhy.factory;

import zhy.BeanDefinition;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 14:39
 * Describe:
 */
public class AutowireBeanFactory extends AbstractBeanFactory {
    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = beanDefinition.getBeanClass().newInstance();
            return bean;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
