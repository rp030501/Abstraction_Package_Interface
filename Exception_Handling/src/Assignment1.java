import java.util.InputMismatchException;
import java.util.Scanner;
public class Assignment1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n=sc.nextInt();
		System.out.println("Enter the elements in the array");
		int arr[]= new int[n];
		try {
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the index of the array element that you want to access = 1");
			int index=sc.nextInt();
			System.out.println(arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		catch(InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}

	}
}
