import java.lang.*;
/*class Add1
{
int a=10;
int b=20;
int add()
{
int c=a+b;

//System.out.println(" add method value =" + " " +c );
return c;

}
public static void main(String as[])
{
Add1 a=new Add1();//clsname objname=new clsname();
//int re=a.add();//objname.methodname();
//System.out.println(" The sum is : " + re);
System.out.println((a.add()));
}
}*/

class Sum
{
int a;
int b;
int add(int d,int e)
{
a=d;
b=e;
int c=a+b;
return c;
}
public static void main(String as[])
{
Sum s=new Sum();
int re=s.add(5,5);
System.out.println(re);
}
}



