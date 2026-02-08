import java.util.Scanner;

public class series4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms to generate: ");
        int n = sc.nextInt();

        int a = 1, b = 5, c = 8;

        System.out.println("The sequence is:");
        
        if (n >= 1) 
        	System.out.print(a + " ");
        if (n >= 2) 
        	System.out.print(b + " ");
        if (n >= 3) 
        	System.out.print(c + " ");

        
        for (int i = 4; i <= n; i++) {
            int next_term = a + b + c; 
            System.out.print(next_term + " ");

     
            a = b;
            b = c;
            c = next_term;
        }
    }
}
