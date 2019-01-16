package zhy.beans;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:44
 * Describe:
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;

}