/////Sum of numbers in a given range
import java.util.*;
class SumInRange
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Start Range");
int start=sc.nextInt();
System.out.println("Enter the End Range");
int end=sc.nextInt();
int sum=0;
for(int i=start;i<=end;i++)
{
sum=sum+i;
}
System.out.println("Sum of numbers in a given range " + sum);
}
}