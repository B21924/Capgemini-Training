
public class StringReversal {
	public static void main(String[] args) {
		
		String accno = "1234567890";
		
		String firstPart = accno.substring(0, accno.length() - 4);
        String lastPart = accno.substring(accno.length() - 4);
        
        String reversedLastPart = new StringBuilder(lastPart).reverse().toString();
      
        String maskedValue = firstPart + reversedLastPart;

        System.out.println("Masked Value = " + maskedValue);
		
		
		
	}

}
