import java.util.*;
public class Tsort{
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
		for(int i=0;i<n;i+=3)
		{
			for(int j=i;j<i+2;j++)
			{
				min=arr[j];
				loc=j;
				for(int k=j+1;k<i+3;k++)
				{
				if(arr[k]<min)
				{
					loc=k;
					min=arr[k];
				}
				}
				if(loc!=j)
				{
					arr[loc]=arr[j];
					arr[j]=min;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
					
}