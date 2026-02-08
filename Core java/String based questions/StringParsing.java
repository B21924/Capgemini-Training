
public class StringParsing {
	public static void main(String[] args) {
		String order_details = "ORDERID-123|PRODUCT-Mobile|PRICE-15000";
		String[] details = order_details.split("\\|");
		
		//System.out.println(details[0]);
		//System.out.println(details[1]);
		//System.out.println(details[2]);
		
		
		String orderId = details[0].split("-")[1];
        String product = details[1].split("-")[1];
        String price   = details[2].split("-")[1];

        // Output
        System.out.println("Order ID = " + orderId);
        System.out.println("Product = " + product);
        System.out.println("Price = " + price);
	}

}
