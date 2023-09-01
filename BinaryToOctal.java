import java.util.*;
class BinaryToOctal
{
static int binaryToDecimal(int n)
{
int decimal=0,c=0;
while(n>0)
{
int r=n%10;
decimal=decimal+r*(int)Math.pow(2,c);
n=n/10;
c++;
}
return decimal;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int decimal=binaryToDecimal(n);
System.out.println(decimal);
//decimaltoOctal
String str="";
while(decimal!=0)
{
int r=decimal%8;
str=r+str;
decimal=decimal/8;
}
System.out.println(str);
}
}