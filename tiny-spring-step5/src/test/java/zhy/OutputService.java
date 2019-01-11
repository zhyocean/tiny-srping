package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/10 20:35
 * Describe:
 */
public class OutputService {

    private String say;

    public void output(){
        System.out.println(say);
    }

    public void setSay(String say) {
        this.say = say;
    }
}
