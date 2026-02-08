public class StringPalindrome {
	public static void main(String[] args) {
		String str = "madam";
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		System.out.println("Palindrome: " + str.equals(rev));
	}

}
