import java.util.Scanner;

class click2
{
	public static void test(int y)
	{
		int a=1;
		int c=2;
		if(y==1 && y==2)
		{
			System.out.print(a);
		}
		else if(y==3)
		{
		 for(int i=2;i<=y;i++)
		 {
		 	System.out.print(a);
		 	a=a+c;
		 }
		 System.out.print(a);
		}
		else if(y>3)
		{
			for(int i=2;i<=y;i++)
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
class Click3
{
	public static void main(String[] args)
	{
		Scanner s2=new Scanner(System.in);
		System.out.print("Enter the value=");
		int y=s2.nextInt();
		click2.test(y);
	}
}
