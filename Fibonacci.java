import java.util.*;
class Fibonacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int nterm=sc.nextInt();
int a=0,b=1;
int nextTerm=0;
for(int i=2;i<nterm;i++)
{
nextTerm=a+b;
a=b;
b=nextTerm;
System.out.println(nextTerm);
}


}
}