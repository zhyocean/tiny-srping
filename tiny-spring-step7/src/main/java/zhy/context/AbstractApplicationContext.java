package zhy.context;

import zhy.beans.factory.AbstractBeanFactory;

/**
 * @author: zhangocean
 * @Date: 2019/1/13 16:54
 * Describe:
 */
public abstract class AbstractApplicationContext implements ApplicationContext{

    public AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public void refresh() throws Exception {

    }

    @Override
    public Object getBean(String beanName) throws Exception {
        return beanFactory.getBean(beanName);
    }
}
