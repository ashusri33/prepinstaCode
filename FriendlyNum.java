import java.util.*;
class FriendlyNum  
{
static int factSum(int n)
{
int sum=0;
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
{
sum+=i;
}
}
return sum;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int factn1=factSum(n1);
int factn2=factSum(n2);
int r1=factn1/n1;
int r2=factn2/n2;
if(r1==r2)
{
System.out.println("FriendlyNum ");
}
else
{
System.out.println("not FriendlyNum");
}

}
}