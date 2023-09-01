import java.util.*;
class OctalToDecimal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int decimal=0,c=0;
while(n>0)
{
int r=n%10;
decimal=decimal+r*(int)Math.pow(8,c);
n=n/10;
c++;
}
System.out.println(decimal);
}
}