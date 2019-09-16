import java.util.*;
public class Sort{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
for(int i=0;i<arr.length;i++)
{
  arr[i]=sc.nextInt();
}
for(int i=0;i<arr.length;i++)
{
int loc=i;
int min=arr[i];
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]<min)
{
min=arr[j];
loc=j;
}
}
if(loc!=i)
{
int temp=arr[loc];
arr[loc]=arr[i];
arr[i]=temp;
}
}
for(int i=0;i<arr.length;i++)
{
 System.out.print(arr[i]);	
}
}}