import java.util.*;
public class Mergesort{
	public static void main(String[] args)
	{
		int min,loc;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}