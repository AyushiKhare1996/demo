import java.util.Scanner;

class Click
{
 public static void test(int y)
 {
 	int a=1;
 	int c=2;

 	if(y==1)
 	{
 		System.out.print(a);
 	}
 	else if(y==2)
 	{
 		for(int i=1;i<=y;i++)
 		{
 			System.out.print(a);
 			a=a+c;
 		}
 		System.out.print(a);
 	}
 	else if(y>2)
 	{
 		for(int i=1;i<=y;i++)
 		{
 			System.out.print(a);
 			a=a+c;
 		}
 		System.out.print(a);
 	}
 	else
 	{
      System.out.print(c);
 	}
 }
}
class Click1
{
 public static void main(String[] args)
 {
	Scanner s2=new Scanner(System.in);
	System.out.print("ENTER THE NUMBER= ");
	int y=s2.nextInt();
	Click.test(y);
  }
}
