import java.util.*;
class Strong
{
static int fact(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
return fact;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,copy=n;
while(n>0)
{
int r=n%10;
sum=sum+fact(r);
n=n/10;
}
if(copy==sum)
{
System.out.println("Strong No.");
}
else
{
System.out.println("Strong No.");
}


}
}