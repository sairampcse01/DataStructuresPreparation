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
		System.out.println("***Linear Search*** enter element to search");
		int ele=sc.nextInt();
		for(int i=0;i<n;i++){
		    if(a[i]==ele){
		        System.out.println("element"+ele+"found at"+i+1);
		        break;
		    }
		}
				System.out.println("***binary search***");
		int start=0,end=n-1,mid=(start+end)/2;
		if(mid<ele){
		    start=mid+1;
		    end=n-1;
		}
		if(mid>ele){
		    start=0;
		    end=mid-1;
		}
		for(int i=start;i<end;i++){
		      if(a[i]==ele){
		        System.out.println("element"+ele+"found at"+i+1);
		        break;
		    }
		}
		
	}
}
//time-complexity-O(n)(linear Search) O(logn)(binary search)
