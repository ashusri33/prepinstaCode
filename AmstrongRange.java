import java.util.*;
class AmstrongRange  
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
int a=sc.nextInt();
int b=sc.nextInt();
for(int n=a;n<=b;n++)
{
int pow=count(n);
int sum=0,copy=n;
while(copy>0)
{
int r=copy%10;
sum=sum+(int)Math.pow(r,pow);
copy=copy/10;
}
if(sum==n)
{
System.out.println(n);
}
}



}
}