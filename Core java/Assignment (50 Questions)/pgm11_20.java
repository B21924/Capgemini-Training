import java.util.*;

public class pgm11_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 11.How to remove characters from the first String which are present in the second String?
		/*
		System.out.print("Enter string1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter string2: ");
		String str2 = sc.nextLine();
		for(int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			boolean found = false;
			
			for(int j=0; j < str2.length(); j++) {
				if(ch == str2.charAt(j)) {
					found = true;
				}
			}
			if(!found) {
				System.out.print(ch);
			}
		}
		*/
		
		
		
		
		
		//12. How to print all permutation of a String?
		/*
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		for(int i=0;i<=str1.length()-1;i++) {
			char ch=str1.charAt(i);
			boolean found=false;
			for(int j=0;j<=str2.length()-1;j++) {
				if(ch == str2.charAt(j)){
					found=true;
				}
			}
			if(!found) {
				System.out.println(ch);
			}
		}
		*/
		
		
		
		
		
		// 13.Check whether the string is Anagram or not
		/*
		System.out.print("Enter string1: ");
		String str1 = sc.nextLine();
		System.out.print("Enter string2: ");
		String str2 = sc.nextLine();
		
		str1 = str1.replace("\\s","");
		str2 = str2.replace("\\s","");
		if(str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		*/
		
		
		
		
		
		// 14.WAP to read name (program) and print letters in ascending order (agmoprr)
		/*
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		Arrays.sort(ch);
		String sorted = new String(ch);
		System.out.println(sorted);
		*/
		
		
		
		
		
		//15. WAP to read a number (28156437) and it should print digits order wise(12345678)
		/*
		String num = sc.nextLine();

        char[] digits = num.toCharArray();
        Arrays.sort(digits);

        for (char c : digits) {
            System.out.print(c);
        }
        */
		
		
		
		
		
		// 16.Take 10 integers from keyboard using loop and print their average value on the screen.
		/*
		System.out.print("Enter 10 numbers: ");
		int[] num = new int[10];
		for(int i=0; i<10; i++) {
			num[i] = sc.nextInt();
		}
		int len = num.length;
		int sum = 0;
		for(int i=0; i<10; i++) {
			sum += num[i];
		}
		float avg = (float)sum/len;       //explicit type casting 
		System.out.println("Average: " + avg);
		*/
		
		
		
		
		
		// 17.Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements of array: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int even_sum = 0;
		int odd_sum = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				even_sum += arr[i];
			}else {
				odd_sum += arr[i];
			}
		}
		System.out.println("Even sum: " + even_sum);
		System.out.println("Odd sum: " + odd_sum);
		*/
		
		
		
		
			
		// 18.Determine and print the number of times the character ‘a’ appears in the input entered by the user.
		/*
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		//char ch = sc.next().charAt(0); //for any char input given by user
		int count = 0;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println("Frequency of 'a' is: " + count);
		*/
	
		
		
		
		
		// 19.Java program to check leap year or not
		/*
		System.out.print("Enter a year: ");
		 int year = sc.nextInt();
		 if(year%4 == 0 && year % 100 != 0 || year % 400 == 0) {
			 System.out.println("leap year");
		 }else {
			 System.out.println("not a leap year");
		 }
		*/
		
		
		
		
		
		// 20.Java Program to Find the Largest and Smallest Numbers From an Array of Random Numbers
		/*
		int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100); 
            System.out.println(arr[i] + " ");
        }

        Arrays.sort(arr);
        int n = arr.length;
        int largest_num = arr[n-1];
        int smallest_num = arr[0];
        System.out.println("largest num: " + largest_num);
        System.out.println("smallest num: "+ smallest_num);
        */
		
		
		
	sc.close();
	}
}
