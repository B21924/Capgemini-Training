import java.util.*;

public class pgm31_40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//31. Armstrong number in a given range
		/*
		System.out.print("Enter the start range: ");
		int start = sc.nextInt();
		System.out.print("Enter the end range: ");
        int end = sc.nextInt();
        for (int num = start; num <= end; num++) {
            int temp = num;
            int digits = 0;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }
            temp = num;
            int sum = 0;
            while (temp != 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }
            if (sum == num) {
                System.out.println(num);
            }
        }
        */
		
		
		
		
		
		// 32.Calculate the number of digits in an integer.
		/*
		System.out.print("Enter a number: ");
		String number = sc.nextLine();
		System.out.println("Number of digits in the number: " + number.length());
		*/

					//(OR)
		
		/*
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
		
		if(num == 0){
			count = 1;
		}else{
        	while (num != 0) {
            	num = num / 10;
            	count++;
            }
        }

        System.out.println("Number of digits: " + count);
		*/
		
		
		
		
		
		// 33.Find Smallest and largest number from Array
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int smallest = arr[0];
		int largest = arr[n-1];
		System.out.println("Smallest number: " + smallest);
		System.out.println("Largest number: " + largest);
		*/
		
		
		
		
		
		// 34.Find Number of even and odd elements from Array.
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int even_count = 0;
		int odd_count = 0;
		for(int i=0; i<n; i++) {
			if(arr[i] % 2 == 0) {
				even_count++;
			}else {
				odd_count++;
			}
		}
		System.out.println("Total even elements in the array: " + even_count);
		System.out.println("Total odd elements in the array: " + odd_count);
		*/
		
		
		
		
		
		//35. Rotation of elements of array-left and right.
		//left rotation
		/*
		int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = arr[(i + k) % n];
        }

        System.out.println(Arrays.toString(res));
        */
        
        //right rotation
		/*
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = arr[i];
        }

        System.out.println(Arrays.toString(res));
        */
        
        
        
		
		
		//36. Find length of string without using function.
		/*
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		int count = 0;
		char[] arr = str.toCharArray();
		for(int i=0; i<arr.length; i++) {
			count++;
		}
		System.out.println("Length of the string: " + count);
		*/
		
		
		
		
		
		// 37.Remove spaces from string.
		/*
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.replace(" ", "");
		System.out.print("modified str: " + str);
		*/
		
		
		
		
		
		// 38. Check if given string is Palindrome or not.
		/*
		System.out.print("Enter a string: ");
		String s = sc.nextLine();
		String str = s.toLowerCase();
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		if(str.equals(rev)) {
			System.out.print("Palindrome");
		}else{
			System.out.print("Not Palindrome");
		}
		*/
		
		
		
		
		
		// 39.Capitalize the first and last character of each word of String.
		/*
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String[] words = str.split("\\s+");
		String res = "";
		for(int i=0; i<words.length; i++) {
			String word = words[i];
			if(word.length() == 1){
				res += word.toUpperCase() + " ";
			}else {
				char first = Character.toUpperCase(word.charAt(0));
				char last = Character.toUpperCase(word.charAt(word.length()-1));
				String middle = word.substring(1, word.length() - 1);
				res = res + first + middle + last + " ";
			}
			
		}
		System.out.println("Modified string is: " + res);
		*/
		
		
		
		
		
		//40. Find a greatest pair from Array.
		/*
		int[] arr = {2, 9, 1, 7, 5, 10};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        System.out.println(max1 + " " + max2);
        */
		
		
		
		
		
	sc.close();
	}
}

