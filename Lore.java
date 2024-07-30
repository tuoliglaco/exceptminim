import java.util.HashMap;
import java.util.Map;

public class SpecParser {

    public Map<String, String> parse(String spec) {
        Map<String, String> resultMap = new HashMap<>();
        
        if (spec == null || spec.isEmpty()) {
            return resultMap;
        }
        
        String[] pairs = spec.split(",");
        for (String pair : pairs) {
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) { // Ensure that the pair contains both key and value
                String key = keyValue[0].trim();
                String value = keyValue[1].trim();
                resultMap.put(key, value);
            }
        }
        
        return resultMap;
    }

    public static void main(String[] args) {
        SpecParser parser = new SpecParser();
        String spec = "key1=value1,key2=value2,key3=value3";
        
        Map<String, String> parsedSpec = parser.parse(spec);
        
        // Output the parsed map
        for (Map.Entry<String, String> entry : parsedSpec.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
