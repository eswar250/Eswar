class ThNm
{
int a=10,b=20,c=30;
void avg()
{
int Sum=a+b+c;
System.out.println("the Sum is :"+Sum);
int avg=Sum/3;
System.out.println("The average Three numbers is :"+avg);
}
public static void main(String args[])
{
ThNm b=new ThNm();
b.avg();
}
}