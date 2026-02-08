import java.util.*;
public class pgm41_50 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//41. Write a program in Java to display the pattern like right angle triangle with a number.
		/*
		int n=sc.nextInt();
		for (int i = 1; i <= n; i++) {          
            for (int j = 1; j <= i; j++) {      
                System.out.print( j + " ");
            }
            System.out.println();
        }
		*/
		
		
		
		
		
		//42. Write a Java program to check whether the first two characters present at the end of a given string.
		/*
		String str=sc.nextLine();
		String firstTwo = str.substring(0, 2);
        String lastTwo = str.substring(str.length() - 2);
        if (firstTwo.equals(lastTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
		*/
		
		
		
		
		
		//43. Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday
		/*
		System.out.print("Enter any number: ");
        int num = sc.nextInt();

        Random r = new Random(num);
        int day = r.nextInt(7) + 1;

        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
        }
		*/
		
		
		
		
		
		//44. Write a Java program that checks if 2 array contains the same element.
		/*
		System.out.print("Enter the size of array1: ");
		int n1 = sc.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0; i<n1; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.print("Enter the size of array2: ");
		int n2 = sc.nextInt();
		int[] arr2 = new int[n2];
		for(int i=0; i<n2; i++) {
			arr2[i] = sc.nextInt();
		}
		
		if (Arrays.equals(arr1, arr2)) {
			System.out.println("Same elements");
		}else {
			System.out.println("Not same");
		}
		*/
		
		
		
		
		
		//45. How do you shuffle an array in Java.
		/*
		Integer[] arr = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(arr);
        Collections.shuffle(list);

        System.out.println(list);
		*/
		
		
		
		
		
		//46. Find the array pairs whose sum is equal to the given number.
		/*
		int[] arr = {1, 5, 7, -1, 5};
        int sum = 6;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        */
		
		
		
		
		
		//47. Write a Java program to divide a string in n equal parts.
		/*
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		
		System.out.print("Enter number of parts: ");
		int n = sc.nextInt();
		
		int len = s.length();
		if(len % n !=0 ) {
			System.out.println("Cannot be divided to equal parts");
			return;
		}
		
		int partsize = len / n;
		int start = 0;
		
		for (int i = 0; i < n; i++) {
            System.out.println(s.substring(start, start + partsize));
            start += partsize;
        }
        */
		
		
		
		
		
		//48. Write a Java program to count and print all the duplicates in the input string.
		/*
		String str = sc.nextLine();

        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
        */
        
        
        
        
        
        //49. Write a Java program to check whether a given string starts with the contents of another string.
		/*
		String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(s1.startsWith(s2));
        */
		
		
		
		
		
        //50. WAP to print Diamond pattern.
		/*
		int n = sc.nextInt();

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
