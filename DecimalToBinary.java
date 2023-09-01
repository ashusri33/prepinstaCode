import java.util.*;
class DecimalToBinary
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str="";
while(n!=0)
{
int r=n%2;
str=r+str;
n=n/2;
}


System.out.println(str);
}
}