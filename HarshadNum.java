import java.util.*;
class HarshadNum  
{
static int sum(int n)
{
int sum=0;
while(n>0)
{
int r=n%10;
sum+=r;
n=n/10;
}
return sum;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=sum(n);
if(n%sum==0)
{
System.out.println("HarshadNum ");
}
else
{
System.out.println("Not HarshadNum ");
}

}
}