import java.util.*;
class AddOfFrac 
{
static int lcm(int den1, int den2)
{
int max=den1*den2;
int i=Math.max(den1,den2);
int lcm=0
for(;i<=max;i++)
{
if(i%den1==0&&i%den2==0)
{
lcm=i;
break;
}
}
return lcm;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int den1=sc.nextInt();
int num2=sc.nextInt();
int den2=sc.nextInt();
ind add=0;
if(den1=den2)
{
add=(num1+num2)/den1;
}
else
{
int lcm=(den1,den2);
int fact1=lcm/den1;
int fact2=lcm/den2;
add=(num1*fact1+num2*fact2)/lcm;
}
System.out.println(add);
}
}