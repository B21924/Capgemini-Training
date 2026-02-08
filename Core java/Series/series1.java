import java.util.Scanner;
public class series1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int value = 1;

        for (int i = 1; i <= N; i++) {
            int term;
            if (i == 1) {
                term = 1;
            } else {
                value = value + (i - 1) * (i - 1);
                term = value;
            }

            if (i % 2 == 0)
                System.out.print(-term + " ");
            else
                System.out.print(term + " ");
        }
    }
}
