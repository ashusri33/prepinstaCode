import java.util.*;
class Palindrome  
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int copy=n,rev=0;
while(n>0)
{
int r=n%10;
rev=rev*10+r;
n=n/10;
}
if(rev==copy)
{
System.out.println("Palindrome");
}
else
{
System.out.println(" Not Palindrome");
}
}
}