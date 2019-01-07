package zhy.factory;

import zhy.BeanDefinition;
import zhy.PropertyValue;

import java.lang.reflect.Field;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 15:27
 * Describe:
 */
public class AutowireBeanFactory extends AbstractBeanFacory {

    @Override
    protected Object doCreateBean(BeanDefinition beanDefinition) {
        try {
            Object bean = createBeanInstance(beanDefinition);
            applyPropertyValues(bean, beanDefinition);
            return bean;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private Object createBeanInstance(BeanDefinition beanDefinition) throws Exception {
        return beanDefinition.getBeanClass().newInstance();
    }

    private void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception{
        for(PropertyValue pv : beanDefinition.getPropertyValues().getPropertyValues()){
            //通过反射获得类的所有申明的字段，不包括父类的
            Field declaredField = bean.getClass().getDeclaredField(pv.getName());
            declaredField.setAccessible(true);
            declaredField.set(bean, pv.getValue());
        }
    }
}
