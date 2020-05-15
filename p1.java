import java.util.Scanner;
class Calculator
{ 
  double c ;

  public void Cal(double a,double b,String str)
  {  
    if(str.contains("add"))
     {  c=a+b;
      System.out.println(c);
    }
    
    else if(str.contains("sub"))
    {
     c=a-b;
     System.out.println(c);
    }

   else if(str.contains("mul"))
   {
    c=a*b;
    System.out.println(c);
   }

  else if(str.contains("div"))
   {
    c=a/b;
    System.out.println(c);
   }
   else
   {
    System.out.println("invalid input");
   }
}
}

class Test
{
  public static void main(String [] args)
  {  Scanner s1 = new Scanner(System.in);
     System.out.println("enter value of a");
     double a = s1.nextDouble();
     System.out.println("enter value of b");
     double b= s1.nextDouble();
     System.out.println("give operation as 'add' for addition , 'sub' for substraction , 'mul' for multiplication , and 'div' for division (in lower case) ");
     String str = s1.next();


     Calculator c1 = new Calculator();
     c1.Cal(a,b,str);
     
     
     
   }
}   
