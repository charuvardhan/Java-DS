import java.util.*
public static sort{
public static void main(String[] args);
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<5;i++)
{
  arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length-1;i++)
{
loc=i;
min=arr[i];
for(int j=i+1;j<=arr.length-1;j++)
{
if(arr[j]<min)
{
min=arr[j];
loc=j;
}}
if(loc!=i)
{
int temp=arr[loc];
arr[loc]=arr[i];
arr[i]=temp;
}
}
for(int i=0;i<5;i++)
{
 System.out.println(arr[i]);	
}
}