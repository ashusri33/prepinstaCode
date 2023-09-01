import java.util.*;
class LCM 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int lcm=0;
int max=Math.max(n1,n2);
for(int i=max;i<=n1*n2;i++)
{
if(i%n1==0&&i%n2==0)
{
lcm=i;
break;
}
}
System.out.println(lcm);

}
}