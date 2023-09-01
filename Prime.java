import java.util.*;
class PrimeRange   
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int c=0;
int sum=0;
for(int i=2;i<=n;i++)
{
sum=sum+1;
 if(n%i==0)
{
   c++;
}
 else if(c>1)
{  
 System.out.println("Not prime");
} 
else 
{ 
  System.out.println("prime");
}
}
System.out.println(sum);
}
}