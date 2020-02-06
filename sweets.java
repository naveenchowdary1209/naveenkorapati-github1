import java.util.Scanner;
class gift
{
int sw,cw,bw,num;
public void weight(int s,int c)
{
sw=s*2;
cw=c*2;
bw=sw+cw;
num=c+s;
}
}
class chocolates extends gift
{
public  void tw()
{
System.out.println("total weight of gift box="+bw);
}
}
class sweets extends gift
{
public void num()
{
System.out.println("total no of candies in box="+num);
}
class javex
{
public static void main(String args[]);
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the no of Sweets :");
int n1=sc.nextInt();
System.out.println("enter the no of  chocolates:");
int n2=sc.nextInt();
chocolates o1=new chocolates();
sweets o2=new sweets();
o1.weight(n1,n2);
o1.tw();
o2.weight(n1,n2);
o2.num();
}
}