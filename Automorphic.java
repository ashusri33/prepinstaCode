import java.util.*;
class AutomorphicNum 
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
int digit=count(n);
int pow=(int)Math.pow(10,digit);
int x=(int)Math.pow(n,2);
int r=x%pow;
if(n==r)
{
System.out.println("Perfect Square");
}
else
{
System.out.println("Not Perfect Square");
}

}
}