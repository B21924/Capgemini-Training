import java.util.*;
public class StringTokenization {
    public static void main(String[] args) {
        String errorCodes = "E101,E205,E404,E500";
        
        String[] codes = errorCodes.split(",");
        
        for (String code : codes) {
            System.out.println("Processed error code: " + code);
        }
    }
}
