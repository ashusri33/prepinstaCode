import java.util.*;
class OctalToBinary
{
static int octalToDecimal(int n)
{
int decimal=0,c=0;
while(n>0)
{
int r=n%10;
decimal=decimal+r*(int)Math.pow(8,c);
n=n/10;
c++;
}
return decimal;
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int decimal=octalToDecimal(n);
System.out.println(decimal);
//decimaltoOctal
String str="";
while(decimal!=0)
{
int r=decimal%2;
str=r+str;
decimal=decimal/2;
}

System.out.println(str);
}
}