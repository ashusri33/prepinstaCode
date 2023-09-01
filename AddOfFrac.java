import java.util.*;
class AddOfFrac 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int den1=sc.nextInt();
int num2=sc.nextInt();
int den2=sc.nextInt();
int num=0,den;
if(den1==den2)
{
num=num1+num2;
den=den1;
}
else
{
num=(num1*den2+num2*den1);
den=den1*den2;
}
int min=Math.min(num,den);
for(int i=min/2;i>=1;i--)
{
if(num%i==0&&den%i==0)
{
num=num/i;
den=den/i;
}
}

System.out.println(num);
System.out.println(den);
}
}