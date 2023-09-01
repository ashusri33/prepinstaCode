import java.util.*;
class DecimalToHexa
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
String str="";
String hex="0123456789ABCDEF";
while(n!=0)
{
int r=n%16;
str=hex.charAt(r)+str;
n=n/16;
}


System.out.println(str);
}
}