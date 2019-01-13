package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 11:00
 * Describe:
 */
public class HelloService {

    private String text;

    private OutputService outputService;

    public void helloWorld(){
        outputService.output(text);
    }

    public void setText(String text){
        this.text = text;
    }

    public void setOutputService(OutputService outputService){
        this.outputService = outputService;
    }
}
