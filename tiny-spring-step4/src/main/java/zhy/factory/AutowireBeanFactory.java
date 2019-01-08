package zhy.factory;

import zhy.BeanDefinition;
import zhy.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:03
 * Describe:
 */
public class AutowireBeanFactory extends AbstractBeanFactory{

    @Override
    protected Object doCreateBean(String beanName, BeanDefinition beanDefinition) throws Exception {
        Object bean = createBeanInstance(beanDefinition);
        applyPropertyValues(bean, beanDefinition);
        return bean;
    }

    private Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    private void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for(PropertyValue pv : beanDefinition.getPropertyValues().getPropertyValues()){
            Field field = bean.getClass().getDeclaredField(pv.getName());
            field.setAccessible(true);
            field.set(bean, pv.getValue());
        }
    }
}
