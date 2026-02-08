import java.util.*;


public class pgm21_30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 21. Printing only not-repeated digits in the array.
		/*
		int n=sc.nextInt();
        int[] arr = new int[n];
        for(int p=0;p<=n-1;p++) {
        	arr[p]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(arr[i] + " ");
            }
        }
        */
        
        
        
        
        
        // 22.Printing Second largest no. in the array.
		/*
		System.out.print("Enter the size of the array: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements of the array: ");
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print("second largest num: " + arr[n-2]);
		*/
		
		
		
		
		
		//23. Sorting the array without using built in sort methods. 4. Copy all the elements from one array to another array.
		/*
		System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] > arr1[j]) {
                    int temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = arr1[i];
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\nCopied array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + " ");
        }
        */
		
		
		
		
		
		//24. Printing Odd and Even no. from the array
		/*
		int n=sc.nextInt();
        int[] arr = new int[n];
        for(int p=0;p<=n-1;p++) {
        	arr[p]=sc.nextInt();
        }

        for (int i : arr) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }

        System.out.println();

        for (int i : arr) {
            if (i % 2 != 0)
                System.out.print(i + " ");
        }
        */
		
		
		
		
		
		//25. Merging 2 array into one array.
		/*
		System.out.println("Enter the size of array1: ");
    	int n=sc.nextInt();
    	System.out.println("Enter the elements of array1: ");
        int[] a = new int[n];
        for(int p=0;p<=n-1;p++) {
        	a[p]=sc.nextInt();
        }
    	System.out.println("Enter the size of array2: ");
        int m=sc.nextInt();
    	System.out.println("Enter the elements of array2: ");
        int[] b = new int[m];
        for(int q=0;q<=m-1;q++) {
        	b[q]=sc.nextInt();
        }

        int[] c = new int[a.length + b.length];
        int k = 0;

        for (int i : a)
            c[k++] = i;

        for (int i : b)
            c[k++] = i;

        for (int i : c)
            System.out.print(i + " ");
        */
		
		
		
		
		
		//26. Finding Prime Factors of a number
		/*
		int n = sc.nextInt();
		for (int i = 2; i <= n; i++) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n = n / i;
				}
			}
		*/
		
		
		
		
		
		//27. Find Prime number within a given range or between two numbers.
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		for (int i = a; i <= b; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
		         }
			if (count == 2)
				System.out.print(i + " ");
		}
		
		
		
		
		
		
		//28. Find Strong number 
		/*
		int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            int fact = 1;
            for (int i = 1; i <= d; i++)
                fact *= i;
            sum += fact;
            n = n / 10;
        }

        System.out.println(sum == temp);
		*/
		
		
		
		
		
		//29. Find Perfect number
		/*
		int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum += i;
        }

        System.out.println(sum == n);
		*/
		
		
		
		
		
		//30. Check Armstrong number.
		/*
		int num = sc.nextInt();
		int digits = 0;
		int original = num;
		int sum = 0;
     
		int temp = num;
		while(temp>0){
			digits++;
			temp = temp/10;
		}
     
		temp = num;
		while(temp>0){
			int digit = temp % 10;
			sum += Math.pow(digit, digits);
			temp = temp/10;
		}
		if(sum==num){
			System.out.print("Armstrong number");
		}else{
			System.out.print("Not armstrong number");
		}
		*/
      
      
      
      

	sc.close();
	}

}
