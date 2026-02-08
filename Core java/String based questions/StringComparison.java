
public class StringComparison {
	public static void main(String[] args) {
		String stored_pswd = "Admin@123";
		String entered_pswd = "admin@123";
		if(!stored_pswd.equals(entered_pswd)) {
			System.out.println("Login failed (case mismatch)");
		}else {
			System.out.println("Login successful");
		}
	}

}
