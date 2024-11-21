import java.util.Scanner;
class Rectangle
{
   int l,b,a;
   Rectangle(int x,int y)
   {
      l=x;
      b=y;
   }
   void compute()
   {
      a=l*b;
      System.out.println("Area of rectangle="+a);
   }
   public static void main(String args[])
   {
      Rectangle r1=new Rectangle(2,3);
      Rectangle r1=new Rectangle();
      r1.compute();
   }
}