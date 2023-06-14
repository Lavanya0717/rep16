class Add2
{
int a=10;
int b=20;
int add()
{
int c=a+b;
return c;
//System.out.println(" add method value" + c );
}
public static void main(String as[])
{
Add2 a1=new Add2();//jvm will itself will create a default cons for your cls
//int d=a1.add();
System.out.println((a1.add()));
//System.out.println(" The sum is : " + d);
}
}


/*class Add3
{
int sum(int a,int b)
{
return a+b;
}
}
class Add2
{
public static void main(String as[])
{
Add3 obj=new Add3();
int res=obj.sum(6,7);
System.out.println(res);
}}*/