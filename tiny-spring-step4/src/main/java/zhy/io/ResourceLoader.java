package zhy.io;

import java.net.URL;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:53
 * Describe:
 */
public class ResourceLoader {

    public Resource getResource(String location){
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
