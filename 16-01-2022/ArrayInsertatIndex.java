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
		int[] b=new int[n*2];
		for(int i=0;i<n;i++){
		    b[i]=a[i];
		}

			System.out.println("enter element to be inserted");
			int val=sc.nextInt();
			System.out.println("enter index");
			int index=sc.nextInt();
			for(int i=n-1;i>=index;i--){
			    b[i+1]=b[i];
			}
			b[index]=val;
			n=n+1;
				System.out.println("array elements are");
		for(int i=0;i<n;i++){
		    System.out.println(b[i]);
		}
	}
}


//input- size=3 values= 1 2 3 
//output- 1 2 3
//input- value- 5 index-2
//output- 1 2 5 3
//length-4
//time complexity-O(n-index)
//space complexity-O(n)
