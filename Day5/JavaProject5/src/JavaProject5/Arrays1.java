package JavaProject5;
import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array ");
		int n=sc.nextInt();
		System.out.println("enter the eleement of array");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);

		}
	}

}
