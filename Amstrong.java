import java.util.*;
class Amstrong  
{
static int count(int n)
{
int c=0;
while(n>0)
{
int r=n%10;
c++;
n=n/10;
}
return c;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int pow=count(n);
int sum=0,copy=n;
while(n>0)
{
int r=n%10;
sum=sum+(int)Math.pow(r,pow);
n=n/10;
}
if(sum==copy)
{
System.out.println("Amstrong");
}
else
{
System.out.println(" Not Amstrong");
}
}
}