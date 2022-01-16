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
		System.out.println("Deletion at end");
		a[n-1]=0;
			for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
			System.out.println("Deletion at start");
	a[0]=0;
			for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
	}
}
//input- n=5,values- 1 2 3 4 5
//del at start output- 0 2 3 4 5
//del at end output- 0 2 3 4 0
//time complexity- O(1)
//space complexity- O(1)
