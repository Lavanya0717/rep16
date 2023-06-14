class Add
{
int a=10;
int b=20;
void add()  // returntype methodname
{
int c=a+b;//10+20=30
System.out.println(" The Sum is : " + c );
return c;

}
public static void main(String as[])//jvm signature
{
Add a=new Add();//classname objname =new clsname();
a.add();
}
}
