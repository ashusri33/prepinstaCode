import java.util.*;
class Quadrant 
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
if(x>0&&y>0)
System.out.println("1 Quadrant");
else if(x<0&&y>0)
System.out.println("2 Quadrant");
else if(x<0&&y<0)
System.out.println("3 Quadrant");
else if(x>0&&y<0)
System.out.println("4 Quadrant");

}
}