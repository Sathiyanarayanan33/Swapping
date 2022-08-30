class Swapping{
 public static void main(String ar [])
{
 Swapping Swapp=new Swapping();
 Swapp.Withouttemp(5,10,15);
 Swapp.Withouttemp_1(5,10);
 Swapp.Withtemp();
 Swapp.Withtemp_1(5,10,15,0);
}
public void Withouttemp(int a, int b, int c)
{
  a=(a+b+c);
  b=a-(b+c);
  c=a-(b+c);
  a=a-(b+c);
 System.out.println("A Answer is"+a+ " B answer is"+b+"  C answer is"+c);
}

public void Withouttemp_1(int a, int b)
{
 a=a+b;
 b=a-b;
 a=a-b;
System.out.println("A Answer is"+a+ " B answer is"+b);
}

public void Withtemp()
{
 int a=5;
 int b=10;
 int t=0;
 t=a;
 a=b;
 b=t;
System.out.println("A Answer is"+a+ " B answer is"+b);
}

public void Withtemp_1(int a, int b, int c, int t)
{
 t=a;
 a=b;
 b=c;
 c=t;

System.out.println("A Answer is"+a+ " B answer is"+b+"  C answer is"+c);
}
}

