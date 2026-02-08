import java.util.Scanner;

public class series3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int odd = 1;
        int even = 2;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(odd + " ");
                odd += 3;
            } else {
                System.out.print(-even + " ");
                even += 4;
            }
        }
    }
}
