import java.util.*;
class PrimeRange   
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
while(a<=b)
{
  int c=0;
  for(int i=1;i<=a;i++)
  {
    if(a%i==0)
      c++;
  }
  if(c==2)
  {
    System.out.println(a);
  }
  a++;
}


}
}