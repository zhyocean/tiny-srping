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
         * class.getResource("")  �ӵ�ǰ��Ŀ¼�¿�ʼ��ȡ��Դ
         * class.getResource("/")  �Ӹ�Ŀ¼�¿�ʼ��ȡ��Դ
         *
         * classLoader.getResource("")  �����������ȡֱ�Ӿ��ǻ�ȡ�ĸ�Ŀ¼�µ���Դ
         */
        URL resource = ResourceLoader.class.getResource("/" + location);
//        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }

}
