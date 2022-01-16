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
		for(int i=n-1;i>=0;i--){
		    b[i+1]=b[i];
		}
		System.out.println("insert element at begining");
		b[0]=sc.nextInt();
			System.out.println("array elements after begining insertion");
		for(int i=0;i<b.length;i++){
		    System.out.println(b[i]);
		}
		n=n+1;
			System.out.println("insert element at end");
			b[n]=sc.nextInt();
				System.out.println("array elements after ending insertion");
		for(int i=0;i<b.length;i++){
		    System.out.println(b[i]);
		}
		n=n+1;
			System.out.println("array length after 2 operations is"+n);
	}
}
//Space complexity-O(n)
//Time complexity-O(n)
