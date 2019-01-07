package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 14:18
 * Describe: Bean∂®“Â
 */
public class BeanDefinition {

    private Object bean;

    private Class beanClass;

    private String beanClassName;

    public Object getBean() {
        return bean;
    }

    public void setBean(Object bean) {
        this.bean = bean;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClassName(String beanClassName){
        this.beanClassName = beanClassName;
        try {
            this.beanClass = Class.forName(beanClassName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
