//import java.util.
import java.util.Scanner;
import java.util.Math;
class PerfectSqrt  
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
double x=Math.sqrt(n);
if(n==(x*x))
{
System.out.println("Perfect Square");
}
else
{
System.out.println("Not Perfect Square");
}

}
}