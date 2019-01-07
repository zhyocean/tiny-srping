package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 15:17
 * Describe:
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    private PropertyValues propertyValues;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public void setBeanClassName(String beanClassName) throws ClassNotFoundException {
        this.beanClassName = beanClassName;
        this.beanClass = Class.forName(beanClassName);
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
