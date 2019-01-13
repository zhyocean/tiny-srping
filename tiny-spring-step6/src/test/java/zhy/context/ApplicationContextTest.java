package zhy.context;

import org.junit.Test;
import zhy.HelloService;

/**
 * @author: zhangocean
 * @Date: 2019/1/13 20:32
 * Describe:
 */
public class ApplicationContextTest {

    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tiny-ioc.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.helloWorld();
    }

}
