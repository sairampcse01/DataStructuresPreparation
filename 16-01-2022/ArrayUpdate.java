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
	System.out.println("enter index and element to be inserted");
	int index=sc.nextInt();
	int value=sc.nextInt();
	int temp;
for(int i=n-1;i>=index;i--){
    b[i+1]=b[i];
}
		b[index]=value;
		n=n+1;
	System.out.println("array elements after updation");
		for(int i=0;i<n;i++){
		    System.out.println(b[i]);
		}
	}
}
//input- n=5 values= 1 2 3 4 5
//index-2 value=9
//output values= 1 2 9 3 4 5
//time complexity=O(n-k)
//space complexity-O(n)
