import java.util.*;
class HexaToDecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String hex=sc.next();
int decimal=0,c=0;
String str="0123456789ABCDEF";
hex=hex.toUpperCase();
for(int i=hex.length()-1;i>=0;i--)
{
char ch=hex.charAt(i);
int digit=str.indexOf(ch);
decimal=decimal+digit*(int)Math.pow(16,c);
c++;
}
System.out.println(decimal);
}
}