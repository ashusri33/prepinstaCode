import java.util.*;
class HCF 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int hcf=1;
int max=Math.max(n1,n2);
for(int i=1;i<max;i++)
{
if(n1%i==0&&n2%i==0)
{
hcf=i;
}
}
System.out.println(hcf);

}
}