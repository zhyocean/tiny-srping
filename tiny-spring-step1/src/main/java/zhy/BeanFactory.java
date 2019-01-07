package zhy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 10:51
 * Describe: BeanFactory
 */
public class BeanFactory {

    /**
     * BeanFactoryʵ����һ��Map����Beanͨ����ֵ�Է�ʽע��
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String, BeanDefinition>();

    public Object getBean(String name){
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition){
        beanDefinitionMap.put(name, beanDefinition);
    }

}
