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
		int max=a[0];
		for(int i=1;i<n;i++){
		    if(a[i]>max){
		        max=a[i];
		    }
		}
		int[] c=new int[max+1];
		int count;
		for(int i=0;i<=max;i++){
		    count=0;
		    for(int j=0;j<n;j++){
		        if(i==a[j]){
		            count=count+1;
		        }
		    }
		    c[i]=count;
		}
		for(int i=1;i<max;i++){
		    c[i+1]=c[i]+c[i+1];
		}
		int[] q=new int[max+1];
			for(int i=1;i<=max;i++){
		    q[i]=c[i-1];
		}
			System.out.println("array elements are");

			for(int i=0;i<=max;i++){
		    System.out.println(q[i]);
		}
		int[] b=new int[n];
		
		    for(int j=0;j<=max;j++){
		        for(int i=0;i<n;i++){
		            if(j==a[i]){
		                b[q[j]]=a[i];
		                q[j]=q[j]+1;
		            }
		    }
		}
				System.out.println("array elements are");

			for(int i=0;i<n;i++){
		    System.out.println(b[i]);
		}
		
	}
}

//complexity- O(n+k)
