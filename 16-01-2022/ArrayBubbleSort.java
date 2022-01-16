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
		int temp;
for(int i=0;i<n-1;i++){
    if(a[i]>a[i+1]){
        temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
    }
}
	System.out.println("array elements bubble sorted");
		for(int i=0;i<n;i++){
		    System.out.println(a[i]);
		}
		
		
	}
}
//complexity-O(n)
