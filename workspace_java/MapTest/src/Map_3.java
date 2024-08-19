import java.util.HashMap;
import java.util.Map;

public class Map_3 {
    public static void main(String[] args) {
        // Map<String, String> -> key도 문자열, value도 문자열
        Map<String, Object> map = new HashMap();
        map.put("1", "100");
        map.put("2", 10);
        map.put("3", 10.5);
        map.put("4", new Student(1, "abc"));


        System.out.println(map);
    }
}
