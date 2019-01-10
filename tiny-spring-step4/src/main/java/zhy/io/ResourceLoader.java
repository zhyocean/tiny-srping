package zhy.io;

import java.net.URL;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:53
 * Describe:
 */
public class ResourceLoader {

    public Resource getResource(String location){
        /**
         * class.getResource("")  从当前类目录下开始获取资源
         * class.getResource("/")  从根目录下开始获取资源
         *
         * classLoader.getResource("")  用类加载器获取直接就是获取的根目录下的资源
         */
        URL resource = ResourceLoader.class.getResource("/" + location);
//        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
