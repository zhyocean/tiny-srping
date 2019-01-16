package zhy.aop;

/**
 * @author: zhangocean
 * @Date: 2019/1/16 14:01
 * Describe: 被代理对象
 */
public class TargetSource {

    private Class targetClass;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass) {
        this.target = target;
        this.targetClass = targetClass;
    }

    public Class getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }
}
