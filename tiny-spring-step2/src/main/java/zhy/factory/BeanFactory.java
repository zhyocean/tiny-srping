package zhy.factory;

import zhy.BeanDefinition;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 14:26
 * Describe:
 */
public interface BeanFactory {

    Object getBean(String name);

    void registerBeanDefinition(String name, BeanDefinition beanDefinition);
}
