import java.util.*;
public class reverseArray
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n =sc.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[n];
	    int j=0;
	    for(int i =0;i<n;i++)
	    {
	        a[i]=sc.nextInt();
	    }
	    for(int i =n-1;i>=0;i--)
	    {
	        b[j]=a[i];
	        j++;
	    }
	    for(int i =0;i<n;i++)
	    {
	        System.out.print(b[i]+" "+"my name");
	    }
		System.out.print(" completed ");
	}
}
