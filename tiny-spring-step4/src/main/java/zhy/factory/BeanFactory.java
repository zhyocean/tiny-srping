package zhy.factory;

import zhy.BeanDefinition;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 13:58
 * Describe:
 */
public interface BeanFactory {

    Object getBean(String beanName);

    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
