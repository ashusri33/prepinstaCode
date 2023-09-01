import java.util.*;
class DecimalToOctal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str="";
while(n!=0)
{
int r=n%8;
str=r+str;
n=n/8;
}


System.out.println(str);
}
}