import java.util.Scanner;

public class Left_Rotation {

		// Left Rotation | HackerRank 

		public static void main(String[] args) {
			
			
			Scanner in = new Scanner(System.in);
			
			// For giving Array Input
			
			int n = in.nextInt(); // taking input for no. of elements in array
	        
			int arr[] = new int[n]; //array of size n
	        
			for(int i=0; i<n; i++){
				
				// loop to take input of all elements
	            arr[i] = in.nextInt();
	        }
			
			
			System.out.print("enter number of rotation: ");
			int r = in.nextInt();// input of number of rotations
			
			int one = 0;
			
			for(int i=r;i<arr.length;i++) {
				
				// Loop to get no. that are not rotated, eg- 12345 --> we get 345 if rotated 2 times
				one = arr[i];
				System.out.print(one+" ");
			}
			
			int n1 =0;
			for(int i=0; i<r;i++) {
				// Loop to get no. that are rotated, eg- 12345 --> we get 12 if rotated 2 times
				    n1 = arr[i];
				System.out.print(n1 + " ");
			}
			
			
			// After coming out of both the loops we get --> 34512 if rotated 2 times
			
			
	}

}
