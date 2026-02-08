import java.util.Scanner;

public class pgm51_55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//51. WAP to print Pyramid of Character.
		/*
		int n = sc.nextInt();      
		char ch;
		for (int i = 1; i <= n; i++) {
			for (int s = i; s < n; s++) {
				System.out.print(" ");
			}
			ch = 'A';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch + " ");
				ch++;
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		//52. WAP to print Pyramid of Number.
		/*
		int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */
		
		
		
		
		
		// 53
		/*
		int rows = 4;
        int stars = 6;
        for (int i = 0; i < rows; i++) {
            for (int s = 0; s < i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        
        
        
        // 54
		/*
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
		
		
		
		
		
		// 55
		/*
		int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {

            for (int s = n; s > i; s--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
        
        
    sc.close();
	}
}
