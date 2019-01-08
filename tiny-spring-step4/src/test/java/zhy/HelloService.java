package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 11:00
 * Describe:
 */
public class HelloService {

    private String text;

    public void helloWorld(){
        System.out.println(text);
    }

    public void setText(String text){
        this.text = text;
    }

}
