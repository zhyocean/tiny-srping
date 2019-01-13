package zhy.beans.factory;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 13:58
 * Describe:
 */
public interface BeanFactory {

    Object getBean(String beanName) throws Exception;

}
