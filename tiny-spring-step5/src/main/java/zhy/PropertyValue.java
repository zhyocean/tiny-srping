package zhy;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:08
 * Describe:
 */
public class PropertyValue {

    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }

}
