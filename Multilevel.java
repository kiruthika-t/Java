class One 
{
  int x,y;
  void input()
  {
    x=10;
    y=20;
  }
}
class Two extends One 
{
  int z;
  void get()
  {
    z=30;
  }
}
class Three extends Two
{
  int sum;
  void compute()
  {
    sum=x+y+z;
    System.out.println("Sum of three="+sum);
  }
}
public class last
{
  public static void main(String args[])
  {
    Three t1=new Three();
    t1.input();
    t1.get();
    t1.compute();
  }
}