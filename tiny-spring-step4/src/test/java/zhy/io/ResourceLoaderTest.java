package zhy.io;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 15:01
 * Describe:
 */
public class ResourceLoaderTest {

    @Test
    public void test() throws Exception {
        ResourceLoader resourceLoader = new ResourceLoader();
        Resource resource = resourceLoader.getResource("tiny-ioc.xml");
        InputStream inputStream = resource.getInputStream();
        Assert.assertNotNull(inputStream);
    }

}
