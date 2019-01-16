package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 14:37
 * Describe:
 */
public class HelloServiceImpl implements HelloService {

    private String text;

    private OutputService outputService;

    @Override
    public void helloWorld() {
        outputService.output(text);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setOutputService(OutputService outputService) {
        this.outputService = outputService;
    }
}
