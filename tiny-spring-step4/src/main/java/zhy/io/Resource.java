package zhy.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:50
 * Describe: Resource��spring�ڲ���λ��Դ�Ľӿڡ�
 */
public interface Resource {

    InputStream getInputStream() throws IOException;

}
