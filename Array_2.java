import java.util.Scanner;
public class Array_2
{
	public static void main(String [] args)
	{
		int n,i,a;
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter length of array:");
		n=Scan.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element");
		for (i=0;i<n;i++)
		{
			a[i]=Scan.nextInt();
		}
		System.out.print("10 nos are");
		for (i=0; i<n; i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.print("Element want to find occurence");
		x=Scan.nextInt();
		for(i=0; i<n; i++)
		{
			if(a[i]==x)
			{
				count++;
			}
		System.out.println("no of occurence:"+count);
	}
        
}