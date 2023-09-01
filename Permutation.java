import java.util.*;
class Permutation 
{
static int factorial(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
fact=fact*i;

return fact;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int r=sc.nextInt();
int factn=factorial(n);
int factnr=factorial(n-r);
int p=fact/factnr;
System.out.println(p);
}
}