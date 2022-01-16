import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("enter array elements");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
			System.out.println("array elements are");
		for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
		System.out.println("enter index of element to be deleted");
		int k=sc.nextInt();
	for(int i=k;i<n-1;i++){
	    a[i]=a[i+1];
	}
	a[n-1]=0;
			System.out.println("array elements after deletion are");
		for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
	}
}
//input n=5, values 1 2 3 4 5
//del at 4 , output= 1 2 3 5 0
//time complexity=O(n-k)
//space complexity-O(1)
