package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/10 20:35
 * Describe:
 */
public class OutputService {

    private String say;

    public void output(String text){
        System.out.println(text);
    }

    public void setSay(String say) {
        this.say = say;
    }
}
