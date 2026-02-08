public class StringImmutability {
    public static void main(String[] args) {

        String status = "Start";

        for (int i = 1; i <= 10_000; i++) {
            status = status + " -> Updated " + i;
        }

        System.out.println("Final Status Length: " + status.length());
    }
}
