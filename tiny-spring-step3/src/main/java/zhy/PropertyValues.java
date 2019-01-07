package zhy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangocean
 * @Date: 2019/1/7 15:50
 * Describe:
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addProperty(PropertyValue propertyValue){
        // TODO: 2019/1/7 最好对重复的propertyName进行判断
        this.propertyValues.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }
}
