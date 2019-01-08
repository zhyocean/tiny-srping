package zhy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: zhangocean
 * @Date: 2019/1/8 14:09
 * Describe:
 */
public class PropertyValues {

    private List<PropertyValue> propertyValues = new ArrayList<PropertyValue>();

    public PropertyValues() {
    }

    public void addProperty(PropertyValue propertyValue){
        propertyValues.add(propertyValue);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValues;
    }

}
