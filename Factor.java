import java.util.*;
class Factor
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n/2;i++)
if(n%i==0)
System.out.println(i);



}
}