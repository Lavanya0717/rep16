class A
{
int id;
int mark;
static void m1()
{
A obj=new A();
obj.id=12;
obj.mark=99;

}
public static void main(String as[])
{
A.m1();
System.out.println( id + mark );
}}