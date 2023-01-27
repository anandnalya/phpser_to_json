import java.util.HashMap;
import java.util.Map;

/**
 * Represents an object that has a name and a map of attributes
 */
public class PhpObject {
    public String name;
    public Map<Object, Object> attributes = new HashMap<Object, Object>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Object, Object> getAttributes() {
        return attributes;
    }

    public void setAttributes(Map<Object, Object> attributes) {
        this.attributes = attributes;
    }
}
