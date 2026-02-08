import java.util.*;

public class StringFrequency {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a text: ");
        String text = sc.nextLine();
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
