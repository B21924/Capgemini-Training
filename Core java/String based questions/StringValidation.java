import java.util.*;
public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if (str.length() < 5 || str.length() > 12) {
            System.out.println("Invalid username (length should be 5 to 12 characters)");
        } 
        else if (!str.matches("[a-zA-Z]+")) {
            System.out.println("Invalid username (contains digits or special characters)");
        } 
        else {
            System.out.println("Valid username");
        }

	}

}


