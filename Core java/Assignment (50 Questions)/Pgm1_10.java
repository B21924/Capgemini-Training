import java.util.*;

public class Pgm1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1.Check Two String which are reverse of each other or not.
		/*
		System.out.print("Enter string1: ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter string2: ");
		String str2 = sc.nextLine();
		
		String str_rev1 = "";

		for(int i = str1.length()-1; i >= 0; i--) {
			str_rev1 = str_rev1 + str1.charAt(i);
		}
		if(str2.equals(str_rev1)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}	
		*/
		
		
		
		
		
		// 2.Find the Smallest Sum of consecutive Number from given Array.
		/*
		System.out.print("Enter the size of array: ");
		int n = sc.nextInt();
		
		System.out.print("Enter the elements of the array: ");
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int min_sum = arr[0] + arr[1];
		
		for(int i= 0; i < n-1; i++) {
			int sum = arr[i]+arr[i+1];

			if(sum < min_sum) {
				min_sum = sum;
			}
		}
		System.out.print("min sum: " + min_sum);
		*/
		
		
		
		
		
		// 3.Find the Power without using math.pow function.
		/*
		System.out.print("Enter a base number: ");
		int n = sc.nextInt();
		
		System.out.print("Enter power: ");
		int pow = sc.nextInt();
		int res = 1;
		
		for(int i=0; i<pow; i++) {
			res *= n; 
		}
		System.out.print(n + "^" + pow + "->" + res);
		 */
		
		
		
		
		
		// 4.Find the negative Power without using math.pow function.Reverse the String with and without recursion
		/*
		System.out.print("Enter a base number: ");
		int n = sc.nextInt();
		
		System.out.print("Enter power: ");
		int power = sc.nextInt();
		int pow = Math.abs(power);
		double res = 1.0;
		
		for(int i=0; i<pow; i++) {
			res *= n;
		}
		if(power < 0) {
			res = 1 / res;
		}
		System.out.println("Negative power: " + res);
		
		
		
		//Reverse the String with and without recursion
		
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String rev = "";
		for(int i=str.length()-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("reversed string: " + rev);
		
		
		
		//Reverse the string with recursion
		static String reverse(String str) {
		if(str.isEmpty()) {
			return str;
		}
			return reverse(str.substring(1)) + str.charAt(0);
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		String rev = reverse(str);
		System.out.println("Reversed string: " + rev);
	}
*/		
		
		
		
		
		
		//5. Find the unique Character in the String
		/*
		String str=sc.nextLine();
        str = str.replaceAll("\\s+", "");
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
        */
		
		
		
		
		
		//6. Print the repeated characters in a String
		/*
		String str=sc.nextLine();
		str=str.replaceAll("\\s+","");
		str=str.toLowerCase();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			boolean printed = false;
			for(int j=0;j<arr.length;j++) {
				if (arr[i]==arr[j]){
					count++;
				}
			}
			for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    printed = true;
                    break;
                }
            }
            if (count > 1 && !printed) {
                System.out.println(arr[i]);
            }
		}
		*/
		
		
		
		
		
		//7. How many times a particular character is repeated in a string
		/*
		String str = sc.nextLine();
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + " -> " + freq[i]);
            }
        }
		*/
		
		
		
		
		
		//8. Count the no of vowels and constants in a string
		/*
		System.out.print("Enter a string: ");
		String Str = sc.nextLine();
		String s = Str.toLowerCase();
		int vow_count = 0;
		int cons_count = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z') {
				if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ) {
					vow_count++;
				}else {
					cons_count++;
				}
			}
		}
		System.out.println("vowels count: " + vow_count);
		System.out.println("consonants count: " + cons_count);
		*/
		
		
		
		
		
		//9. Convert a String into integer?
		/*
		String str=sc.nextLine();
 		int num=Integer.parseInt(str);
		System.out.println(num);
		*/
		
		
		
		
		
		//10. Write a program to find the difference between equals and ==
		/*
		String s1 = new String("Java");
        String s2 = new String("Java");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "Java";
        String s4 = "Java";

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
		*/
		
		
		
		
		
	sc.close();	
	}
}

